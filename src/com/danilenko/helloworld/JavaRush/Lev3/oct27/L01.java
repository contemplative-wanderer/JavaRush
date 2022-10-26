package com.danilenko.helloworld.JavaRush.Lev3.oct27;

/*Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими массив array.
Найти максимальное число среди элементов массива.
Требования:
В методе main(String[]) считай с клавиатуры число N, потом проинициализируй массив array размером N элементов, и заполни числами с клавиатуры.
В методе main(String[]) выведи в консоль максимальное число среди элементов массива.*/

import java.util.Scanner;

public class L01 {

    public static int[] array;
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        array = new int[n];

        for (int i = 0; i < n; i++) {
            array [i] = scanner.nextInt();
        }
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if(max > array[i]){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
