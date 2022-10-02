package com.danilenko.helloworld.JavaRush.Lev3;

/*Ввести с клавиатуры имя и, используя цикл while, 10 раз вывести: <имя> любит
        меня (переменная text). Каждый вывод - с новой строки. Пример вывода
        на экран для имени Света: Света любит меня. Света любит меня. Света любит меня. Света любит меня.*/

import java.util.Scanner;

public class L_22_09_30_3 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String text = name + " любит меня";
        int i = 0;

        while(i < 10){
            System.out.println(text);
            i++;
        }
    }
}
