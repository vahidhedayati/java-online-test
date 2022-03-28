package com.company;

import java.util.Stack;

public class BracketMatch {



    public int bracketStack(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i=0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c=='['||c=='('||c=='{') {
                stack.push(c);
            } else {
                Character popped = stack.pop();
                if (c=='[' && popped != ']') {
                    return 0;
                } else if (c=='{' && popped != '}') {
                    return 0;
                }
                if (c=='(' && popped != ')') {
                    return 0;
                }
            }

        }
        if (!stack.isEmpty()) {
            return 0;
        }
       return 1;
    }

    public static void main(String[] args) {
	    // write your code here
        BracketMatch m = new BracketMatch();



        System.out.println(m.bracketStack("{[(]}"));
    }
}
