package com.danilenko.helloworld.JavaRush.Lev3.march.march07;

/*Оформляем возврат
В классе Solution есть метод arrayToHashSet(String[]), который должен из переданного массива вернуть HashSet<String> с теми же элементами.
Метод main не участвует в проверке.
Требования:
В классе Solution должен быть public static HashSet<String> arrayToHashSet(String[]) метод.*/

import java.util.Arrays;
import java.util.HashSet;

public class L01 {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < args.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for (String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        HashSet<String> str = new HashSet<>(Arrays.asList(strings));
        return str;
    }
}
