package com.danilenko.helloworld.JavaRush.Lev3;

import java.util.Scanner;

public class Lec13 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        while (true) {
            var line = scanner.nextLine();
            if ("q".equals(line)) {
                break;
            }
            System.out.println(line.toUpperCase());
        }
    }
}
