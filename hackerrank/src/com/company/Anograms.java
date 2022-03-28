package com.company;

import java.util.*;

public class Anograms {

    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] a_chars = a.toCharArray();
        char[] b_chars = b.toCharArray();

        Arrays.sort(a_chars);
        Arrays.sort(b_chars);
        return Arrays.equals(a_chars,b_chars);
    }
    static boolean isAnagram3(String a, String b) {

        if(a.length() != b.length())
            return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        for (String s : a.split("")) {
            b = b.replaceFirst(s, "");
           // System.out.println(s+" ---- "+b);
        }
        return  b.isEmpty();
    }

    static boolean isAnagramCharFrequency(String a, String b) {
        int a_length = a.length();
        int b_length = b.length();
        if (a_length != b_length) return false;
        a = a.toLowerCase();
        b = b.toLowerCase();

        //a-z
        int[] char_frequencies = new int[26];
        char aChar = 'a';
        int aInt = aChar;
        System.out.println (" a = "+aInt);
        for (int i=0; i < a_length; i++) {
            char current_char = a.charAt(i);

            int index = current_char - 'a';
            char_frequencies[index]++;
        }
        for (int i=0; i < b_length; i++) {
            char current_char = b.charAt(i);
            int index = current_char - 'a';
            char_frequencies[index]--;
        }
        for (int i=0; i < 26; i++) {
            if (char_frequencies[i] !=0) return false;
        }
        return true;
    }

    static boolean isAnagram4(Set<String> current, String a, String b) {
        int a_length=a.length();
        int b_length=b.length();
        if (a_length!=b_length) return false;





        return true;
    }
    public static void main(String[] args) {
        // write your code here
        System.out.println(isAnagram3("cat", "Tac"));

        String[] myStrings = { "gat", "cat", "dog", "Tac", "fat", "ACT" };
        HashMap<String,String> collection = new HashMap<String,String>();

        Set<String> existing = new HashSet<>();
        // Set<String> result = new HashSet<>();
        List<String> sortedResult = new ArrayList<String>();
        for (int i=0; i < myStrings.length; i++) {

            String loweredValue =myStrings[i].toLowerCase();
            char[] characters =loweredValue.toCharArray();
            Arrays.sort(characters);
            String sorted = new String(characters).toLowerCase();
            System.out.println(loweredValue+" is now "+sorted);
            if (!collection.containsKey(sorted)) {
                collection.put(sorted,myStrings[i]);
            }
            if (!existing.contains(sorted)) {
                existing.add(sorted);
                sortedResult.add(myStrings[i]);
            }
        }
        List<String> sortedCollectionValues = new ArrayList(collection.values());
        Collections.sort(sortedCollectionValues);
        for (int a=0; a < sortedCollectionValues.size(); a++) {
            System.out.println("---AHHHHAA----> "+sortedCollectionValues.get(a));
        }
        // List<String> sortedResult = new ArrayList<String>(result);
        Collections.sort(sortedResult);
        System.out.println("ahha "+sortedResult.size() );
        for (int a=0; a < sortedResult.size(); a++) {
            System.out.println("-------> "+sortedResult.get(a));
        }

        for (int i=0; i < myStrings.length; i++) {
            for (int j=i+1; j < myStrings.length; j++) {
                String one =   myStrings[i];
                String two =   myStrings[j];
                //System.out.println("Comparing "+one+" with "+two+" = "+isAnagram3(one,two));
                if (isAnagram3(one,two)==true) {
                    myStrings=removeEntry(myStrings,j);
                }
            }
        }
        for (int i=0; i < myStrings.length; i++) {
            String one =   myStrings[i];
            System.out.println("We have "+one);
        }

    }

    static String[] removeEntry(String[] input, int rmIndex) {
        String[] output = new String[input.length-1];
        for (int i=0, k=0; i < input.length;i++) {
            if (i==rmIndex) {
                continue;
            }
            output[k++]= input[i];
        }
        return output;
    }

}
