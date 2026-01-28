package ClassesAbstraites;

public class Poisson extends Animal {

    public Poisson(double taille, double poids, String couleur ) {
        super(poids, couleur, taille);
    }
    public void faitDesBulles(){
        System.out.println("OoooOooo");
    }

    @Override
    public void seDeplacer() {
        System.out.println("Je nage");
    }
}
