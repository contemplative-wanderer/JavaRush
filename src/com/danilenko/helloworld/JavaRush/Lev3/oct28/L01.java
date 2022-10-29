package com.danilenko.helloworld.JavaRush.Lev3.oct28;

/*Таблица умножения
Проинициализируй массив MULTIPLICATION_TABLE значением new int[10][10], заполни его таблицей умножения и выведи в консоли в следующем виде:
1 2 3 4 …
2 4 6 8 …
3 6 9 12 …
4 8 12 16 …
…
Числа в строке разделены пробелом.
Требования:
В методе main массив MULTIPLICATION_TABLE должен быть заполнен таблицей умножения.
Выведенный текст должен содержать 10 строк.
Каждая выведенная строка должна содержать 10 чисел, разделенных пробелом.
Выведенные числа должны быть таблицей умножения.*/

public class L01 {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 0; i < 10; i++) {
            MULTIPLICATION_TABLE[i][0] = i + 1;
            MULTIPLICATION_TABLE[0][i] = i + 1;
        }
        for (int c = 0; c < 10; c++) {
            for (int s = 0; s < 10; s++) {
                MULTIPLICATION_TABLE[c][s] = MULTIPLICATION_TABLE[c][0] * MULTIPLICATION_TABLE[0][s];
                System.out.print(MULTIPLICATION_TABLE[c][s] + " ");
            }
            System.out.println("");
        }
    }
}
