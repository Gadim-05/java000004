import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//
//        List<String> input = Arrays.asList("hello", "worldi", "abcdefghijas", "12345678902", "shor");
//
//        List<String> b = input.stream()
//                .filter(a -> a.length()<=10)
//                .sorted(Comparator.comparing(String::length))
//                .collect(Collectors.toList());
//
//        System.out.println(b);

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3, 2, 8, 5);

        List<Integer> n = numbers.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(n);
//
//        Product product1 = new Product("Laptop", 999.99, "Electronics");
//        Product product2 = new Product("Smartphone", 599.99, "Electronics");
//        Product product3 = new Product("Desk chair", 149.99, "Furniture");
//        Product product4= new Product("Book", 9.99, "Books");
//        Product product5 = new Product("Headphones", 49.99, "Electronics");
//        Product product6 = new Product("Coffee Maker", 109.99, "Appliances");
//        Product product7 = new Product("Notebook", 1.99, "Stationery");
//
//        List<Product> products = Arrays.asList(product1,product2,product3,product4,product5,product6,product7);
//
//        List<Product> p = products.stream()
//                .filter(product -> product.getCategory().equals("Electronics"))
//                .sorted(Comparator.comparing(Product::getPrice))
//                .collect(Collectors.toList());
//
//        p.forEach(System.out::println);


    }
}