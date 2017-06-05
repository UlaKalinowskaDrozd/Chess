package gracze;

import szachownica.Ruch;
import szachownica.Szachownica;

/**
 *
 * @author Urszula Kalinowska-Drozd
 */

public abstract class Gracz {
    protected String kolor;
    protected String Imie;
    protected String Nazwisko;
    protected boolean czyDalejGramy = true;

    public abstract Ruch wykonajRuch(Szachownica szachownica);
    public String nazywaSię(){
        return Imie+" "+Nazwisko;
    }
    public String kolor(){
        return kolor;
    }

    public boolean czyDalejGramy(){
        return czyDalejGramy;
    }
}