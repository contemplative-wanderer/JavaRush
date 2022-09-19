package com.danilenko.helloworld;

public class Test {
    public static void main(String[] args) {
        Horse horse = new Horse("Bluskavka");
        Horse horse1 = new Horse("Zoro");
        Horse sivka = new Horse("Sivka");
        System.out.println(horse);
        System.out.println(horse1);
        System.out.println(sivka);
    }

    public static String pov(int n) {
        return n*2 + "";
    }
}

