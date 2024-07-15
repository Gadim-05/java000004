public class FirstThread extends Thread{

    String name;

    public FirstThread(String name) {
        this.name = name;

    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i+=2) {
            System.out.println(name + " " + i);
            try {
                Thread.sleep(100);
            }catch (Exception e){
                e.getStackTrace();
            }
        }
    }
}
