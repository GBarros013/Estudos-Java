package com.projetono;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        No no1 = new No("Conteúdo no1");
        No no2 = new No("Conteúdo no2");

        no1.setProximono(no2);

        No no3 = new No("Conteúdo no3");
        no2.setProximono(no3);

        No no4 = new No("Conteúdo no4");
        no3.setProximono(no4);

        System.out.println(no1);
        System.out.println(no1.getProximono());
        System.out.println(no4.getProximono());
    }
}
