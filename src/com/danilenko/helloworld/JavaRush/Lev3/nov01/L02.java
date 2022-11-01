package com.danilenko.helloworld.JavaRush.Lev3.nov01;

/*Исправь работу метода main(String[]), который выводит в консоли true, если arrayFirst равняется arraySecond, иначе — false.
Требования:
        Если arrayFirst равняется arraySecond, то метод main(String[]) выводит в консоли true.*/

import java.util.Arrays;

public class L02 {

    public static int[][] stringsFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    public static int[][] stringsSecond = new int[][]{{1, 2, 3, 3}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    public static void main(String[] args) {
        System.out.println(Arrays.deepEquals(stringsFirst,stringsSecond));
    }

}
