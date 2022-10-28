package com.danilenko.helloworld.JavaRush.Lev3.oct26;

/*Bвести с клавиатуры 10 чисел и вывести их в обратном порядке.*/

import java.util.Arrays;
import java.util.Scanner;

public class L06 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[array.length - i - 1] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
