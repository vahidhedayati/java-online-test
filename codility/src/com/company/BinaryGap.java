package com.company;

public class BinaryGap {



    public int binaryGap(int N) {
        String bString = Integer.toString(N,2);
        //System.out.println(bString);
        //return 0;
        boolean started=false;
        int counter=0;
        int maxCounter=0;
        for (int i=0; i < bString.length(); i++) {
            String c = bString.substring(i,i+1);
            if (c.equals("1")) {
                if (started) {
                    if (counter > maxCounter) {
                        maxCounter = counter;
                    }
                }
                counter=0;
                started=true;
            }
            if (c.equals("0")) {
                counter++;
            }
        }
        return maxCounter;
    }

    public int binaryGap2(int N) {
        String bString = Integer.toString(N,2);
        String[] strArray = bString.replaceAll("0+$","").split("1");
        int maxGap = 0;
        for (String s: strArray) {
            int sLength =s.length();
            if (sLength>maxGap) {
                maxGap = sLength;
            }
        }
        return maxGap;
    }

    public static void main(String[] args) {
	    // write your code here
        BinaryGap m = new BinaryGap();

        System.out.println(m.binaryGap(542));
        System.out.println(m.binaryGap2(542));
    }
}
