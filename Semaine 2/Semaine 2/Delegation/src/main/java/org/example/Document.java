package org.example;

public class Document {
    private String title;
    private String author;
    private Imprimante imprimante;

    public Document(String title, String author, Imprimante imprimante) {
        this.title = title;
        this.author = author;
        this.imprimante = imprimante;
    }

    public void imprime(){
        imprimante.imprime("Document:" + title +"-" + author);
    }
}
