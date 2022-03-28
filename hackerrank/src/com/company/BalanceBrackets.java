package com.company;

import java.util.Stack;

public class BalanceBrackets {

    static String isBalanced(String s) {
        Stack<Character> characterStack = new Stack<Character>();
        for (int i=0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current== '(' || current== '{' || current== '[') {
                characterStack.push(current);
            } else {
                char popped = characterStack.pop();
                if (current == ')' && popped != '(') {
                    return "NO";
                } else if (current == '}' && popped != '{') {
                    return "NO";
                } else if (current == ']' && popped != '[') {
                    return "NO";
                }
            }
        }
        if (characterStack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }

    static void main(String[] args) {
            isBalanced("[([{}])]");
        isBalanced("{[()]}");
        isBalanced("{[(])}");
        isBalanced("{{[(())]}}");
    }
}
