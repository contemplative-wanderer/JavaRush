package com.danilenko.helloworld.JavaRush.Lev3.nov03;

/*Добро пожаловать! Но не всем.
Перед тобой метод signIn(), который приветствует пользователей сайта. Сейчас он приветствует всех пользователей, а должен только зарегистрированных.
Имена всех незарегистрированных пользователей — "user".
Добавь проверку имени пользователя в начало метода signIn().
Если имя "user", прерви выполнение метода, используя ключевое слово return.
Требования:
Если имя пользователя "user", метод signIn() должен прекратить работу, не выводя ничего в консоли.
Если имя пользователя не "user", метод signIn() должен продолжать работу и вывести строки приветствия в консоли.
Для прерывания работы метода signIn() должно использоваться ключевое слово return.*/

import java.util.Scanner;

public class L03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String name = scanner.nextLine();
            signIn(name);
        }
    }

    public static void signIn(String username) {
        //напишите тут ваш код
        if (!username.equals("user")) {
            System.out.println("Добро пожаловать " + username);
            System.out.println("Очень скучали по Вам, " + username);
        }
    }
}
