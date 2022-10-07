package com.danilenko.helloworld.JavaRush.Lev3.oct08;

/* Используя цикл for написать фрагмент кода, который находит сумму для заданного n:
                            5 + 10 + 15 + … + 5·n                                    */

import java.util.Scanner;

public class L02 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.print("Vvedite chislo 'n': ");
        int n = scanner.nextInt();
        int i, g;
        int summa = 0;

        for (i = 1; i <= n; i++){
            g = i * 5;
            summa = summa + g;
        }
        System.out.println(summa);
    }
}
