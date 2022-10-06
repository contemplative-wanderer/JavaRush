package com.danilenko.helloworld.JavaRush.Lev3.oct06;

/* Площадь круга
Ввести с клавиатуры положительное целое число radius. Это будет радиус окружности.
Вывести на экран площадь круга, рассчитанную по формуле: S = pi * radius * radius.
Результатом должно стать целое число (тип int). Для этого нужно привести к типу int результат умножения (отбросить дробную часть, округлив вниз до целого числа).
В качестве значения pi используй 3.14.
 */

import java.util.Scanner;

public class L02 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.print("Vvedite radius okrugnosti: ");
        int radius = scanner.nextInt();
        double pi = 3.14;
        int square = (int) Math.floor(pi * radius * radius);
        System.out.println("Ploschad kruga ravna: " + square);

        //Вариант 2
        int square1 = (int) (pi * radius * radius);
        System.out.println("Ploschad kruga ravna: " + square1);
    }
}
