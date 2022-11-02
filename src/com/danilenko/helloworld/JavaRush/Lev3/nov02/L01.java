package com.danilenko.helloworld.JavaRush.Lev3.nov02;

/* Упорядоченная информация
Создай public static void printHydrogenInfo() метод, который должен выводить все строки о водороде.
Также создай public static void printJavaInfo() метод, который будет выводить все строки об острове Ява.
Наконец, в методе main() вызови эти два метода.
Общий вывод в консоли не должен измениться.
Требования:
Должен существовать public static void printHydrogenInfo() метод.
Должен существовать public static void printJavaInfo() метод.
Метод printHydrogenInfo() должен выводить все существующие строки о водороде.
Метод printJavaInfo() должен выводить все существующие строки об острове Ява.
В методе main() должны вызываться методы printHydrogenInfo() и printJavaInfo().
Общий вывод в консоли не должен измениться.*/

public class L01 {

    public static void printHydrogenInfo() {
        System.out.println("Водород:");
        System.out.println("Это химический элемент периодической системы с обозначением H и атомным номером 1.");
        System.out.println("Является самым легким элементом таблицы.");
        System.out.println("Водород применяется в:");
        System.out.println("-Химической промышленности;");
        System.out.println("-Нефтеперерабатывающей промышленности;");
        System.out.println("-Авиации;");
        System.out.println("-Электроэнергетике.");
    }

    public static void printJavaInfo() {
        System.out.println("Остров Ява:");
        System.out.println("Входит в состав Индонезии.");
        System.out.println("На острове зародились государства Матарам, Маджапахит, Демак.");
        System.out.println("Ява является самым населенным островом в мире:");
        System.out.println("Общее население — 140 млн. человек.");
        System.out.println("Плотность населения — 1061 чел/км.кв.");
        System.out.println("Здесь производят один из знаменитых сортов кофе — Копи Лювак.");
    }

    public static void main(String[] args) {
        printHydrogenInfo();
        System.out.println();
        printJavaInfo(); //напишите тут ваш код
    }
}

