public class Chien extends Animal{
    private int nbPattes;
    public Chien(String nom, int age, int nbPattes) {
        super(nom, age);
        this.nbPattes = nbPattes;
    }

    public int getNbPattes() {
        return nbPattes;
    }

    public void setNbPattes(int nbPattes) {
        this.nbPattes = nbPattes;
    }

    public void typeNom(){
        System.out.println("Je suis un chien avec le nom " + getNom());
    }
    @Override
    public void seDeplacer(){
        System.out.println("Je marche");
    }
}
