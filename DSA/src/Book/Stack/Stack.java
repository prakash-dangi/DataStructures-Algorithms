package Book.Stack;

import Book.LinkedLists.LinkedList;

import java.util.EmptyStackException;

public class Stack<T extends Comparable<T>> {
    private final int max;
    private final T[] stack;
    private final LinkedList<T> linkedStack;
    private int top;

    @SuppressWarnings("unchecked")
    public Stack(int max) {
        this.max = max;
        this.stack = (T[]) new Comparable[max];
        this.top = -1;
        this.linkedStack = null;
    }

    public Stack() {
        this.max = -1;
        this.stack = null;
        this.linkedStack = new LinkedList<>();
    }

    public void push(T item) {
        if (this.stack == null) {
            assert this.linkedStack != null;
            this.linkedStack.add(item);
        } else {
            if (this.top == max - 1) {
                throw new StackOverflowError();
            } else {
                this.top++;
                this.stack[top] = item;
            }
        }

    }

    public T pop() {
        T item;
        if (this.stack == null) {
            assert this.linkedStack != null;
            if ((item = this.linkedStack.deleteNode(-2)) != null) {
                return item;
            } else {
                throw new EmptyStackException();
            }
        } else {
            if (this.top == -1) {
                throw new EmptyStackException();
            } else {
                item = this.stack[top];
                this.top--;
                return item;
            }
        }
    }

    public T peek() {
        if (this.stack == null) {
            assert this.linkedStack != null;
            return this.linkedStack.deleteNode(-1);
        } else {
            if (this.top == -1) {
                throw new EmptyStackException();
            } else {
                return this.stack[top];
            }
        }
    }

    public boolean isEmpty() {
        if (this.stack == null) {
            assert linkedStack != null;
            try {
                this.linkedStack.deleteNode(-1);
            } catch (EmptyStackException e) {
                return true;
            }
            return false;
        } else {
            if (this.top == -1) {
                return true;
            } else {
                return false;
            }
        }
    }
}