package com.company;

import java.util.Scanner;

public class StringTests {

    static String isPalindrome() {
        Scanner sc = new Scanner(System.in);
        String  s = sc.next();
        String reversed = new StringBuilder(s).reverse().toString();
        String result = "Yes";
        if (!s.equals(reversed)) {

            result = "No";
        }
        return result;
    }

    static String betterIsPalindrome(){
        Scanner sc = new Scanner(System.in);
        String  s = sc.next();
        int aPointer = 0;
        int bPointer = s.length()-1;
        while(aPointer <= bPointer) {
            if (s.charAt(aPointer)!= s.charAt(bPointer)) {
                System.out.println("No");
                return "No";
            }
            aPointer++;
            bPointer--;

        }
        return "Yes";
    }
}
