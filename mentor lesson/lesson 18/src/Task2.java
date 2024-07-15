import java.util.ArrayList;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {


        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        for (int i = nums.size()-1; i >= 0 ; i--) {
            System.out.print(nums.get(i) + " ");
        }

        if (nums.contains(30)){
            System.out.println("Element found");
        }
        else {
            System.out.println("Element not found");
        }

        nums.remove(3);

        nums.addFirst(60);

        nums.set(2,35);

        ArrayList<Integer> nums2 = new ArrayList<>();

        nums2.add(70);
        nums2.add(80);
        nums2.add(90);
        nums2.add(70);
        nums2.add(80);
        nums2.add(90);

        nums.addAll(nums2);

        Collections.sort(nums);
        System.out.println(nums);


        //task 3
        double sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            sum+=nums.get(i);
        }
        double average = sum/nums.size();

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
