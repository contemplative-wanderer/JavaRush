package com.danilenko.helloworld.JavaRush.Lev3.oct26;

//Вывести на консоль массив с обратным отсчетом, начиная с 10, заканчивая 1.

import java.util.Arrays;

public class L01 {

    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 10; i > 0; i--) {
            array [array.length - i] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}
