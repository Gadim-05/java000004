import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Qedim", 18,1);
        Customer customer2 = new Customer("Teymur", 17, 2);
        Customer customer3 = new Customer("Bextiyar", 19, 3);

        List<Customer> customers = new ArrayList<>();

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        Collections.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getID() - o2.getID();
            }
        });

        for (Customer c : customers){
            System.out.println(c);
        }
    }
}