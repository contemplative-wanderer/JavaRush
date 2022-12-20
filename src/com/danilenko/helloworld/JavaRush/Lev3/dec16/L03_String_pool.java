package com.danilenko.helloworld.JavaRush.Lev3.dec16;

/*String pool
Метод equal(String, String) сравнивает строки по ссылке, используя оператор ==.
Нужно сделать так, чтобы метод возвращал true, если содержимое строк одинаковое, и false — если разное, не используя метод equals().
Требования:
Нужно, чтобы в методе equal(String, String) строки сравнивались по содержимому, но используя оператор ==.
Нужно, чтобы метод equal(String, String) возвращал true, если строки одинаковые.
Нужно, чтобы метод equal(String, String) возвращал false, если строки разные.
Метод equals() использовать нельзя */


public class L03_String_pool {

    public static void main(String[] args) {

        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String firstCheckingInt, String secondCheckingInt) {
        String t1 = firstCheckingInt.intern();
        String t2 = secondCheckingInt.intern();
        return t1 == t2;
    }
}