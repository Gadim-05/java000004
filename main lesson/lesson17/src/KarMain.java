public class KarMain {
    public static void main(String[] args) {
        KorKirpiler kkkyk = new KorKirpiler();

        Thread thread1 = new Thread(()-> kkkyk.printWords("Getdim bir 2 kor yırtıq var kar kurku kirpi kar kurku kirpinin yamamaqdansa kar kurku kirpi kar kurku kirpinin yamayir".split(" "),1));
        Thread thread2 = new Thread(()->kkkyk.printWords("gördüm dərədə kar kürkü kirpi disi kor yirtiq erkek kor yirtiq kurkunu erkek kor yirtiq disi kor yirtiq kurkunu ".split(" "), 2));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Nagilimiz sona catdi");
    }
}
