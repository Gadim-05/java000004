public class Homework {
    int currentNumber = 1;
    final int maxNumber = 10;

    public synchronized void printNumbers() {
        while (currentNumber < maxNumber) {

                if (currentNumber % 2 == 0) {
                    System.out.println("Even " + currentNumber);
                    currentNumber++;
                    notify();
                } else {
                    System.out.println("Odd " + currentNumber);
                    currentNumber++;
                    notify();
                }


        }
    }
}
