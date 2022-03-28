package com.company;

public class MakeAnagram {

    static int makeAnagram(String a,String b) {
        int[] a_frequences=new int[26];
        int[] b_frequences=new int[26];
        int minDeletions = 0;
        for (int i=0; i < a.length(); i++) {
            char currentChar = a.charAt(i);
            int charInt = (int)currentChar;
            int position = charInt - (int)'a';
            a_frequences[position]++;
        }
        for (int i=0; i < b.length(); i++) {
            char currentChar = b.charAt(i);
            int charInt = (int)currentChar;
            int position = charInt - (int)'a';
            b_frequences[position]++;
        }
        for (int i=0; i < 26; i++) {
            int difference = Math.abs(a_frequences[i] - b_frequences[i]);
            minDeletions+=difference;
        }

        return minDeletions;
    }
}
