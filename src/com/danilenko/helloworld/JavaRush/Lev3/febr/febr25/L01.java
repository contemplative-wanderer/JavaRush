package com.danilenko.helloworld.JavaRush.Lev3.febr.febr25;

/*Какое число меньше
Программа сравнивает два числа. Если первое число меньше второго, то в консоль выводится сообщение: Первое число меньше второго.
Если первое число больше второго или равно второму числу, то в консоль выводится сообщение: Первое число больше или равно второму числу.  */

public class L01 {
    public static void main(String[] args) {
        int first = 1;
        int second = 5;
        if (first < second) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Первое число больше или равно второму числу");
        }
    }
}
