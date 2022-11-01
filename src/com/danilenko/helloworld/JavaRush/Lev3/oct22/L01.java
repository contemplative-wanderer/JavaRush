package com.danilenko.helloworld.JavaRush.Lev3.oct22;

/* Игра - угадай число*/

import java.util.Random;
import java.util.Scanner;

public class L01 {

    public static void main(String[] args) {

        int a = new Random().nextInt(101);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int i = scanner.nextInt();
            if (a > i) {
                System.out.println("^");
            }else if (a < i) {
                System.out.println("v");
            } else {
                System.out.println("URA!");
                break;
            }
        }
    }
}
