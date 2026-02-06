public class Poisson extends Animal{
    public Poisson(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void seDeplacer(){
        System.out.println("Je nage");
    }
}
