package com.danilenko.helloworld.JavaRush.Lev3.march.march08;

import java.util.*;

/*Переводим итератор в цикл for-each
В классе Solution есть методы printHashSet(HashSet<String>) и printList(ArrayList<String>), которые выводят все элементы из
переданных коллекций — списка и множества — с новой строки. Твоя задача переписать методы на использование цикла for-each.
Метод main не участвует в проверке.
Требования:
В классе Solution должен быть публичный статический метод printHashSet(HashSet<String>) с типом возвращаемого значения void.
В классе Solution должен быть публичный статический метод printList(ArrayList<String>) с типом возвращаемого значения void.
Метод printHashSet(HashSet<String>) должен выводить все элементы с помощью цикла for-each.
Метод printList(ArrayList<String>) должен выводить все элементы с помощью цикла for-each.*/

public class L01 {
    public static void printList(ArrayList<String> words) {
        for (String str : words) {
            System.out.println(str);
        }
        //words.forEach((w)->System.out.println (w));
    }

    public static void printHashSet(HashSet<String> words) {
        for (String str : words) {
            System.out.println(str);
        }
        //words.forEach((w)->System.out.println (w));
    }

    public static void main(String[] args) {
        String[] wordsArray = "Думаю, это будет новой фичей. Только не говорите никому, что она возникла случайно.".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHashSet(wordsHashSet);
    }
}
