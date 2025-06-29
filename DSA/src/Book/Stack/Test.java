package Book.Stack;

public class Test {
    public static void main(String[] args) {
        String infix = "A+(B*C-(D/E^F)*G)*H";
        System.out.println(PolishNotation.toPostfix(infix));
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//        stack.peek();
//        stack.pop();
//        stack.peek();
    }
}
