package com.company;

import java.util.Scanner;

public class StdInOut {
    static int B;
    static int H;

    static boolean flag = true;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        scanner.close();
        try {
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and Height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }

    static int howManyLines() {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;
        while (scanner.hasNext()) {
            System.out.println(lineNumber+" "+scanner.nextLine());
            lineNumber++;
        }
        scanner.close();
        return lineNumber;
    }
    static void javaLoop() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i=0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j=0; j < n; j++) {
                a += b;
                if (j>0) {
                    System.out.print(" ");
                }
                System.out.print(a);
                b = b *2;
            }
            System.out.println("");
        }
        in.close();
    }

    static void otherTest() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double d = scanner.nextDouble();
        String s = scanner.nextLine();
       // if (s.isEmpty())
        s = scanner.nextLine();
        scanner.close();
    }
    static void stdTest() {
        Scanner scanner = new Scanner(System.in);
        //String myString = scanner.next();
        System.out.println("Please enter 3 numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
