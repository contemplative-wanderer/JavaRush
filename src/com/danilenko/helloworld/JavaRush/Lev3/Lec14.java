package com.danilenko.helloworld.JavaRush.Lev3;

import java.util.Scanner;

public class Lec14 {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();
        isHigh = bodyTemperature >= 38.0;
        isLow = bodyTemperature <= 36.0;
        if (isHigh) {
            System.out.println("Temperatura tela visokay");
        } else if (isLow){
            System.out.println("Temperatura tela nizkay");
        } else {
            System.out.println("Temperatura tela normalnay");
        }
    }
}
