package com.company;

import java.util.HashSet;
import java.util.Set;

public class TwoStrings {

    public static String twoStrings3(String s1, String s2) {
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < s1.length(); i++) {
            set.add(s1.charAt(i));
            if (set.size() == 26) break;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (set.contains(s2.charAt(i))) return "YES";
        }
        return "NO";
    }

    static String twoStrings2(String s1, String s2) {
        String ans = "NO";
        for (int i = 97; i <= 122; i++) {
            String me = String.valueOf((char) i);
            if (s1.contains(me) && s2.contains(me)) {
                return "YES";
            }
        }
        return ans;
    }

    static String twoStrings(String s1, String s2) {
        HashSet<Character> aChars = new HashSet<>();
        HashSet<Character> bChars = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            if (!aChars.contains(i)) {
                aChars.add(a);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            char a = s2.charAt(i);
            if (!bChars.contains(i)) {
                bChars.add(a);
            }
        }
        aChars.retainAll(bChars);
        if (!aChars.isEmpty()) {
            return "YES";
        }
        return "NO";
    }
}
