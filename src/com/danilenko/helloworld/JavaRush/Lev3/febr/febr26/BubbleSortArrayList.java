package com.danilenko.helloworld.JavaRush.Lev3.febr.febr26;

/*Сортировка пузырьком ArrayList
Перед тобой программа, которая сортирует элементы списка по возрастанию методом "пузырька".
Перепиши код, чтобы вместо списка ArrayList<Integer> numbers использовался массив int[] numbers.
Методы main() и print() не принимают участие в проверке.
Требования:
Поле numbers должно быть типа int[].
Поле numbers должно инициализироваться десятью числами при создании.
Метод sort() должен сортировать элементы массива int[] numbers по возрастанию. */

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSortArrayList {
    static ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(56, 45, 89, 1, 45, 13, 4, 69, 11, -89));
    //public static int[] numbers = {56, 45, 89, 1, 45, 13, 4, 69, 11, -89};

    public static void main(String[] args) {
        print();
        sort();
        System.out.println("\nОтсортированные числа в натуральном порядке:");
        print();
    }

    public static void sort() {
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = 0; j < numbers.size() - 1 - i; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
    }

    public static void print() {
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }
}
