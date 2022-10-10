package com.danilenko.helloworld.JavaRush.Lev3.oct06;

// Вписаный в окружность ромб. С возможностью смещения.

import java.util.Scanner;

public class L01 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.print("Vvedite radius vpisanogo romba: ");
        int radius = scanner.nextInt();
        System.out.print("Vvedite sdvig vpisanogo romba: ");
        int shift = scanner.nextInt();

        int i;
        int j;
        int k;
        int p;
        String asterisk = "*";
        String angleUp = "^";
        String angleDown = "v";
        String slash = "/";
        String backSlash = "\\";

        for (i = 0; i < radius + 1 + shift; i++) {
            System.out.print(" ");
        }
        System.out.print(angleUp);
        System.out.println("");
        for (k = 1; k <= radius - 1; k++) {
            for (p = radius - k + shift; p >= 0; p--) {
                System.out.print(" ");
            }

            System.out.print(slash);
            for (j = 2; j <= k * 2; j++) {
                System.out.print(" ");
            }
            System.out.print(backSlash);
            System.out.println("");
        }

        for (i = 0; i <= shift; i++) {
            System.out.print(" ");
        }
        System.out.print(asterisk);
        for (j = 0; j <= (k * 2) - 2; j++) {
            System.out.print(" ");
        }
        System.out.print(asterisk);
        System.out.println("");

        for (k = 1; k <= radius - 1; k++) {
            for (p = 0; p <= k + shift; p++) {
                System.out.print(" ");
            }
            System.out.print(backSlash);
            for (j = 0; j <= (radius - k - 1) * 2; j++) {
                System.out.print(" ");
            }
            System.out.print(slash);
            System.out.println("");
        }

        for (i = 0; i < radius + 1 + shift; i++) {
            System.out.print(" ");
        }
        System.out.print(angleDown);
    }
}
