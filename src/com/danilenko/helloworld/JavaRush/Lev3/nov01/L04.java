package com.danilenko.helloworld.JavaRush.Lev3.nov01;

/*Реализуй метод main(String[]), который делит массив array на два подмассива и заполняет ими двумерный массив result.
        Если длина массива нечетная, то большую часть нужно скопировать в первый подмассив.
Для разделения массива используй метод Arrays.copyOfRange(int[], int, int). Порядок элементов не меняй.
При тестировании значения полей класса Solution будут разными, учти это.
Требования:
Реализуй метод main(String[]) согласно условию.*/

import java.util.Arrays;

public class L04 {

    public static int[][] result = new int[8][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        //напишите тут ваш код
        if (array.length % 2 != 0) {
            result[0] = Arrays.copyOfRange(array, 0, (array.length - (array.length / 2)));
        }
        System.out.println(Arrays.deepToString(result));
    }
}