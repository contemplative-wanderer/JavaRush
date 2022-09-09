package com.danilenko.helloworld;

public class Html {
    public static void main(String[] args) {
        String s = "<html>" +
                "%s" +
                "</>";
        System.out.println(String.format(s,"Daniil"));
    }
}
