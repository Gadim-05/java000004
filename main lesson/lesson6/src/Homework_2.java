public class Homework_2 {
    public static void main(String[] args) {
        int[] randoms = new int[10];

        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = (int) (Math.random()*10)+1;
            System.out.println(randoms[i] + " ");
        }
        int max = randoms[0];
        for (int i = 1; i < randoms.length ; i++) {
            max = Math.max(max, randoms[i]);
        }
        System.out.println("Maximum value: " + max);
    }
}
