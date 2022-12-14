
import java.util.List;

public class FinDePartie {

    public final String ETATINITIAL;

    public FinDePartie(Damier damier) {
        ETATINITIAL = damier.listeCarreaux.toString();

    }

    public boolean gagner(List listeCarreaux) {
        return ETATINITIAL.equals(listeCarreaux.toString());

    }

}
