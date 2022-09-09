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

    public static void main2(String[] args) {
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        int b = console.nextInt();

        System.out.println(a + b);
    }


    public static void main1(String[] args) {

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Name:");
            String name = keyboard.nextLine();
            System.out.println("Age:");
            int age = keyboard.nextInt();
        }
}