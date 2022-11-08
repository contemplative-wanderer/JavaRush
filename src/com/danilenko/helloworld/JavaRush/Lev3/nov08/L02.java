package com.danilenko.helloworld.JavaRush.Lev3.nov08;

/* Бесконечность не предел
В методе main вызови метод div() 2 раза. Первый раз — с такими аргументами, чтобы вывод в консоли был "Infinity", а второй — "-Infinity".
Код метода div() изменять нельзя.
Требования:
В методе main() метод div() должен вызываться 2 раза.
Результатом двух вызовов метода div() должен быть вывод в консоли "Infinity" и "-Infinity".
Код метода div() не изменяй.*/

public class L02 {

    public static void main(String[] args) {
        //напишите тут ваш код
        double a = 0.0;
        double b = 100.0;
        double c = -100.0;
        div(a, b);
        div(a, c);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
