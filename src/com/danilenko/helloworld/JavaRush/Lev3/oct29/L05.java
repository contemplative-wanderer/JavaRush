package com.danilenko.helloworld.JavaRush.Lev3.oct29;

/* Метод Array.sort()
Проинициализировать одномерный массив строк. Отсортировать массив по алфавиту.*/

import java.util.Arrays;

public class L05 {

    public static void main(String[] args) {

        String[] str = new String[]{"Hello", "Yes", "Also", "Soccer", "Slip", "Bay", "Sorry", "What", "Where", "SQL"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
    }
}
