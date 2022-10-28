package com.danilenko.helloworld.JavaRush.Lev3.oct27;

/*Считать 6 строк и заполнить ими массив strings.
Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").*/

import java.util.Arrays;
import java.util.Scanner;

public class L03 {
    public static String[] strings;

    public static void main(String[] args) {
        //заполнение массива
        strings = new String[6];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            strings[i] = scan.nextLine();
        }
        //удаление дублей
        for (int i = 0; i < 5; i++) {
            var s = strings[i];
            if (s != null) {
                boolean isDublFound = false;
                for (int x = i + 1; x < strings.length; x++) {
                    if (s.equals(strings[x])) {
                        isDublFound = true;
                        strings[x] = null;
                    }
                }
                if (isDublFound) {
                    strings[i] = null;
                }
            }
        }
        Arrays.stream(strings).forEach(System.out::println);
    }
}
