package com.danilenko.helloworld.JavaRush.Lev3.oct26;

/*Заполнение массива из 10 чисел числами от 10 до 1.*/

import java.util.Arrays;

public class L05 {

    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array [i] = 10 - i;
        }
        System.out.println(Arrays.toString(array));
    }
}
