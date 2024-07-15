import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Supermarket {
    List<Product> products;

    public Supermarket() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product... products) {
        this.products.addAll(Arrays.asList(products));
    }

    public void removeProduct(long productId, double amount) {
        for (Product product : products) {
            if (product.id == productId) {
                product.amount -= amount;

            }
        }
    }
}

