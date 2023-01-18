package com.danilenko.helloworld.JavaRush.Lev3.dec25;

/*Конвертер строки
В методе main конвертируй строку string в тип double с помощью статического метода parseDouble класса Double.
Затем округли полученное значение, используя статический метод round класса Math.
Результат выведи на экран.
Требования:
В методе main должен вызываться метод parseDouble класса Double.
В методе main должен вызываться метод round класса Math.
В консоли должно выводиться число 13. */

public class L01 {

    public static void main(String[] args) {
        String string = "12.84";

        //напишите тут ваш код
        double string1 = Double.parseDouble(string);

        System.out.println(Math.round(string1));
    }
}
