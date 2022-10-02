package com.danilenko.helloworld.JavaRush.Lev3;

/*Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму,
        пока пользователь не введет слово "ENTER". Вывести на экран полученную сумму и завершить программу.*/

import java.util.Scanner;

public class L_22_10_01_1 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            if (scanner.hasNextLine()) {
                if (scanner.hasNextInt()){
                    int number = scanner.nextInt();
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
