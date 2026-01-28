package ClassesAbstraites;

public class Chien extends Animal {
    public Chien(double taille, double poids, String couleur ) {
        super(poids, couleur, taille);
    }

    @Override
    public void seDeplacer() {
        System.out.println("Je marche et je cours à 4 pattes");
    }
}
