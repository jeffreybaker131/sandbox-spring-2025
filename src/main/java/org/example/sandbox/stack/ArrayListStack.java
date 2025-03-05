package org.example.sandbox.stack;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStack<T> implements Stack<T> {

    private List<T> stack;

    public ArrayListStack() {
        this.stack = new ArrayList<>();
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public void push(T item) {

    }

    @Override
    public int search(T t) {
        return 0;
    }

}