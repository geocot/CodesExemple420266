public class Chien extends Animal{
    public Chien(double taille, double poids, String couleur ) {
        this.taille = taille;
        this.poids = poids;
        this.couleur = couleur;
    }

    @Override
    public void seDeplacer() {
        System.out.println("Je marche et je cours à 4 pattes");
    }
}
