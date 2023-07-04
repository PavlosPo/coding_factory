package gr.aueb.cf.ch19.sorting;

import gr.aueb.cf.ch19.DoublyLinkedList;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Oranges", 8.5, 10),
                new Product("Milk", 2.5, 5),
                new Product("Honey", 12.5, 115),
                new Product("Apples", 5.5, 8),
                new Product("Honey", 3.5, 25)));

        List<Product> newProducts = Arrays.asList(new Product("Oranges", 8.5, 10),
                new Product("Milk", 2.5, 5),
                new Product("Honey", 12.5, 115),
                new Product("Apples", 5.5, 8),
                new Product("Honey", 3.5, 25));

        List<String> productDescriptions = products.stream()
                .filter(p -> p.getQuantity() >= 1)
                .map(Product::getDescription)
                .sorted()
                .collect(Collectors.toList());

        Set<String> cities = new HashSet<>(List.of("Athens", "Berlin", "Moscow"));

        Set<String> nonGreekCities = cities.stream()
                .filter(city -> !city.equals("Athens"))
                .sorted()
                .collect(Collectors.toCollection(TreeSet::new));    // creates a new TreeSet

        // Map
        List<Product> updatedProductPrices = products.stream()
                        .map(p-> new Product(p.getDescription(), p.getPrice() + p.getPrice() * 0.10, p.getQuantity()))
                        .collect(Collectors.toList());

        int sumOfQuantities = products.stream()
                        .filter(p -> p.getDescription().equals("Apples"))
                        .reduce(0, (total, e) -> total + e.getQuantity(), Integer::sum);

        int sumOfQuantities2 = products.stream()
                        .filter(pro -> pro.getDescription().equals("Apples"))
                        .mapToInt(Product::getQuantity)
                        .sum();



        Collections.sort(products); // if products.compareTo() exists.
        products.forEach(System.out::println);

        Collections.reverse(products);

        products.forEach(System.out::println);

        // Need Comparable Classes -> Comparable Interface implemented.
        Collections.sort(products, Comparator.naturalOrder());

        products.sort(Comparator.naturalOrder());

        products.sort(Comparator.reverseOrder());

        products.sort(Comparator.comparing(Product::getDescription)); // or lambda: product -> product.getDescription()

        products.forEach(System.out::println);

        // if price is same, then start comparing with Quantity
        // we can do all this with Comparator class, because we have the Products as a Comparable Class.
        products.sort(Comparator.comparing(Product::getPrice).thenComparing(Product::getQuantity).reversed());

        products.sort(Comparator.comparing(Product::getDescription)
                .thenComparing(Product::getPrice, (a1, a2) -> Double.compare(a2, a1))
                .thenComparing(Product::getQuantity));

        // functional programming
        List<Product> lengthFiltered = products.stream()
                .filter(item -> item.getDescription().length() <= 5)    // predicate
                .collect(Collectors.toList());      // terminal method ~ make the stream to List again

        lengthFiltered.forEach(System.out::println);

        List<Product> applesList = products.stream()
                .filter(product -> product.getDescription().equals("Apples"))
                .sorted(Comparator.comparingInt(Product::getQuantity))
                .collect(Collectors.toList());
    }
}
