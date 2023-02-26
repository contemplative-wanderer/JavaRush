package com.danilenko.helloworld.JavaRush.Lev3.febr.febr26;

/*Сортировка пузырьком
Перед тобой программа, которая сортирует элементы списка по возрастанию методом "пузырька".
Методы main() и print() не принимают участие в проверке.
Требования:
Поле numbers должно инициализироваться десятью числами при создании.
Метод sort() должен сортировать элементы массива int[] numbers по возрастанию. */

public class BubbleSort {
    public static int[] numbers = {56, 45, 89, 1, 45, 13, 4, 69, 11, -89};

    public static void main(String[] args) {
        print();
        sort();
        System.out.println("\nОтсортированные числа в натуральном порядке:");
        print();
    }

    public static void sort() {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
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
