package gr.aueb.cf.ch19.maps;

import gr.aueb.cf.ch19.sorting.Product;

import java.util.*;
import java.util.stream.Collectors;

public class MapDemo {

    public static void main(String[] args) {

        Map<String, String> countries = new HashMap<>() {{
            // input like that
            put("GR", "Greece");
            put("FR", "France");
            put("USA", "United States of America");
        }};

        // input like that
        countries.put("GR", "Greece");
        countries.put("FR", "France");
        countries.put("USA", "United States of America");

        Map<Integer, Product> products = new HashMap<>() {{
            put(1, new Product("Apples" , 10.5, 10));
            put(2, new Product("Oranges" , 8.5, 8));
            put(3, new Product("Milk" , 12.5, 15));
            put(4, new Product("Apples" , 5.5, 5));
        }};

        // dynamic filtering
        // hashmap strange
        Map<String, Object> criteria = new HashMap<>() {
            {
                put("description", "Oranges");
                put("price", 8.5);
            }
        };

        // get the criteria from criteria HashMap.
        String choice = products.values().stream()
                .filter(product -> product.getDescription().equals(criteria.get("description"))
                && (Double.compare(product.getPrice(), (double) criteria.get("price")) > 0))
                .map(Product::toString)
                .collect(Collectors.joining());

        System.out.printf("choice: " + choice);








        String strProducts = products.entrySet().stream()
                .filter(entry -> entry.getValue().getDescription().equals("Apples"))
                .map(Objects::toString)// We have overloaded the toString() in our class. but belongs to Object class.
                .collect(Collectors.joining());

        // loop with iterator
        Iterator<Map.Entry<String, String>> it = countries.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            if ( entry.getValue().equals("Greece")) {
                // safe delete
                // with iterator only!!!
                it.remove();
            }
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // enhanced for
        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // forEach
        countries.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
