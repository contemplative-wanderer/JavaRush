package com.danilenko.helloworld;

import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        String line = scanner.nextLine();
        Horse horse = new Horse(line);
        System.out.println(horse);
        String line2 = scanner.nextLine();
        Horse horse2 = new Horse(line2);
        System.out.println(horse2);
    }
}
