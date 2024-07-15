public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer("String Buffer numunesi");


        Thread thread1 = new Thread(new BufferTask(buffer));
        Thread thread2 = new Thread(new BufferTask(buffer));
        Thread thread3 = new Thread(new BufferTask(buffer));

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Netice " + buffer.toString());
    }
}