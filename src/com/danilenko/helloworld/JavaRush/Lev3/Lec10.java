package com.danilenko.helloworld.JavaRush.Lev3;

import java.util.Scanner;

/*Напиши программу, которая считывает с клавиатуры два вещественных числа (double)
        и выдает сообщение о том, равны ли эти числа с точностью до одной миллионной,
        показывая на сколько не равны.*/

public class Lec10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite dva chisla: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        var abs = Math.abs(a - b);

        System.out.println( abs <= 0.000001 ? "Chisla ravni " + abs : "Chisla ne ravni " + abs);
    }
}
