package com.danilenko.helloworld.JavaRush.Lev3.oct29;

/*Заполни все массивы-строки числами, которые равны номеру элемента в массиве-строке + номер самой строки.
Массив-строка под номером 3 будет заполнена вот так: {3, 4, 5, ...}
Проверка (0+3, 1+3, 2+3, ...)*/

import java.util.Arrays;

public class L02 {


    public static void main(String[] args) {

        int a = 5;
        int b = 5;
        int[][] index = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                index[i][j] = i + j + 1;
                System.out.print(index[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        // Вариант №2 вывода на консоль
        System.out.println(Arrays.deepToString(index));
    }
}
