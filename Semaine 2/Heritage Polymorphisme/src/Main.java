import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Chien pitou = new Chien("Pitou", 18, 4);
        Poisson doris = new Poisson("Doris", 2);

        ArrayList<Animal> animaux = new ArrayList<>();
        animaux.add(pitou);
        animaux.add(doris);

        for (Animal a : animaux){
            a.seDeplacer();
        }

    }
}