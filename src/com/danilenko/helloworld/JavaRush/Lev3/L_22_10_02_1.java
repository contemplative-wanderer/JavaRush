package com.danilenko.helloworld.JavaRush.Lev3;

/*Ввести строку, потом ввести число. Вывести на консоль строку то количество раз что было заданном числом.*/

import java.util.Scanner;

public class L_22_10_02_1 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int number = scanner.nextInt();
        int i = 0;

        while (i < number){
            System.out.println(line);
            i++;
        }
    }
}
