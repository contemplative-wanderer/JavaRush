package com.danilenko.helloworld.JavaRush.Lev3.oct26;

/*Заполнение массива из 10 чисел числами от 0 до 9*/

import java.sql.Array;
import java.util.Arrays;

public class L03 {

    public static void main(String[] args) {

        int [] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array [i] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}
