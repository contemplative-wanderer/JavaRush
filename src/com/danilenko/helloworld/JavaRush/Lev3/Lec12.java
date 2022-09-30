package com.danilenko.helloworld.JavaRush.Lev3;

import java.util.Objects;

public class Lec12 {

    public static void main(String[] args) {

        String str = null;
        String string = "null";

        printUp(string);
        printUp(str);
        printEq(str, string);
    }
    public static void printUp(String s){
        System.out.println(String.valueOf(s).toUpperCase());
    }
    public static void printEq(String s1, String s2){
        System.out.println(Objects.equals(s1, s2));
    }
}
