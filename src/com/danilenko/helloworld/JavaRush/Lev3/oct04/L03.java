package com.danilenko.helloworld.JavaRush.Lev3.oct04;

/* Считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
Должно быть введено минимум два числа. Если введено меньше двух целых чисел, то такую ситуацию обрабатывать не нужно, а программа может быть завершена с ошибкой.
Вывести на экран второе по величине целое число после минимального из введенных с клавиатуры. Если таких чисел несколько, то необходимо вывести любое из них.
Минимальных чисел тоже может быть несколько. */

import java.util.Scanner;

public class L03 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int min1 = Integer.MAX_VALUE;

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n < min) {
                min1 = min;
                min = n;
            } else if (n < min1 && n != min) {
                min1 = n;
            }
        }
        System.out.println(min1);
    }
}
