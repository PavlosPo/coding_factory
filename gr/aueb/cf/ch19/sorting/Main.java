package gr.aueb.cf.ch19.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Oranges", 8.5, 10),
                new Product("Milk", 2.5, 5),
                new Product("Honey", 12.5, 115)));

        Collections.sort(products); // if products.compareTo() exists.
        products.forEach(System.out::println);

        Collections.reverse(products);
        products.forEach(System.out::println);
    }
}
