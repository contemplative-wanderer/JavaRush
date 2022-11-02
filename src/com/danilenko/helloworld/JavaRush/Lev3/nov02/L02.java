package com.danilenko.helloworld.JavaRush.Lev3.nov02;

/* Упорядоченная информация
Переименуй параметры метода printPersonInfo():
firstName в name;
lastName в surname;
favouriteDish в meal;
таким образом, чтобы функционал программы остался неизменным.
Имена переменных в методе main() оставь без изменений.
Требования:
Параметры метода printPersonInfo() должны называться name, surname и meal.
Вывод в консоль должен соответствовать условию задачи.
В методе main() переменные firstName, lastName, favouriteDish должны остаться без изменений.*/

public class L02 {

    public static void main(String[] args) {
        String firstName = "Ольга";
        String lastName = "Киприяновна";
        String favouriteDish = "Пельмени";
        printPersonInfo(firstName, lastName, favouriteDish);
    }

    public static void printPersonInfo(String name, String surname, String meal) {

        System.out.println("Краткое досье:");
        System.out.println("Имя : " + name);
        System.out.println("Фамилия : " + surname);
        System.out.println("Любимое блюдо : " + meal);
    }
}
