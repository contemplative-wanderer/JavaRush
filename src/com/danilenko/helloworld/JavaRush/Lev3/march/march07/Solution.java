package com.danilenko.helloworld.JavaRush.Lev3.march.march07;

/*Выводим в консоли разные типы
В классе Solution есть метод printAnything(ArrayList), который должен принимать список и выводить его содержимое в консоли.
Сейчас на вход принимается только список строк. Твоя задача исправить метод так, чтобы принимался список с любыми типами данных (для этого нужно удалить соответствующий дженерик).
Метод main не участвует в проверке.
Требования:
Исправь сигнатуру метода printAnything, чтобы он принимал список с любыми типами данных.*/

import java.util.ArrayList;

public class Solution {
    public static void printAnything(ArrayList arrayList) {
        arrayList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        var arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add("Hello");
        arrayList.add(154);
        arrayList.add("string");

        printAnything(arrayList);
    }
}
