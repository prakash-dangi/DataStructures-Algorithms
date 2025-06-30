package Book.Stack;

import java.util.*;

public class PolishNotation {
    public static String toPostfix(String exp) {
        Stack<Character> stack = new Stack<>();
        StringBuilder output = new StringBuilder();
        Set<Character> operators = Set.of('+', '-', '*', '/', '^');

        exp = exp.replaceAll("\\s", "");

        for (char c : exp.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                output.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    throw new IllegalArgumentException("Mismatched parentheses");
                }
            } else if (operators.contains(c)) {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    if (c == '^' && stack.peek() == '^') break;
                    output.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(' || stack.peek() == ')') {
                throw new IllegalArgumentException("Mismatched parentheses");
            }
            output.append(stack.pop());
        }

        return output.toString();
    }

    private static int precedence(char op) {
        return switch (op) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> 0;
        };
    }
}