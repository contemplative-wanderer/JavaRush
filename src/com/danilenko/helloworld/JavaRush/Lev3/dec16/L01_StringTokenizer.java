package com.danilenko.helloworld.JavaRush.Lev3.dec16;

/*StringTokenizer
Используя StringTokenizer раздели query на части по разделителю delimiter.
Пример:
getTokens("java.util.stream", "\\.")
возвращает массив строк
{"java", "util", "stream"}
Hint: решить задачу поможет метод countTokens().
Требования:
Нужно, чтобы метод getTokens(String, String) использовал StringTokenizer.
Нужно, чтобы метод getTokens(String, String) возвращал массив типа String, заполненный согласно условию задачи.*/


import java.util.Arrays;
import java.util.StringTokenizer;

public class L01_StringTokenizer {

    public static void main(String[] args) {

        String query = "com.javarush.task.pro.task09.task0915";
        String delimiter = ".a";
        System.out.println(Arrays.toString(getTokens(query, delimiter)));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer str = new StringTokenizer(query, delimiter);
        String[] a = new String[str.countTokens()];
        for (int i = 0; i < a.length; i++) {
            a[i] = str.nextToken();
        }
        return a;
    }
}