package com.danilenko.helloworld.JavaRush.Lev3.febr.febr27;

import java.util.ArrayList;
import java.util.Arrays;

/*Прощай, Паскаль
В методе main найди и удали язык программирования Pascal из списка programmingLanguages.
Требования:
В методе main должен удаляться Pascal из списка programmingLanguages.*/

public class Solution {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "Pascal", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < programmingLanguages.size(); i++) {
            if (programmingLanguages.get(i) == "Pascal") {
                programmingLanguages.remove(i);
            }
        }
        System.out.println(programmingLanguages);
    }
}