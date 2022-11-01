package com.danilenko.helloworld.JavaRush.Lev3.oct29;

/* Выводим массивы
Реализуй метод main(String[]), который выводит массивы strings и ints в консоли с помощью метода Arrays.toString().
Требования:
В классе Solution должна быть публичная статическая переменная strings типа String[].
В классе Solution должна быть публичная статическая переменная ints типа int[].
В методе main(String[]) выведи в консоли массив strings с помощью метода Arrays.toString(Object[]).
В методе main(String[]) выведи в консоли массив ints с помощью метода Arrays.toString(int[]).*/

import java.util.Arrays;

public class L01 {

    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        String str = Arrays.toString(strings);
        String in = Arrays.toString(ints);
        System.out.println(str);
        System.out.println(in);
    }
}
