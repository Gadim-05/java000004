public class  EvenOdd {


    int currentNumber = 1;
    final int MAX_NUMBER = 10000;

    public synchronized void printNumbers(int remainder) {
        while (currentNumber < MAX_NUMBER) {
            while (currentNumber % 2 != remainder) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


                if (remainder == 0) {
                    System.out.println("Even " + currentNumber);
                    currentNumber++;
                    notify();
                }
                else {
                    System.out.println("Odd " + currentNumber);
                    currentNumber++;
                    notify();
                }

        }
    }
}
