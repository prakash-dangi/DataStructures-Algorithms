package Book.Stack;

import java.util.Set;

/**
 * Converts an infix expression to postfix (Reverse Polish Notation).
 */
public class PolishNotation {
    /**
     * Converts an infix expression to postfix.
     * Supports single-digit operands and operators: +, -, *, /, ^ with parentheses.
     */
    public static String toPostfix(String exp) {
        Stack<Character> stack = new ArrayStack<>(exp.length());
        StringBuilder output = new StringBuilder();
        Set<Character> operators = Set.of('+', '-', '*', '/', '^');

        exp = exp.replaceAll("\\s", ""); // remove whitespace

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
                    stack.pop(); // remove '(' from stack
                } else {
                    throw new IllegalArgumentException("Mismatched parentheses");
                }
            } else if (operators.contains(c)) {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    if (c == '^' && stack.peek() == '^') break; // exponentiation is right associative
                    output.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            char top = stack.pop();
            if (top == '(' || top == ')') {
                throw new IllegalArgumentException("Mismatched parentheses");
            }
            output.append(top);
        }

        return output.toString();
    }

    /**
     * Returns operator precedence.
     */
    private static int precedence(char op) {
        return switch (op) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> 0;
        };
    }
}