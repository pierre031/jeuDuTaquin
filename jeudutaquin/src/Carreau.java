/* Class Carreau pour cree les object carreux
 */

public class Carreau{

    // Attributs
    private String name;

    // Constructor avec 1 parameter de type int
    public Carreau(int number) {
        setName(number);
    }

    // Methods
    public String getName() {
        return name;
    }

    // Convertions des integer vers string
    public void setName(int number) {
        if (number == 0) {
            this.name = "  "; // Nom "  "
        } else if (number < 10) {
            this.name = (" " + number); // Noms " 1", " 2", " 3" ... " 9"
        } else {
            this.name = ("" + number); // Noms "10", "11" ... "99"
        }
    }

    @Override
    public String toString() {
        return getName();
    }

}
