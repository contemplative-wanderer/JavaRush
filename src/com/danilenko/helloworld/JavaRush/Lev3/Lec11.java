package com.danilenko.helloworld.JavaRush.Lev3;

import java.util.Scanner;

// Сравнить строки по содержанию принятые с клавиатуры.

public class Lec11 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();
        String d = scanner.nextLine();

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));
        System.out.println(b.equals(c));
        System.out.println(b.equals(d));
        System.out.println(c.equals(d));
        System.out.println(c.equals(d) ? "Ravni" : "Ne ravni");
    }
}
