package com.danilenko.helloworld.JavaRush.Lev3.march.march07;

import java.util.HashSet;

import static java.util.Arrays.asList;

/*Проверка присутствия
В классе Solution есть метод checkWords(String), который должен проверять наличие переданного слова в множестве words.
Если слово есть, то выводим в консоль:
Слово [переданное слово] есть в множестве
Если нет:
Слова [переданное слово] нет в множестве
Метод main не участвует в проверке.
Пример вывода:
Слово Java есть в множестве
Требования:
В классе Solution должно быть публичное статическое поле words типа HashSet<String>.
В классе Solution должен быть публичный статический метод checkWords(String) с типом возвращаемого значения void.
Метод checkWords(String) должен работать согласно условию.*/

public class L02 {
    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word) {
        if (words.contains(word)) {
            System.out.println("Слово " + word + " есть в множестве");
        } else {
            System.out.println("Слово " + word + " нет в множестве");
        }
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
