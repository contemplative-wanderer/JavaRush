package com.danilenko.helloworld.JavaRush.Lev3.oct26;

/*Reverse
Тебе нужно написать программу, которая:
1. Считывает с консоли целое число N.
2. Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
3. Вывести в консоль считанные числа, если N нечетное - в порядке ввода, иначе — в обратном порядке.
Каждое число выводить с новой строки. Число N выводить не нужно.*/

import java.util.Arrays;
import java.util.Scanner;

public class L07 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        int [] array1 = new int[n];

        if (n > 0) {
            for (int i = 0; i < n; i++) {
               int number = scanner.nextInt();
               array [i] = number;
               array1 [n - i - 1] = number;
            }
            if (n % 2 != 0) {
                System.out.println(Arrays.toString(array));
            } else {
                System.out.println(Arrays.toString(array1));
            }
        }
    }
}
