package szachownica;

import bierki.Bierka;
import szachownica.Pole;

/**
 *
 * @author Urszula Kalinowska-Drozd
 */

public class Ruch {
    private Pole[] ruch;
    private boolean czyBicie=false;
    private Bierka bita;
    private boolean czyMat=false;

    public Ruch(Pole A, Pole B){
        ruch = new Pole[2];
        ruch[0] = A;
        ruch[1] = B;
        czyBicie=B.czyMaBierkę();
        if(czyBicie)bita=B.dajBierkę();
        if(czyBicie && (bita.dajNazwę()=='K' || bita.dajNazwę()=='k')) czyMat=true;
    }

    public Pole[] dajRuch(){
        return ruch;
    }

    public boolean czyBicie(){
        return czyBicie;
    }

    public Bierka bita(){
        return bita;
    }

    public boolean czyMat(){
        return czyMat;
    }
}
