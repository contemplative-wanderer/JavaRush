package com.danilenko.helloworld;

public class Solution {

    public static void main(String[] args) {
        // тип имя = создание объекта
        Duck duck1 = new Duck("Ga");                      // TODO 1 дак тип пременной = new дает возможность создавать метод под этот класс
        Duck duck2 = new Duck("Gy" , "2");
        Duck duck3 = new Duck("Gi ", "5");
        char c = '3';                                           //TODO это (char) примитив из которых состоит String
        System.out.println(duck1);
        System.out.println(duck2);
        System.out.println(duck3.toString().toCharArray()[0]); //TODO "duck3.toString().toCharArray()[3]" - в переменной duck3 вызвали пременную String, а из String вызвали Char (примитив из которых сотоит Char) из общего массива (Array) и указали показать 3 символ (отсчет идет с 0)

        Cat cat1 = new Cat("Lu");
        Cat cat2 = new Cat("Li");
        System.out.println(cat1);
        System.out.println(cat2);

        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Guf");
        System.out.println(dog1);
        System.out.println(dog2);

    }

    public static class Duck {      // TODO создаю класс Duck

        /* ПЕРЕМЕННАЯ (ПОЛЕ)*/
        private String name;        // TODO создаю поле (переменную) String с именем "name", приватную

        /* КОНСТРУКТОР */
        public Duck(String name) { // TODO конструктор (для задания значения) классу Duck поля String name
            this.name = name;      //TODO этому примитиву name присваиваем значение name
        }
        public Duck(String name, String s) {         // TODO - в классе Duck вызываем две переменные String name и String s
            this.name = name + s;              //TODO -  в name пишем name и s
        }

        /* МЕТОДЫ */
        public String toString() {   // TODO
            return name;             //TODO - возвращает name
        }

    }

    public static class Cat {

        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return name;
        }

        /* public String toString() {
            return "Miay";
        } */
    }

    public static class Dog {

        public String name;

        public Dog (String name) {
            this.name = name;
        }

        public String toString() {
            return name;
        }

       /* public String toString() {
            return "Gav";
        } */
    }

    /*public static String pov(int n) {
        return n*2 + "";
    }*/

}