

import java.util.Collections;
import java.util.Scanner;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
/**
 *
 * @author Andrii, Olga, Pierre
 * LDNR formation CDA 2022
 */
public class JeuDuTaquin {

    public static void main(String[] args) {

// Demo temporaire
        System.out.println("Hello");

        int nbLigne;
        int nbColonne;
//Demande de saisie à l'utilisateur
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisissez le nombre de lignes : ");
        nbLigne = scanner.nextInt();

        System.out.println("Saisissez le nombre de colonnes : ");
        nbColonne = scanner.nextInt();

//Initialisation du damier et affichage
        Damier damier = new Damier(nbLigne, nbColonne);
        damier.afficher();

        FinDePartie condition = new FinDePartie(damier);

        Collections.shuffle(damier.listeCarreaux);
        System.out.println("======================================");
        damier.indexVide = damier.listeCarreaux.indexOf(damier.empty);
        damier.afficher();


//Début du jeu
//Mélange des carreaux
//Boucle tant que le damier n'est pas revenu dans son état initial
        do {
            System.out.println("Saisissez le numéro du carreau que vous souhaitez bouger.");
            String targetName = (new Carreau(scanner.nextInt())).getName();
            Carreau carreau = null;
            for (Carreau c : damier.listeCarreaux) {
                if (targetName.equals(c.getName())) {
                    carreau = c;
                    break;
                }
            }
            GlisseurCarreaux glisserCarreaux = new GlisseurCarreaux(carreau, damier);
            glisserCarreaux.glisserCarreaux();
            damier.indexVide = damier.listeCarreaux.indexOf(damier.empty);
            damier.afficher();


        } while (!condition.gagner(damier.listeCarreaux));
        System.out.println("Bravo ! La partie est gagnée !");

    }

}
