import ClassesAbstraites.Animal;
import ClassesAbstraites.Chien;
import ClassesAbstraites.Poisson;

public class Main {
    public static void main(String[] args) {
        Chien pluto = new Chien(60,10,"brun");
        pluto.seDeplacer();
        System.out.println(pluto.getPoids());

        Poisson doris = new Poisson(10,1,"bleu");
        doris.seDeplacer();
        doris.getPoids();
        System.out.println(doris.getPoids());

        //Création d'un groupe d'animaux de 2
        Animal groupe[] =new Animal[2];
        groupe[0] = pluto;
        groupe[1] = doris;
        groupe[0].seDeplacer();
        groupe[1].seDeplacer();
        // Ceci ne fonctionne pas Poisson p = groupe[1];
        //L'élément groupe[1].faitDesBulles() ne fonctionne pas, même si c'est un poisson.
    }
}