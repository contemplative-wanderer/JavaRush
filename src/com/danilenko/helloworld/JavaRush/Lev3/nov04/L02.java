package com.danilenko.helloworld.JavaRush.Lev3.nov04;

/*У всего есть корень
        Метод printSqrt(int[] array) должен выводить корень квадратный для каждого элемента переданного массива.
Но этого не происходит из-за конфликта имен переменных. Исправь имена переменных так, чтобы код компилировался.
В результате работы программа должна выводить в консоли соответствующую строку для каждого элемента массива.
Пример строки:
Корень квадратный для числа 64 равен 8.0
Требования:
Код должен компилироваться.
Метод printSqrt(int[] array) для каждого элемента массива должен выводить строку согласно условию.*/

public class L02 {

    public static void main(String[] args) {
        int[] array = {15, 64, 9, 51, 42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elSqrt = Math.sqrt(element);
            System.out.println("Корень квадратный для числа " + element + " равен " + elSqrt);
        }
    }
}
