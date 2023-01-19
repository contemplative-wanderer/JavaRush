package com.danilenko.helloworld.JavaRush.Lev3.dec27;

/*Правильный класс
Исправь ошибки в коде, чтобы программа компилировалась и работала.
Требования:
Программа должна компилироваться и работать.
В программе должен быть публичный класс Solution.
В программе должен быть класс Cat.*/

public class L02 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name);
    }

    public static class Cat {
        String name = "Tom";
    }
}
