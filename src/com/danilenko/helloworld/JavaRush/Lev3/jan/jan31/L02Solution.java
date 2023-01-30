package com.danilenko.helloworld.JavaRush.Lev3.jan.jan31;

/*Сравнение чисел
Метод compare(Character, Character) принимает два символа, выводит в консоли результат их сравнения.
Реализуй метод compare(Character, Character), который должен правильно сравнивать символы.
Если код первого символа больше второго, вывести "больше".
Если код первого символа меньше второго, вывести "меньше".
Если код первого символа равен второму, вывести "равны"
Требования:
Исправь работу метода compare(Character, Character) с помощью корректировки типов входящих параметров или с помощью изменения одного условия.*/

public class L02Solution {

    public static void main(String[] args) {
        compare('a', 'a');
        compare('a', 'б');
        compare('р', 'в');
        compare('ы', 'ы');
    }

    public static void compare(Character first, Character second) {
        if ((char) first == second) {
            System.out.println("равны");
        } else if (first > second) {
            System.out.println("больше");
        } else if (first < second) {
            System.out.println("меньше");
        } else {
            System.out.println("А как такое может быть???");
        }
    }
}
