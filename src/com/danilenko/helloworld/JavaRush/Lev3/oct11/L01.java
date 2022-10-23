package com.danilenko.helloworld.JavaRush.Lev3.oct11;

/*Организовать беспрерывный ввод чисел с клавиатуры, пока пользователь не введёт 0.
        После ввода нуля, показать на экран количество чисел, которые были введены, их общую сумму и среднее арифметическое.
        Подсказка: необходимо объявить переменную-счетчик, которая будет считать количество введенных чисел, и переменную, которая будет накапливать общую сумму чисел.*/

import java.util.Scanner;

public class L01 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        double i = 1;
        double j = 0;
        double k;
        double s = 0;
        double sr = 0;

        for ( ; ; ) {
            if (scanner.hasNextDouble()) {
                k = scanner.nextInt();
                if (k == 0) {
                    System.out.println("Kolichestvo cifer: " + j);
                    System.out.println("Summa: " + s);
                    System.out.println("Srednie arifmeticheskoe: " + (sr));
                    break;
                }
                j = j + i;
                s = s + k;
                sr = s / j;
            } else if (scanner.hasNextLine()) {
                System.out.println("Vvodite chislo!");
                break;
            }
        }
    }
}
