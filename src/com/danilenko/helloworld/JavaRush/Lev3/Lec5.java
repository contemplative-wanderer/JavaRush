package com.danilenko.helloworld.JavaRush.Lev3;

import java.util.Scanner;

//Вывести на консоль значения строки (ряда чисел), которые кратны 10.

public class Lec5 {

    public static void main(String[] args) {

        var scanner = new Scanner("10 20 22 30 40 50 55 60 70");

        while (scanner.hasNext()){
            int n = scanner.nextInt();
            if(n % 10 == 0){
                System.out.println(n);
            }
        }
    }
}
