package com.danilenko.helloworld.JavaRush.Lev3.dec08.L02;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

 /*0 -> Бесспорно 1 -> Определённо да 2 -> Вероятнее всего 3 -> Хорошие перспективы
    4 -> Спроси позже 5 -> Попробуй снова 6 -> Мой ответ — нет 7 -> Весьма сомнительнo */

    public static String getPrediction() {
        String[] array = {CERTAIN, DEFINITELY, MOST_LIKELY, OUTLOOK_GOOD, ASK_AGAIN_LATER, TRY_AGAIN, NO, VERY_DOUBTFUL};
        Random x = new Random();
        int number = x.nextInt(8);
        if (0 <= number && number <= array.length) {
            return array[number];
        } else {
            return null;
        }
    }
}
