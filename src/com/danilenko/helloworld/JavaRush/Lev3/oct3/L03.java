package com.danilenko.helloworld.JavaRush.Lev3.oct3;

/* Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
Для этого необходимо использовать бесконечный цикл (while(true)).
Подсказка: чтобы завершить бесконечный цикл, используй оператор break.*/

import java.util.Scanner;

public class L03 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        while (true){
            String line = scanner.nextLine();
            if (line.equals("enough")){
                break;
            }
        }
    }
}
