package com.danilenko.helloworld.JavaRush.Lev3.nov01;

/*Заполни массив
Реализуй статический метод main(String[]), который заполняет массив array значениями valueStart и valueEnd.
Если длина массива четная, его первую половину нужно заполнить значениями valueStart, а вторую — valueEnd.
Если длина массива нечётная, то первую большую часть заполнить значениями valueStart, вторую меньшую — valueEnd.
Для заполнения массива создай методы Arrays.fill(int[], int, int, int), Arrays.fill(int[], int)
При тестировании значения полей класса Solution будут разными, учти это.*/

import java.util.Arrays;

public class L03 {

    public static int[] array = new int[21];
    public static int valueStart = 11;
    public static int valueEnd = 88;

    public static void main(String[] args) {
        fillArray(array, valueEnd);
        if(array.length % 2 == 0) {
            fillArray(array, 0, (array.length - 1) / 2, valueStart);
            System.out.println(Arrays.toString(array));
        } else {
            fillArray(array, 0, (array.length - 1) / 2, valueStart);
            System.out.println(Arrays.toString(array));
        }
    }

    public static void fillArray(int[] array, int a, int b, int filling){
        for (int i = a; i <= b; i++) {
            array[i] = filling;
        }
    }
    public static void fillArray(int[] array, int filling){
        for (int i = 0; i < array.length; i++) {
            array[i] = filling;
        }
    }
}
