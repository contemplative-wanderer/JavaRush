package com.danilenko.helloworld.JavaRush.Lev3.oct26;

/*Объеденяем массивы
Реализовать метод main(String[]), в котором нужно скопировать содержимое массивов firstArray и secondArray в один массив resultArray.
Массив firstArray должен быть в начале нового массива resultArray, а secondArray — после него.
Программа должна правильно обрабатывать массивы любой длины.
Требования:
В классе L02 должна быть публичная статическая переменная firstArray типа int[], проинициализированная массивом с 10-ю значениями.
В классе L02 должна быть публичная статическая переменная secondArray типа int[], проинициализированная массивом с 10-ю значениями.
В классе L02 должна быть публичная статическая переменная resultArray типа int[].
Реализуй метод main(String[]) согласно условию.*/

import java.util.Arrays;

public class L02 {

    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(firstArray, secondArray)));
    }
    public static int[] mergeArrays(int[] firstArray, int[] secondArray) {
        //напишите тут ваш код
        int[] resultArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            resultArray[i + firstArray.length] = secondArray[i];
        }
        return resultArray;
    }
}
