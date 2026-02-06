package org.example;

public class ImprimanteCanon extends Imprimante {
    @Override
    public void imprime(String texte){
        System.out.println("Canon: " + texte);
    }
}
