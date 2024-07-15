public class CustomerMain {
    public static void main(String[] args) {

        Supermarket supermarket = new Supermarket();
        supermarket.addProduct(
                new Product(1, "Apple", 1.0, 5),
                new Product(2, "Banana", 0.5, 4),
                new Product(3, "Orange", 2.0, 5),
                new Product(4, "Grapes", 3.0, 15)
        );

        Customer customer = new Customer("John", 30.0);
        customer.doShoppingIn(supermarket);

        System.out.println("Customer's basket:");
        for (Product product : customer.basket) {
            System.out.println(product.name);
        }
    }
    }

