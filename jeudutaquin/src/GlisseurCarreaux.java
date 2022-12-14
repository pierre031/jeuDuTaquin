
import java.util.List;

public class GlisseurCarreaux {

    public Carreau saisieUtilisateur;
    Damier damier;

    public GlisseurCarreaux(Carreau saisieUtilisateur, Damier damier) {
        this.saisieUtilisateur = saisieUtilisateur;
        this.damier = damier;
    }

    public void glisserCarreaux() {
        int indexDepart = damier.listeCarreaux.indexOf(saisieUtilisateur);

        System.out.println(indexDepart);
        int indexDestination = damier.indexVide;
        System.out.println(indexDestination);

        Move move = new Move(indexDepart);

        if ((indexDepart + 1 == damier.indexVide) && ((indexDepart + 1) % (damier.nbColonne) != 0)) {
            move.droite(damier);
        }
        else if ((indexDepart - 1 == damier.indexVide) && ((indexDepart) % (damier.nbColonne) != 0)) {
            move.gauche(damier);
        }
        else if (indexDepart - damier.nbColonne == damier.indexVide) {
            move.haut(damier);
        }
        else if (indexDepart + damier.nbColonne == damier.indexVide) {
            move.bas(damier);
        } else {
            System.out.println("Mouvement impossible. Veuillez saisir un numéro valide.");
        }
    }
}
