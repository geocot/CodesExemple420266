package Interfaces;

public class Ville implements Affichable{
    private String nom;
    private int population;

    public Ville(String nom, int population) {
        this.nom = nom;
        this.population = population;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public void affiche() {
        System.out.println("Le nom de la ville est " + this.nom);
    }
}
