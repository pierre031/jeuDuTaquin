
public class Move {
    public int indexDestination;
    public int indexDepart;
    
    public Move(int indexDepart) {
        this.indexDepart = indexDepart;
    }
    
    public void droite(Damier damier) {
        this.indexDestination = this.indexDepart + 1;
        deplacer(damier);
        }
    
    public void gauche(Damier damier) {
        this.indexDestination = this.indexDepart - 1;
        deplacer(damier);
    }
    
    public void haut(Damier damier) {
        this.indexDestination = this.indexDepart - damier.nbColonne;
        deplacer(damier);
    }
    
    public void bas(Damier damier) {
        this.indexDestination = this.indexDepart + damier.nbColonne;
        deplacer(damier);
    }
    
    public void deplacer(Damier damier) {
        damier.listeCarreaux.set(this.indexDestination, damier.listeCarreaux.get(this.indexDepart));
        damier.listeCarreaux.set(this.indexDepart, damier.empty);
    }
}
