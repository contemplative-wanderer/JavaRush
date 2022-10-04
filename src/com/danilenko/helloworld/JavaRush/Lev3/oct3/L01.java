package com.danilenko.helloworld.JavaRush.Lev3.oct3;

import java.util.Scanner;

/* Задать число. Потом перебирая угадывать какое число задано. После введенния загадоноого числа вывести на экран это число и завершить выполнение программы.*/

public class L01 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.print("Загадай число: ");
        int number = scanner.nextInt();

        while (true) {
            int inputNumber = scanner.nextInt();
            if (inputNumber == number) {
                System.out.print("Загадочное число равно: " + number);
                break;
            } else {
                System.out.println("Попробуй еще раз");
            }
        }
    }
}
