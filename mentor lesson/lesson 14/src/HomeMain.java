public class HomeMain {


    public static void main(String[] args) {
        Homework hw = new Homework();

        Thread thOdd = new Thread(()->  hw.printNumbers());
        Thread thEven = new Thread(()-> hw.printNumbers());



        thOdd.start();
        try {
            thOdd.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        thEven.start();
        try {
            thEven.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
