package com.danilenko.helloworld.JavaRush.Lev3.oct25;

/* Четные и нечетные ячейки массива
В методе main(String[]) тебе нужно заполнить массив strings значениями. Если индекс массива чётный —
присвоить значение "Чётный" (ноль — цифра чётная), иначе присвоить "Нечётный". Вывод текста в консоль в тестировании не участвует.
Требования:
В классе Solution должна быть публичная статическая переменная strings типа String[], проинициализированная массивом размером 5 элементов.
Метод main(String[]) должен заполнять массив согласно условию.*/

import java.util.Arrays;

public class L01 {

    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings = new String[5];

    public static void main(String[] args) {

        for (int i = 0; i < strings.length; i++) {

            if (i % 2 != 0) {
                strings[i] = ODD;
            } else {
                strings[i] = EVEN;
            }
        }
        System.out.println(Arrays.toString(strings));
    }
}
