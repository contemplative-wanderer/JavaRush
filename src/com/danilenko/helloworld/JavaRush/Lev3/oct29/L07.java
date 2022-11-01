package com.danilenko.helloworld.JavaRush.Lev3.oct29;

/* Метод Array.binarySearch()*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class L07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Height = ");
        int n = scanner.nextInt();
        System.out.print("Width = ");
        int m = scanner.nextInt();
        System.out.print("Maximum sample value, from 0 to ");
        int v = scanner.nextInt();
        System.out.print("Search number - ");
        int x = scanner.nextInt();
        int[][] search = new int[n][m];
        System.out.println();

        // заполнение массива числами
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                search[i][j] = new Random().nextInt(v);
                System.out.print(search[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //Поиск искомого
        System.out.println("//Search =  " + x);
        for (int i = 0; i < n; i++) {
            int index = Arrays.binarySearch(search[i], x);
            System.out.println("string" + "[" + i + "]" + " = " + index);
        }
    }
}
