
public class Main {
    public static void main(String[] args) {
        Chien pitou = new Chien(60,10,"brun");
        pitou.seDeplacer();
        System.out.println(pitou.getPoids());

        Poisson doris = new Poisson(10,1,"bleu");
        doris.seDeplacer();
        doris.getPoids();
        System.out.println(doris.getPoids());

    }
}