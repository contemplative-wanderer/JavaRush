package com.danilenko.helloworld.JavaRush.Lev3.oct02;

/*Напишем программу, в которой считываются целые числа. Потом посчитать сумму четных чисел,
        пока пользователь не введет слово "ENTER". Вывести на экран полученную сумму и завершить программу.*/

import java.util.Scanner;

public class L01 {

    public static void main(String[] args) {

        var scanner = new Scanner("2 5 5 2 enter");
        int sum = 0;

        while (true) {
            if (scanner.hasNextLine()) {
                if (scanner.hasNextInt()){
                    int number = scanner.nextInt();
                    if(number % 2 != 0) {
                        continue;
                    }
                    sum = number + sum;
                } else {
                    if("ENTER".equalsIgnoreCase(scanner.next())){
                        System.out.println(sum);
                        break;
                    }
                }
            }
        }
    }
}
