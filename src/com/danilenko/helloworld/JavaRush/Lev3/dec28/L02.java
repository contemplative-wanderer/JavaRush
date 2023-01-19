package com.danilenko.helloworld.JavaRush.Lev3.dec28;

/*Затенение поля класса
В методе main вызывается метод add, который должен увеличить значение поля salary класса Solution на переданное значение,
но при выводе поля salary получаем 0. Сделай так, чтобы программа работала правильно.
Требования:
В классе Solution должно быть публичное статическое поле salary типа int.
В классе Solution должен быть публичный статический метод add(int) с типом возвращаемого значения void.
Исправь ошибку, чтобы программа работала корректно.*/

public class L02 {
    public static int salary;

    public static void add(int increase) {
        salary = salary + increase;
    }

    public static void main(String[] args) {
        add(100500);
        System.out.println(salary);
        add(1);
        System.out.println(salary);
    }
}
