package com.danilenko.helloworld.JavaRush.Lev3.oct06;

/*Напишем программу, в которой:
Нужно ввести с клавиатуры два целых числа. Первое число - количество банок колы в ящике. Второе - количество людей в кабинете.
Вывести на экран результат деления первого числа на второе.
Результатом должно быть вещественное число.*/

import java.util.Scanner;

public class L03 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.print("Vvedite kolichestvo banok: ");
        int bottle = scanner.nextInt();
        System.out.print("Vvedite kolichestvo chelovek: ");
        int people = scanner.nextInt();
        double x = 1.0 * bottle / people;
        System.out.println(x);
    }
}
