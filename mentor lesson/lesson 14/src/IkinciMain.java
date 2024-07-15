public class IkinciMain {
    public static void main(String[] args) {
        Thread oddThread = new OddNumm();
        Thread evenThread = new EvenNum();

       oddThread.start();
        evenThread.start();
//
//        oddThread.start();
//        try {
//            oddThread.join();  // Wait for the oddThread to finish
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        evenThread.start();
//        try {
//            evenThread.join();  // Wait for the evenThread to finish
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
