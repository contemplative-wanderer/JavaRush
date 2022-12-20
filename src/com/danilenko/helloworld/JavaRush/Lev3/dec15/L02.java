package com.danilenko.helloworld.JavaRush.Lev3.dec15;

/*Поиск в строке
Метод getIndexFromFirstWord(String, String) и метод getIndexFromLastWord(String, String) принимают строку и слово.
Нужно, чтобы метод getIndexFromFirstWord(String, String) вернул индекс первого символа первого слова (второй параметр метода) в строке (первый параметр метода).
А метод getIndexFromLastWord(String, String) вернул индекс первого символа последнего слова (второй параметр метода) в строке (первый параметр метода).
Пример:
строка — "Чтобы стать программистом, нужно писать код. Чтобы писать код, нужно учиться. Чтобы учиться, нужно желание."
слово — "код"
метод getIndexFromFirstWord(строка, слово) должен вернуть 40
метод getIndexFromLastWord(строка, слово) должен вернуть 58
Метод main() не принимает участия в тестировании.
Требования:
Нужно вывести на экран индекс первого символа первого слова (второй параметр метода) в строке (первый параметр метода).
Нужно вывести на экран индекс первого символа последнего слова (второй параметр метода) в строке (первый параметр метода).*/

public class L02 {

    public static void main(String[] args) {
        String test = "Чтобы стать программистом, нужно писать код. Чтобы писать код, нужно учиться. Чтобы учиться, нужно желание.";
        String word = "код";
        int first = getIndexFromFirstWord(test, word);
        int last = getIndexFromLastWord(test, word);
        System.out.println(first);
        System.out.println(last);

    }

    public static int getIndexFromFirstWord(String test, String word) {
        int firstIndex = test.indexOf(word);
        return firstIndex;
    }

    public static int getIndexFromLastWord(String test, String word) {
        int lastIndex = test.lastIndexOf(word);
        return lastIndex;
    }
}
