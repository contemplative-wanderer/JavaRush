package com.danilenko.helloworld.JavaRush.Lev3.nov04;

/*Анализ массивов
        Данная программа должна выводить информацию о созданном массиве. Но из-за неправильно расставленных модификаторов static она не компилируется.
Исправь эти ошибки. Добавь модификатор static там, где это необходимо.
Требования:
Код должен компилироваться.
Нужно добавить минимально необходимое количество модификаторов static.*/

public class L01 {

    public static void main(String[] args) {
        int[] array = {123, 7, -14, 67, 16, 98, 75, 576};
        System.out.println("В массиве: ");
        printArray(array);
        System.out.println("Минимальное число: " + getMinValue(array));
        System.out.println("Максимальное число: " + getMaxValue(array));

    }

    public static int getMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int getMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
