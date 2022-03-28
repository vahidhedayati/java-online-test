package com.company;

import java.util.Scanner;

public class StringInt {


    public static String getSmallestAndLargest(String s, int k) {
        String current = s.substring(0,k);
        String smallest = current;
        String largest = current;
        for (int i=1; i <=s.length() -k; i++) {
            current = s.substring(i,i+k);
            if (current.compareTo(largest)>0) {
                largest=current;
            }
            if (current.compareTo(smallest)>0) {
                smallest = current;
            }
        }
        return smallest+"\n"+largest;
    }
    static void StringTest() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int aLength = a.length();
        int bLength = b.length();
        System.out.println(aLength+bLength);
        int result = a.compareTo(b);
        if (result>0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(a.substring(0,1).toUpperCase()+a.substring(1)+" "+b.substring(0,1).toUpperCase()+b.substring(1));

    }
    static void testStringInt() {
        try {


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        String s = Integer.toString(n);
        String ss = String.valueOf(n);

        if (n == Integer.parseInt(s)) {
            System.out.println("Works");
        } else {
            System.out.println("Failed");
        }
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }

    }
}
