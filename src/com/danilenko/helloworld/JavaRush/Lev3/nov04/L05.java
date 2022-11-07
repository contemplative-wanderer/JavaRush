package com.danilenko.helloworld.JavaRush.Lev3.nov04;

/*Учет работников
Перед тобой — цифровая учетная карточка работника. В ней указано его имя, должность и зарплата.
Имя работника вряд ли поменяется, а вот должность и зарплата могут. Такие изменения вносятся с помощью методов setPosition() и setSalary().
Правда, сейчас они неправильно работают.
Разберись, в чем причина и исправь баги. При этом ни имена переменных класса, ни имена параметров методов изменять нельзя.
Требования:
Метод setPosition() должен устанавливать полученное значение переменной класса position.
Метод setSalary() должен устанавливать полученное значение переменной класса salary.
Изменять имена переменных класса нельзя.
Изменять имена параметров методов нельзя.*/

public class L05 {

    public static String name = "Amigo";
    public static String position = "Java developer";
    public static int salary = 10_000;

    public static void main(String[] args) {

        System.out.println(name);
        System.out.println(setPosition(position));
        System.out.println(setSalary(salary));
    }

    public static String setPosition(String position) {
        return "Senior " + position;
    }

    public static int setSalary(int salary) {
        return salary * 1000;
    }

}
