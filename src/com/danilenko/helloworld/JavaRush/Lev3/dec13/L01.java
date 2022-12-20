package com.danilenko.helloworld.JavaRush.Lev3.dec13;

/*Экранирование символов
Выведи на экран следующий текст в две строки:
It's a Windows path: "C:\Program Files\Java\jdk-13.0.0\bin"
It's a Java string: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"
Подсказка:
\” – экранирование двойной кавычки;
\\ – экранирование обратной косой черты (\).
Больше про экранирование символов и Escape-последовательности в Java читай в статье "Экранирование символов в Java".
Требования:
Нужно, чтобы программа выводила текст.
Нужно, чтобы было выведено две строки.
Текст первой строки должен быть: It's a Windows path: "C:\Program Files\Java\jdk-13.0.0\bin"
Текст второй строки должен быть: It's a Java string: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"
 */

public class L01 {

    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println("It's a Windows path: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"\nIt's a Java string:\\\"C:\\\\Program Files\\\\Java\\\\jdk-13.0.0\\\\bin\\\"");
    }
}
