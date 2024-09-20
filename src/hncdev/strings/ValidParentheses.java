package hncdev.strings;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                characterStack.push(c);
            } else {
                if (characterStack.isEmpty()) {
                    return false;
                }

                char top = characterStack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return characterStack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        boolean isValid = validParentheses.isValid("()");
        System.out.println("'()' is valid: " + isValid);
    }
}
