import szachownica.RozgrywkaSzachowa;
import gracze.GraczLosowy;

/**
 *
 * @author Urszula Kalinowska-Drozd
 */

public class Szachy {

    public static void main(String[] args) {
        GraczLosowy gracz1 = new GraczLosowy("Biały", "Jakub", "Puchatek");
        GraczLosowy gracz2 = new GraczLosowy("Czarny", "Maria", "Poppins");
        RozgrywkaSzachowa rozgrywka = new RozgrywkaSzachowa(gracz1, gracz2);
    }

}