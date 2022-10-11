package com.danilenko.helloworld.JavaRush.Lev3.oct09;

/* Считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
Должно быть введено минимум два числа. Если введено меньше двух целых чисел, то такую ситуацию обрабатывать не нужно, а программа может быть завершена с ошибкой.
Вывести на экран предпоследние по величине целое число перед максимальным из введенных с клавиатуры. Если таких чисел несколько, то необходимо вывести любое из них.
Максимальных чисел тоже может быть несколько. */

import java.util.Scanner;

public class L01 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;

        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            if (max < n){
                max1 = max;
                max = n;
            }
            if (max > n && max1 < n){
                max1 = n;
            }
        }
        System.out.println(max1);
    }
}
