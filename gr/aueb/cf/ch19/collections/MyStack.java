package gr.aueb.cf.ch19.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;

public class MyStack<T> {
    private final Deque<T> myStack = new ArrayDeque<>();

    public MyStack() {}

    public Deque<T> getMyStack() {
        return myStack;
    }

    public void push(T t) {
        myStack.push(t);
    }

    public T pop() {
        return  myStack.pop();
    }

    // Consumer is a Functional Interface
    public void forEach(Consumer<T> action) {
        // action -> lambda expression
        myStack.forEach(action);
    }

}
