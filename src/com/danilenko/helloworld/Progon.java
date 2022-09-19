package com.danilenko.helloworld;

import java.util.Scanner;

public class Progon {

    public static void main(String[] args) {
        String str = "10 20 40 60";
        Scanner scanner = new Scanner(str);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a + b + c);
    }
}