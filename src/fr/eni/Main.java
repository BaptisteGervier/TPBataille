package fr.eni;

public class Main {
    public static void main(String[] args) {
        Joueur bob = new Joueur("Morane", "Bob");
        Joueur chacal = new Joueur("Chacal", "Tou");
        Jeu jeu = new Jeu(bob, chacal);
        Joueur vainqueur = jeu.bataille();
        System.out.printf("%s %s a gagné", vainqueur.getNom(), vainqueur.getPrenom());
    }
}
