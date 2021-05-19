package fr.eni;

import java.util.Random;

public class Jeu {

    private Joueur joueur1;
    private Joueur joueur2;

    public Jeu(Joueur joueur1, Joueur joueur2) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
    }

    public Joueur bataille() {
        //tire une carte au hasard
        Random random = new Random();
        Valeur[] valeurs = Valeur.values();
        Couleur[] couleur = Couleur.values();
        int valeurC1;
        int valeurC2;
    do {

        //joueur 1
        valeurC1 = random.nextInt(13);
        int couleurC1 = random.nextInt(4);
        Carte cartej1 = new Carte(couleur[couleurC1], valeurs[valeurC1]);
        System.out.println("Carte du joueur 1 : " + cartej1);


        //joueur 2
        valeurC2 = random.nextInt(13);
        int couleurC2 = random.nextInt(4);
        Carte cartej2 = new Carte(couleur[couleurC2], valeurs[valeurC2]);
        System.out.println("Carte du joueur 2 : " + cartej2);
        if (valeurC1 == valeurC2){
            System.out.println("Egalité, on recommance !");
        }
    } while (valeurC1 == valeurC2);

        if (valeurC1 > valeurC2){
            return this.joueur1;
        } else {
            return this.joueur2;
        }

    }
}

