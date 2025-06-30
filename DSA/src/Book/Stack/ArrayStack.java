package Book.Stack;

import java.util.EmptyStackException;

public class ArrayStack<T> implements Stack<T> {
    final T[] stack;
    int top;

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        this.stack = (T[]) new Object[capacity];
        this.top = -1;
    }

    @Override
    public void push(T item) {
        if (top == stack.length - 1) {
            throw new StackOverflowError("Stack is full");
        }
        stack[++top] = item;
    }

    @Override
    public T pop() {
        if (isEmpty()) throw new EmptyStackException();
        return stack[top--];
    }

    @Override
    public T peek() {
        if (isEmpty()) throw new EmptyStackException();
        return stack[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}
