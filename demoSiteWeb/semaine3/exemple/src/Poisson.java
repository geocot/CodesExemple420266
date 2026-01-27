public class Poisson extends Animal {

    public Poisson(double taille, double poids, String couleur ) {
        this.taille = taille;
        this.poids = poids;
        this.couleur = couleur;
    }

    @Override
    public void seDeplacer() {
        System.out.println("Je nage");
    }
}
