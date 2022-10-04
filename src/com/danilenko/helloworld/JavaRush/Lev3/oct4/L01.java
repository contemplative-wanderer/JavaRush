package com.danilenko.helloworld.JavaRush.Lev3.oct4;

/* Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое:
например, строка или символ. Выведи на экран максимальное четное число из введенных. Если введено несколько
таких чисел, необходимо вывести любое из них. Пример ввода: 8 9 8 4 5 e*/

import java.util.Scanner;

public class L01 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int max = 0;

        while(scanner.hasNextInt()){
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                if (number > max) {
                    max = number;
                }
            }
        }
        System.out.println(max);
    }
}
