package org.example;

public class Main {
    public static void main(String[] args) {
        ImprimanteCanon imprimanteCanon = new ImprimanteCanon();
        Document d = new Document("Blablabla", "Martin", imprimanteCanon);
        d.imprime();
    }
}