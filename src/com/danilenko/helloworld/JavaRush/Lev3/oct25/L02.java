package com.danilenko.helloworld.JavaRush.Lev3.oct25;

/*Реализуй метод main(String[]), который меняет знак элемента массива array на противоположный,
        если значение этого элемента чётное.*/

import java.util.Arrays;

public class L02 {

    public static int[] array = new int[]{1, 2, 3, -4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                array [i] *= -1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
