package gr.aueb.cf.ch19.collections;

public class MyStackApp {

    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        int lastNum = myStack.pop();
        System.out.println("Last item: " + lastNum);

        // myStack.forEach(System.out::println);
        myStack.forEach((el) -> System.out.println(el));
    }
}
