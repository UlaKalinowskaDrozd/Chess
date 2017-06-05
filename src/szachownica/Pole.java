package szachownica;

import bierki.Bierka;

/**
 *
 * @author Urszula Kalinowska-Drozd
 */

public class Pole {
    private final int kolumna;
    private final int wiersz;
    private boolean czyMaBierkę;
    private Bierka bierka;

    public Pole(int wiersz, int kolumna){
        this.wiersz = wiersz;
        this.kolumna = kolumna;
        this.czyMaBierkę = false;
    }

    public boolean czyMaBierkę(){
        return czyMaBierkę;
    }

    public Bierka dajBierkę(){
        return bierka;
    }

    public void postaw(Bierka bierka){
        this.bierka = bierka;
        this.czyMaBierkę = true;
    }

    public void zdejmij(){
        this.czyMaBierkę = false;
    }

    public int dajWiersz(){
        return wiersz;
    }

    public int dajKolumnę(){
        return kolumna;
    }
}
