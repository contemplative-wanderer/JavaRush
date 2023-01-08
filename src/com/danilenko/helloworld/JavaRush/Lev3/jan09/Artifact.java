package com.danilenko.helloworld.JavaRush.Lev3.jan09;

/*Музей древностей.
Твоя задача — спроектировать класс Artifact.
Артефакты, которые хранятся в музее, бывают трех видов.
Первый — о которых неизвестно ничего, кроме порядкового номера, присвоенному музеем (например: 212121).
Второй — о которых известен порядковый номер и культура, которой он был создан (например: 212121, "Ацтеки").
Третий вид — о которых известен порядковый номер, культура, которой он был создан, и точный век его создания
Четвертый вид — о котором ничего не известно, ему присваивается номер автоматически (count) */

public class Artifact {

    int number;
    String name;
    int century;
    static int count = 0;

    public Artifact(){
        count++;
        this.name = "находка № " + count;
    }
    public Artifact(int number){
        this.number = number;
    }

    public Artifact(int number, String name){
        this.number = number;
        this.name = name;
    }

    public Artifact(int number, String name, int century){
        this.number = number;
        this.name = name;
        this.century = century;
    }

    public static void main(String[] args) {
        Artifact artifact = new Artifact();
        Artifact artifact0 = new Artifact();
        Artifact artifact1 = new Artifact(255);
        Artifact artifact2 = new Artifact(345, "ring");
        Artifact artifact3 = new Artifact(235, "ring", 17);

        System.out.println(artifact.name);
        System.out.println(artifact0.name);
        System.out.println(artifact1.name);
        System.out.println(artifact2.name);
        System.out.println(artifact3.name);
    }
}
