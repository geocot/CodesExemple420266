public class Etudiant
{
    private String nom;
    private String DA;
    private double note;

    public Etudiant(String nom, String DA) {
        this.nom = nom;
        this.DA = DA;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDA() {
        return DA;
    }

    public void setDA(String DA) {
        this.DA = DA;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        assert note<=100: "Note non valide";
        assert note>=0: "Note non valide";
        this.note = note;
    }
}
