public class Animal {
   private String nom;
    private int age;

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    protected String getNom() {
        return nom;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void seDeplacer(){
        System.out.println("Je me déplace");
    }
}
