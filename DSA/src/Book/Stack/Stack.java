package Book.Stack;

import Book.LinkedLists.LinkedList;

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
                System.out.println("Error: STACK OVERFLOW");
            } else {
                this.top++;
                this.stack[top] = item;
            }
        }

    }

    public void pop() {
        if (this.stack == null) {
            T item;
            assert this.linkedStack != null;
            if ((item = this.linkedStack.deleteNode(-2)) != null) {
                System.out.println(item);
            } else {
                System.out.println("Error: STACK UNDERFLOW");
            }
        } else {
            if (this.top == -1) {
                System.out.println("Error: STACK UNDERFLOW");
            } else {
                System.out.println(this.stack[top]);
                this.top--;
            }
        }
    }

    public void peek() {
        if (this.stack == null) {
            assert this.linkedStack != null;
            T item = this.linkedStack.deleteNode(-1);
            System.out.println(item);
        } else {
        if (this.top == -1){
            System.out.println("Error: STACK UNDERFLOW");
        } else {
            System.out.println(this.stack[top]);
        }
        }
    }
}
