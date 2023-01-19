package com.danilenko.helloworld.JavaRush.Lev3.dec26;

/*Утильный калькулятор
Давай проведем рефакторинг кода: вынесем отдельно утильные методы.
Для этого создай внутренний статический (вложенный) класс Calculator и перенеси в него методы add, subtract, multiply и divide.
Не забудь подкорректировать их вызовы.
Требования:
В классе Solution нужно создать вложенный (static nested) класс Calculator.
Методы add, subtract, multiply и divide нужно перенести в класс Calculator.
В методе main должны быть вызваны методы add, subtract, multiply и divide класса Calculator.*/

public class L02 {

    public static final String EQUAL = " = ";

    public static class Calculater {
        public void add(int a, int b) {
            System.out.println(a + " + " + b + EQUAL + (a + b));
        }

        public void subtract(int a, int b) {
            System.out.println(a + " - " + b + EQUAL + (a - b));
        }

        public void multiply(int a, int b) {
            System.out.println(a + " * " + b + EQUAL + (a * b));
        }

        public void divide(int a, int b) {
            System.out.println(a + " / " + b + EQUAL + (a / b));

        }
    }

    public static void main(String[] args) {
        int a = 45;
        int b = 15;

        Calculater calculater = new Calculater();

        calculater.add(a, b);
        calculater.subtract(a, b);
        calculater.multiply(a, b);
        calculater.divide(a, b);
    }
}
