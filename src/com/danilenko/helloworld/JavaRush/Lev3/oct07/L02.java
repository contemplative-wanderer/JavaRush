package com.danilenko.helloworld.JavaRush.Lev3.oct07;

/* Стакан на половину пуст
В методе main() есть переменная double glass = 0.5, которая символизирует наполовину заполненный стакан.
Для пессимиста он наполовину пуст, а для оптимиста - наполовину полон.
Необходимо считать с клавиатуры данные типа boolean, используя метод nextBoolean() объекта типа Scanner.
В зависимости от полученных данных, округлить переменную glass: до целого числа вниз (0), если пессимист (false) и до целого числа вверх (1), если оптимист (true).
Результат вывести на экран.
*/

import java.util.Scanner;

public class L02 {

    public static void main(String[] args) {

        double glass = 0.5;

        var scanner = new Scanner(System.in);
        boolean crazy = scanner.nextBoolean();
        int g;
        int gl;

        if (crazy) {
            g = (int) Math.ceil(glass);
            System.out.println(g + " - optimist");
        } else {
            gl = (int) Math.floor(glass);
            System.out.println(gl + " - pessimist");
        }
    }
}
