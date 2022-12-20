package com.danilenko.helloworld.JavaRush.Lev3.dec15;

/*Обновление пути
Реализуй метод changePath(String, String) так, чтобы он заменял версию jdk в пути, полученном первым параметром метода, на версию, полученную вторым параметром, и возвращал новый путь.
Версия jdk начинается со строки "jdk" и заканчивается на "/".
Пример:
путь — "/usr/java/jdk1.8/bin/"
версия jdk — "jdk-13"
Метод changePath(путь, версия jdk) должен вернуть путь — "/usr/java/jdk-13/bin/".
Метод main() не принимает участия в тестировании.
Требования:
Нужно, чтобы метод changePath(String, String) был реализован согласно условию.*/

public class L03 {

    public static void main(String[] args) {

        String path = "/usr/java/jdk1.8/bin/";
        String change = "jdk-13";
        String newPath = changePath(path, change);
        System.out.println(newPath);

    }

    public static String changePath(String path, String change) {
        return path.replace("jdk1.8", change);
    }
}