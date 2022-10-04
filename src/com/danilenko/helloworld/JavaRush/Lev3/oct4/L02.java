package com.danilenko.helloworld.JavaRush.Lev3.oct4;

/*Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое:
например, строка или символ. Выведи на экран минимальное число из введенных. Если введено несколько таких
чисел, необходимо вывести любое из них. Пример ввода: 8 4 9 4 5 e Пример вывода: 4*/

import java.util.Scanner;

public class L02 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int min = scanner.nextInt();

        while(scanner.hasNextInt()){
            int number = scanner.nextInt();
            if(number < min){
                min = number;
            }
        }
        System.out.println(min);
    }
}
