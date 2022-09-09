package com.danilenko.helloworld;

public class L0909 {
    public static void main(String[] args) {
        String[] x = new String[]{"5", "6", "7"};
        for (String s : x) {
            printVK(s);
        }
        for (int i = 0; i < x.length; i=i+2) {
            String x1 = x[i];
            printVK(x1);
        }
        String a = "Duck" ;
        String b = "Cat";
        int c = 5;
        printVK(a);
        L0909.printVK(b);
    }

    public static void printVK(String s) {
        System.out.println(wrap(s));
    }

    public static String wrap(String s) {
        return "'" + s + "'";
    }
}
