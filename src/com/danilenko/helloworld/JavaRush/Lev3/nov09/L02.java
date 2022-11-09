package com.danilenko.helloworld.JavaRush.Lev3.nov09;

/*Массив значений
Часто перед началом использования массива его необходимо заполнить значениями по умолчанию.
Реализуй такое заполнение в методе fillArray(Integer[] array, int value). В качестве аргументов метод принимает
массив и значение, которым его необходимо заполнить. Массив заполняется полностью.*/

import java.util.Arrays;

public class L02 {

    public static void main(String[] args) {

        Integer[] array = new Integer[10];
        fillArray(array, 9);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }
}
