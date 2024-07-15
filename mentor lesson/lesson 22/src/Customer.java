import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Customer {

    String name;
    double budget;
    List<Product> basket;

    public Customer(String name, double budget) {
        this.name = name;
        this.budget = budget;
        this.basket = new ArrayList<>();
    }

    public void doShoppingIn(Supermarket store){
        List<Product> products = new ArrayList<>(store.products);
        products.sort(Comparator.comparing(p -> p.price));

        for (Product product : products) {
            while (product.amount > 0 && budget >= product.price) {
                basket.add(product);
                budget -= product.price;
                product.amount--;
            }
        }
    }
}
