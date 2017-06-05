package bierki;

import szachownica.Ruch;
import szachownica.Pole;
import szachownica.Szachownica;
import java.util.ArrayList;

/**
 *
 * @author Urszula Kalinowska-Drozd
 */

public class Pionek extends Bierka {
    public Pionek(char nazwa){
        this.nazwa = nazwa;
    }

    @Override
    public ArrayList<Ruch> jakieRuchy(Pole p, Szachownica szachownica){

        ArrayList<Ruch> ruchy = new ArrayList<Ruch>();
        if(nazwa=='P'){
            if(p.dajWiersz()+1<8){
                if(p.dajKolumnę()-1>=0 && szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()-1].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()-1].dajBierkę().dajNazwę()))
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()-1]));
                if(p.dajKolumnę()+1<8 && szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()+1].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()+1].dajBierkę().dajNazwę()))
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()+1]));
                if(!szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()].czyMaBierkę())
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()]));
            }
        }
        if(nazwa=='p'){
            if(p.dajWiersz()-1>=0){
                if(p.dajKolumnę()-1>=0 && szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()-1].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()-1].dajBierkę().dajNazwę()))
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()-1]));
                if(p.dajKolumnę()+1<8 && szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()+1].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()+1].dajBierkę().dajNazwę()))
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()+1]));
                if(!szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()].czyMaBierkę())
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()]));
            }
        }

        return ruchy;
    }
}
