
import java.util.ArrayList;
import java.util.List;

/* Class pour cree le damier
 */
public class Damier {

    // Attributs
    public int nbLigne;
    public int nbColonne;
    public Carreau empty = new Carreau(0);
    public int indexVide;
    public List<Carreau> listeCarreaux;

    // Constructor avec 2 parameter de type int : dimensions du damier
    public Damier(int nbLigne, int nbColonne) {
        if (validateNumber(nbLigne)) {
            this.nbLigne = nbLigne;
        }
        if (validateNumber(nbColonne)) {
            this.nbColonne = nbColonne;
        }
        // Creations de liste des carreaux
        createList();

        // Trouver la positions de carreau "vide"
        indexVide = listeCarreaux.indexOf(empty);
    }

    // Methods
    public void createList() {
        listeCarreaux = new ArrayList<>();
        for (int loop = 1; loop < (this.nbLigne * this.nbColonne); loop++) {
            listeCarreaux.add(new Carreau(loop));
        }
        listeCarreaux.add(empty);
    }

    // Method pour verifier que la dimensions du damier ne depas pas 10x10
    public boolean validateNumber(int number) {
        return ((number >= 2) && (number <= 10));
    }

    public void afficher() {
        for (int i = 1; i <= nbLigne * nbColonne; i++) {
            System.out.print("| " + listeCarreaux.get(i - 1) + " |");
            if (i % (nbColonne) == 0) {
                System.out.println("");
            }
        }
    }
}
