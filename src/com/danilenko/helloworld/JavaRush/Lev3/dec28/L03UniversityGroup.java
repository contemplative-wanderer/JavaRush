package com.danilenko.helloworld.JavaRush.Lev3.dec28;

import java.util.ArrayList;
import java.util.List;

/*Почувствуй себя деканом
У нас есть группа в университете и метод, который должен отчислять конкретного студента, но он почему-то не работает.
Твоя задача — найти ошибку и исправить, чтобы метод exclude смог отчислить студента.
Требования:
В классе UniversityGroup должно быть публичное не статическое поле students типа List<String>.
В классе UniversityGroup должен быть публичный не статический метод exclude(String) с типом возвращаемого значения void.
Метод exclude должен удалять из списка переданного студента.*/

public class L03UniversityGroup {
    public List<String> students = new ArrayList<>();

    public L03UniversityGroup() {
        students.add("Сергей Фрединский");
        students.add("Виталий Правдивый");
        students.add("Максим Козыменко");
        students.add("Наталия Андрющенко");
        students.add("Ира Величенко");
        students.add("Николай Соболев");
        students.add("Снежана Слободенюк");
    }

    public void exclude(String excludedStudent) {
        students.removeIf(student -> student.equals(excludedStudent));
    }

    public static void main(String[] args) {
        L03UniversityGroup universityGroup = new L03UniversityGroup();
        universityGroup.exclude("Виталий Правдивый");
        universityGroup.students.forEach(System.out::println);
    }
}
