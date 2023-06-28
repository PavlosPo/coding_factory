package gr.aueb.cf.ch19;

import java.util.List;

public class GenericMethodApp {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        printArr(arr);
    }

    public static <T> void printArr(T[] arr) {
        for (T item: arr) {
            System.out.println(item);
        }
    }
    // Number is down fragment
    // we can use extends also
    public static void print(NodeGeneric<? super Number> node) {
        System.out.println(node.getValue());
    }

    // PECS -- Producer-extends Consumer-super
    public static <T> void produceConsume(List<? super T> list, Iterable<? extends T> source) {
        for (T t : source) {
            list.add(t);
        }
    }
}
