package com.danilenko.helloworld.JavaRush.Lev3.oct28;

/*Треугольный массив
Создай треугольный массив, где значение каждого элемента — это сумма его индексов.
Выведи массив на экран в следующем виде:
0
1 2
2 3 4
3 4 5 6
4 5 6 7 8
5 6 7 8 9 10
...
Требования:
В методе main(String[]) двумерный массив result заполни числами согласно условию.
Выведенный текст должен содержать 10 строк.
Выведенные числа должны соответствовать условию.*/

public class L02 {

    public static int[][] result = new int[11][];

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            result[i] = new int[i];
            for (int j = 0; j < i; j++) {
                result[i][j] = i + j - 1;
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
