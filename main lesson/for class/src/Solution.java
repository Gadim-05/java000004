import java.util.Arrays;
class Solution {
    public static int minEatingSpeed(int[] piles, int h) {

        Arrays.sort(piles);

        System.out.println(piles[0]);
        return 0;
    }

    public static void main(String[] args) {
        int[] pil = {7,2,5,3};
        minEatingSpeed(pil, 5);
    }
}