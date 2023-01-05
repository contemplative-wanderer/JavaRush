package com.danilenko.helloworld.JavaRush.Lev3.dec15;

/*Проверка URL-адреса
В этой задаче тебе нужно выполнить проверку URL-адреса.
Простая схема URL-адреса выглядит так:
<сетевой протокол>://<название ресурса>.<домен>
Метод checkProtocol(String) проверяет, какой сетевой протокол (http или https) у URL-адреса, полученного входящим параметром, и возвращает результат проверки — строку название сетевого протокола.
А метод checkDomain(String) проверяет, какой домен (com, net, org или ru) у URL-адреса, полученного входящим параметром, и возвращает результат проверки — строку название домена.
Если URL-адрес начинается не с http или https, то результат будет — "неизвестный". Если URL-адрес заканчивается не на com, net, org или ru, то результат будет — "неизвестный".
main не принимает участие в тестировании.
Требования:
Нужно, чтобы метод checkProtocol(String) был реализован согласно условию.
Нужно, чтобы метод checkDomain(String) был реализован согласно условию.*/

public class L01 {

    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        /*for (String url : urls) {
            System.out.println(url);
        }*/


        for (int i = 0; i < urls.length; i++) {
            String url = urls[i];
        }


        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        if (url.startsWith("http")) {
            return "http";
        } else if (url.startsWith("https")) {
            return "https";
        } else {
            return "неизвестный";
        }
    }

    public static String checkDomain(String domain) {
        if (domain.endsWith("com")) {
            return "com";
        } else if (domain.endsWith("net")) {
            return "net";
        } else if (domain.endsWith("org")) {
            return "org";
        } else if (domain.endsWith("ru")) {
            return "ru";
        } else {
            return "неизвестный";
        }
    }
}