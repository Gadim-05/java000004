import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);


        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);


        Set<Integer> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);

        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        

//        Set<Integer> differenceSet1 = new HashSet<>(set1);
//        differenceSet1.removeAll(set2);
//
//        Set<Integer> differenceSet2 = new HashSet<>(set2);
//        differenceSet2.removeAll(set1);

        Set<Integer> dif =  new HashSet<>(unionSet);
        dif.removeAll(intersectSet);

        System.out.println("Intersection: " + intersectSet);

        System.out.println("Union: " + unionSet);

//        System.out.println("Difference 1: " + differenceSet1);
//
//        System.out.println("Difference 2: " + differenceSet2);
        System.out.println(dif);

    }
}