package bierki;

import szachownica.Ruch;
import szachownica.Pole;
import szachownica.Szachownica;
import java.util.ArrayList;

/**
 *
 * @author Urszula Kalinowska-Drozd
 */

public abstract class Bierka {
    protected char nazwa;

    public abstract ArrayList<Ruch> jakieRuchy(Pole p, Szachownica szachownica);
    public char dajNazwę(){
        return nazwa;
    }
}