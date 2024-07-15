public class KorKirpiler {

    int turn = 1;

    public synchronized void printWords(String[] words, int threadnumber){
        for (String word: words){
            while (turn!=threadnumber){
                try {
                    wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.print(word + " ");
            if (threadnumber == 1){
                turn = 2;
            }
            else {
                turn = 1;
            }
            notifyAll();
        }
    }




}
