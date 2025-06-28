package Book.Stack;

public class Stack<T extends Comparable<T>> {
    private final int max;
    private final T[] stack;
    private int top;

    @SuppressWarnings("unchecked")
    public Stack(int max) {
        this.max = max;
        this.stack = (T[]) new Comparable[max];
        this.top = -1;
    }

    public void push(T item) {
        if (this.top == max - 1) {
            System.out.println("Error: STACK OVERFLOW");
        } else {
            this.top++;
            this.stack[top] = item;
        }
    }

    public void pop() {
        if (this.top == -1) {
            System.out.println("Error: STACK UNDERFLOW");
        } else {
            System.out.println(this.stack[top]);
            this.top--;
        }
    }

    public void peek() {
        if (this.top == -1){
            System.out.println("Error: STACK UNDERFLOW");
        } else {
            System.out.println(this.stack[top]);
        }
    }
}
