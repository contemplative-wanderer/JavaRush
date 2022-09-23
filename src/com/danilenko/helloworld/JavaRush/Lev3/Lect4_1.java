package com.danilenko.helloworld.JavaRush.Lev3;

import java.util.Scanner;

/*Передать на вход программы число в качестве аргумента.
Если оно нечетное, распечатать его.
Используем оператор if.
Используйте метод Integer.parseInt() для преобразования из String в int.*/


public class Lect4_1 {

    public static void main(String[] args) {

        System.out.println(args[0]);
        int number = Integer.parseInt(args[0]);
        if (number % 2 != 0) {

        }

    }

}
