package com.danilenko.helloworld.JavaRush.Lev3.febr.febr16;

/*Музей древностей.
Твоя задача — спроектировать класс Artifact.
Артефакты, которые хранятся в музее, бывают трех видов.
Первый — о которых неизвестно ничего, кроме порядкового номера, присвоенному музеем (например: 212121).
Второй — о которых известен порядковый номер и культура, которой он был создан (например: 212121, "Ацтеки").
Третий вид — о которых известен порядковый номер, культура, которой он был создан, и точный век его создания (например: 212121, "Ацтеки", 12).*/


public class Artifact {

    private int number;
    private String nameCulture;
    private int century;

    static int countUnidentified = 0;
    static int countIdentified = 0;

    public Artifact() {
        countUnidentified++;
        this.number = countUnidentified;
    }

    public Artifact(int number, String nameCulture) {
        this.number = number;
        this.nameCulture = nameCulture;
        countIdentified++;
    }

    public Artifact(int number, String nameCulture, int century) {
        this.number = number;
        this.nameCulture = nameCulture;
        this.century = century;
        countIdentified++;
    }

    public static void main(String[] args) {
        Artifact artifact = new Artifact();
        Artifact artifact1 = new Artifact();
        Artifact artifact2 = new Artifact();
        System.out.println("Number unidentified artifact " + countUnidentified);
        Artifact artifact3 = new Artifact(123, "Aztecs");
        Artifact artifact4 = new Artifact(321, "Aztecs");
        System.out.println("number " + artifact4.number + "/ nameCulture " + artifact4.nameCulture + "/ countIdentified " + countIdentified);
        Artifact artifact5 = new Artifact(321, "Aztecs", 12);
        System.out.println("number " + artifact4.number + "/ nameCulture " + artifact4.nameCulture + "/ century " + artifact5.century + "/ countIdentified " + countIdentified);
    }
}


