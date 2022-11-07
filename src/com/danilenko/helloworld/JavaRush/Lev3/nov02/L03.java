package com.danilenko.helloworld.JavaRush.Lev3.nov02;

/*Правильный порядок
Напишем утилиту для работы с массивами. Основная часть функционала готова: метод printArray() выводит в консоли все элементы массива.
Тебе осталась мелочь: реализовать метод reverseArray(). Он должен менять порядок элементов массива на обратный.
Метод должен работать только с массивами целочисленных значений (int[]).
Пример:
Если массив содержал элементы:
1, 2, 3, 4, 5, 6, 7, 8, 9, 0
то после вызова метода reverseArray() должен содержать:
0, 9, 8, 7, 6, 5, 4, 3, 2, 1
Требования:
Метод reverseArray() должен менять порядок элементов массива на обратный.*/

import java.util.Arrays;

public class L03 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        printArray(reverseArray(array));
    }

    public static int[] reverseArray(int[] ar) {
        int[] ar1 = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            ar1[i] = ar[ar.length - i - 1];
        }
        return ar1;
    }

    public static void printArray(int[] matrix) {
        for (int i : matrix) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
