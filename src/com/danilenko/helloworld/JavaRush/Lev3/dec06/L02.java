package com.danilenko.helloworld.JavaRush.Lev3.dec06;

import java.util.Scanner;

/*Считать 10 чисел с консоли и заполнить ими массив с помощью метода getArrayOfTenElements().
Найти минимальный элемент массива и вернуть этот элемент с помощью метода min(int[]).
В методе min(int[]) обязательно используй метод Math.min(int, int).
Требования:
Программа должна считывать числа с клавиатуры.
Класс Solution должен содержать только три метода.
Метод getArrayOfTenElements() должен считать с клавиатуры 10 чисел, потом вернуть массив размером 10 элементов, заполненный считанными числами.
Метод min(int[]) должен вернуть минимальный элемент массива, используя метод min(int, int) класса Math.
Метод main() должен вызывать метод getArrayOfTenElements().
Метод main() должен вызывать метод min(int[]).*/

public class L02 {

    public static void main(String[] args) {
        System.out.println(min(getArrayOfTenElements()));
    }

    public static int[] getArrayOfTenElements() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            array[i] = number;
        }
        return array;
    }

    public static int min(int[] x) {
        int y;
        int min = x[0];
        for (int i = 0; i < x.length; i++) {
            y = Math.min(x[i], min);
            min = y;
        }
        return min;
    }
}
