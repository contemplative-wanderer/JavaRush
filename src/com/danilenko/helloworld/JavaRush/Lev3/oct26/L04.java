package com.danilenko.helloworld.JavaRush.Lev3.oct26;

/*Заполнение массива из 10 чисел числами от 1 до 10*/

import java.util.Arrays;

public class L04 {

    public static void main(String[] args) {

        int [] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array [i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }
}
