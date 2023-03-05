package com.danilenko.helloworld.JavaRush.Lev3.march.march5;

/*Охотники за привидением: в погоне за типами
В методе main создается и заполняется список разными объектами и передается методу checkElementsType(ArrayList<Object>).
Твоя задача — реализовать этот метод, который должен определить тип каждого элемента списка, а также:
Для типа String вызывать printString();
Для типа Integer вызывать printInteger();
Для типа Integer[] вызывать printIntegerArray();
Для всех остальных типов вызывать printUnknown().
Метод main не участвует в проверке.
Требования:
Не изменять объявление и реализацию метода printString(String).
Не изменять объявление и реализацию метода printInteger(Integer).
Не изменять объявление и реализацию метода printIntegerArray(Integer[]).
Не изменять объявление и реализацию метода printUnknown(Object).
Метод checkElementsType(ArrayList<Object>) должен работать согласно условию.*/

import java.util.ArrayList;


public class L02 {

    public static void main(String[] args) {
        var elements = new ArrayList<>();
        elements.add("Привет");
        elements.add(10);
        elements.add(new Integer[15]);
        elements.add(new LinkageError());

        checkElementsType(elements);
    }

    public static void checkElementsType(ArrayList<Object> elements) {
        for (var element : elements) {
            if (element instanceof String) {
                printString();
                continue;
            }
            if (element instanceof Integer) {
                printInteger();
                continue;
            }
            if (element instanceof Integer[]) {
                printIntegerArray();
            } else {
                printUnknown();
            }
        }
    }

    public static void printString() {
        System.out.println("Строка");
    }

    public static void printInteger() {
        System.out.println("Целое число");
    }

    public static void printIntegerArray() {
        System.out.println("Массив целых чисел");
    }

    public static void printUnknown() {
        System.out.println("Другой тип данных");
    }
}
