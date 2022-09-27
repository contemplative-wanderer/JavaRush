package com.danilenko.helloworld.JavaRush.Lev3;

/*Передать на вход программы число в качестве аргумента.
Если оно нечетное, распечатать его.
Используем оператор if.
Используйте метод Integer.parseInt() для преобразования из String в int.*/
// Ряд чисел - 3 5 12 15 22

import java.util.Scanner;

public class Lec2 {

    public static void main(String[] args) {

        int number = Integer.parseInt(args[3]);
        if (number % 2 != 0) {
            System.out.println(number);

        }
    }
}