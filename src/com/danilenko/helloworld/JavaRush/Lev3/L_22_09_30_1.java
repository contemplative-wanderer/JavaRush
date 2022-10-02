package com.danilenko.helloworld.JavaRush.Lev3;

/*Необходимо считать с клавиатуры число больше 0 и вывести в консоль
        сумму всех чисел от 0 до введенного числа включительно.
        Для этого используй цикл while.*/

import java.util.Scanner;

public class L_22_09_30_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 0;
        int sum = 0;

        while(i <= num) {
            sum = i + sum;
            i++;
        }
        System.out.println(sum);
    }
}
