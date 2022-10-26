package com.danilenko.helloworld.JavaRush.Lev3.oct27;

/*Ввести с клавиатуры число N.
Cчитать N целых чисел и заполнить ими массив.
Найти минимальное число среди элементов массива и вывести в консоль.
Требования:
В методе main(String[]) считай с клавиатуры число N, потом проинициализируй массив array размером N элементов и заполни числами с клавиатуры.
В методе main(String[]) выведи в консоль минимальное число среди элементов массива.*/

import java.util.Scanner;

public class L02 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int min;

        for (int i = 0; i < n; i++) {
            array [i] = scanner.nextInt();
        }
        min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
