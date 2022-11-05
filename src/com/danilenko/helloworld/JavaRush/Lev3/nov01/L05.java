package com.danilenko.helloworld.JavaRush.Lev3.nov01;

/*Реализуй метод main(String[]), который сортирует массив array по возрастанию.
        Для сортировки массива используй метод Arrays.sort(int[]).
Требования:
        Реализуй метод main(String[]) согласно условию.*/

import java.util.Arrays;

public class L05 {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}