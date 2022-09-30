package com.danilenko.helloworld.JavaRush.Lev3;

import java.util.Scanner;

/*Написать программу, которая считывает с клавиатуры два числа и выводит на экран большее из них.
        Если числа одинаковые, то выводится первое число равно второму. Использовать тернарный оператор.*/

public class Lec9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite pervoe chislo: ");
        int a = scanner.nextInt();
        System.out.print("Vvedite vtoroe chislo: ");
        int b = scanner.nextInt();

        System.out.println(a > b ? a : a < b ? b : a + " = " + b);
    }
}
