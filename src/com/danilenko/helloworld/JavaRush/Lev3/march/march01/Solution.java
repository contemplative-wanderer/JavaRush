package com.danilenko.helloworld.JavaRush.Lev3.march.march01;

/*Разбираем пирамиду бокалов
Задача простая: нужно разобрать пирамиду из бокалов, в чем нам поможет метод removeGlassesReverse.
Этот метод должен снимать каждый ряд, начиная сверху (с конца списка). Тебе нужно реализовать этот метод.
В тестировании тебе поможет метод main.
Попробуй запустить программу и посмотреть на вывод.
Требования:
В классе Solution должен быть публичный статический метод removeGlassesReverse(ArrayList<String>).
Метод removeGlassesReverse должен удалить все элементы из переданного списка, начиная с конца (используй метод remove(int) у списка).*/

import java.util.ArrayList;

public class Solution {
    private static ArrayList<String> initList() {
        String glassTop = "       🍷       ";
        String glassSecond = "      🍷🍷      ";
        String glassThird = "     🍷🍷🍷     ";
        String glassFourth = "    🍷🍷🍷🍷    ";
        String glassFifth = "   🍷🍷🍷🍷🍷   ";
        String glassSixth = "  🍷🍷🍷🍷🍷🍷  ";
        String glassSeventh = " 🍷🍷🍷🍷🍷🍷🍷 ";
        String glassEighth = "🍷🍷🍷🍷🍷🍷🍷🍷";
        ArrayList<String> list = new ArrayList<>();
        list.add(glassEighth);
        list.add(glassSeventh);
        list.add(glassSixth);
        list.add(glassFifth);
        list.add(glassFourth);
        list.add(glassThird);
        list.add(glassSecond);
        list.add(glassTop);
        return list;
    }

    public static void print(ArrayList<String> glasses) {
        for (int i = glasses.size() - 1; i >= 0; i--) {
            System.out.println(glasses.get(i));
        }
    }

    public static void removeGlassesReverse(ArrayList<String> glasses) {
        System.out.println("Начинаем разбирать пирамиду");
        System.out.println(glasses.size());
        for (int i = glasses.size() - 1; i >= 0 ; i--) {
            glasses.remove(i);
            System.out.println(glasses.size());
        }
            System.out.println("Разобрали!");
    }

    public static void main(String[] args) {
        ArrayList<String> glasses = initList();
        print(glasses);

        removeGlassesReverse(glasses);
        print(glasses);
    }
}
