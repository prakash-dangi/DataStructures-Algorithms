package Book.Stack;

import java.util.EmptyStackException;
import java.util.spi.ToolProvider;

public class ArrayStack<T> {
    final T[] stack;
    int top;

    public ArrayStack(int capacity) {
        this.stack = (T[]) new Object[capacity];
        this.top = -1;
    }

    public void push(T item) {
        if (top == stack.length - 1) {
            throw new StackOverflowError("Stack is full");
        }
        stack[++top] = item;
    }

    public T pop() {
        if (isEmpty()) throw new EmptyStackException();
        return stack[top--];
    }

    public T peek() {
        if (isEmpty()) throw new EmptyStackException();
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
