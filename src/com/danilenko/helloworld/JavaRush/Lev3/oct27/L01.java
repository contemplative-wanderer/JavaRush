package com.danilenko.helloworld.JavaRush.Lev3.oct27;

/*Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими массив array.
Найти максимальное число среди элементов массива.
Требования:
В методе main(String[]) считай с клавиатуры число N, потом проинициализируй массив array размером N элементов, и заполни числами с клавиатуры.
В методе main(String[]) выведи в консоль максимальное число среди элементов массива.*/

import java.util.Scanner;

public class L01 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            array [i] = scanner.nextInt();
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
