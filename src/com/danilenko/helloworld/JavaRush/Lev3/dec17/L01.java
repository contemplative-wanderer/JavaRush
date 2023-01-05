package com.danilenko.helloworld.JavaRush.Lev3.dec17;

/*StringBuilder
Нужно реализовать 2 метода, используя StringBuilder: addTo(String, String[]), replace(String, String, int, int).
Метод addTo(String, String[]) добавляет к строке, полученной первым параметром, все строки по порядку из массива строк,
полученного вторым параметром, и возвращает объект типа StringBuilder на основе этой строки.
Чтобы добавить новое значение к существующему объекту типа StringBuilder, нужно вызвать у него метод append(String), в который передать это новое значение.
Метод replace(String, String, int, int) заменяет часть строки, полученной первым параметром, начиная с индекса,
полученного третьим параметром, и заканчивая индексом, полученным четвертым параметром, на строку, полученную вторым параметром,
и возвращает объект типа StringBuilder на основе этой строки.
Чтобы заменить часть значения объекта типа StringBuilder, нужно у него вызвать метод replace(int, int, String),
в который передать начальную и конечную позицию для замены, а также новое значение.
Требования:
Нужно, чтобы метод addTo(String, String[]) был реализован согласно условию.
Нужно, чтобы метод replace(String, String, int, int) был реализован согласно условию.*/


public class L01 {

    public static void main(String[] args) {

        String string = "Учиться, учиться и еще раз учиться! ";
        String[] arrayText = new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"};
        StringBuilder newStrb = addTo(string, arrayText);
        String newStr = newStrb.toString();
        System.out.println(newStrb);
        System.out.println(replace(string, newStr, 17, 27));
    }

    public static StringBuilder addTo(String str, String[] text) {
        StringBuilder strb = new StringBuilder(str);
        for (int i = 0; i < text.length; i++) {
            strb.append(text[i]);
        }
        return strb;
    }

    public static StringBuilder replace(String str, String newStrb, int start, int end) {
        StringBuilder srtb = new StringBuilder(str);
        srtb.replace(start, end, newStrb);
        return srtb;
    }
}
