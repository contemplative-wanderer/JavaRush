package com.danilenko.helloworld.JavaRush.Lev3.dec14;

public class L02 {

    public static String partyFace = "\uD83E\uDD73";
    public static String ballon = "\uD83C\uDF88";
    public static String gift = "\uD83C\uDD81";
    public static String partyPopper = "\uD83C\uDF89";
    public static String cake = "\uD83E\uDF82";

    public static void main(String[] args) {
        printCongratulation();
    }

    public static void printCongratulation() {
        String happyBirthday = "С днем рождения!";
        String congratulation = partyFace + ballon + partyPopper + cake + gift;
        System.out.println(happyBirthday + congratulation);
    }
}