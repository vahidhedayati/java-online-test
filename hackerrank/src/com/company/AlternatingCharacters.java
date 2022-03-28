package com.company;

public class AlternatingCharacters {

    static int alternatingCharacters(String s) {
        int min_deletion=0;
        StringBuilder sb = new StringBuilder(s);
        for (int i=0; i < s.length()-1;i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                min_deletion++;
                sb.deleteCharAt(i);
            }
        }

        return min_deletion;
    }

}
