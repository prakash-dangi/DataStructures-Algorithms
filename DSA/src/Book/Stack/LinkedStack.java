package Book.Stack;

import Book.LinkedLists.LinkedList;

import java.util.EmptyStackException;

public class LinkedStack<T extends Comparable<T>> implements Stack<T> {
    private final LinkedList<T> list;

    public LinkedStack() {
        this.list = new LinkedList<>();
    }

    public void push(T item) {
        list.addStart(item);
    }

    public T pop() {
        if (list.isEmpty()) throw new EmptyStackException();
        return list.deleteAt(0);
    }

    public T peek() {
        if (list.isEmpty()) throw new EmptyStackException();
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
