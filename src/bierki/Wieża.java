package bierki;

import java.util.ArrayList;
import szachownica.Pole;
import szachownica.Ruch;
import szachownica.Szachownica;

/**
 *
 * @author Urszula Kalinowska-Drozd
 */

public class Wieża extends Figura {
    public Wieża(char nazwa){
        this.nazwa = nazwa;
    }

    @Override
    public ArrayList<Ruch> jakieRuchy(Pole p, Szachownica szachownica){

        ArrayList<Ruch> ruchy = new ArrayList<Ruch>();

        if(nazwa=='W'){
            int i=1;
            while(p.dajWiersz()-i>=0 && !szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()].czyMaBierkę()){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()]));
                i++;
            }
            if(p.dajWiersz()-i>=0 && szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()].dajBierkę().dajNazwę())) ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()]));
            i=1;
            while(p.dajWiersz()+i<8 && !szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()].czyMaBierkę()){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()]));
                i++;
            }
            if(p.dajWiersz()+i<8 && szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()].dajBierkę().dajNazwę())) ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()]));
            i=1;
            while(p.dajKolumnę()+i<8 && !szachownica.pola()[p.dajWiersz()][p.dajKolumnę()+i].czyMaBierkę()){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()][p.dajKolumnę()+i]));
                i++;
            }
            if(p.dajKolumnę()+i<8 && szachownica.pola()[p.dajWiersz()][p.dajKolumnę()+i].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()][p.dajKolumnę()+i].dajBierkę().dajNazwę())) ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()][p.dajKolumnę()+i]));
            i=1;
            while(p.dajKolumnę()-i>=0 && !szachownica.pola()[p.dajWiersz()][p.dajKolumnę()-i].czyMaBierkę()){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()][p.dajKolumnę()-i]));
                i++;
            }
            if(p.dajKolumnę()-i>=0 && szachownica.pola()[p.dajWiersz()][p.dajKolumnę()-i].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()][p.dajKolumnę()-i].dajBierkę().dajNazwę())) ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()][p.dajKolumnę()-i]));

        }
        if(nazwa=='w'){
            int i=1;
            while(p.dajWiersz()-i>=0 && !szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()].czyMaBierkę()){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()]));
                i++;
            }
            if(p.dajWiersz()-i>=0 && szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()].dajBierkę().dajNazwę())) ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()]));
            i=1;
            while(p.dajWiersz()+i<8 && !szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()].czyMaBierkę()){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()]));
                i++;
            }
            if(p.dajWiersz()+i<8 && szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()].dajBierkę().dajNazwę())) ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()]));
            i=1;
            while(p.dajKolumnę()+i<8 && !szachownica.pola()[p.dajWiersz()][p.dajKolumnę()+i].czyMaBierkę()){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()][p.dajKolumnę()+i]));
                i++;
            }
            if(p.dajKolumnę()+i<8 && szachownica.pola()[p.dajWiersz()][p.dajKolumnę()+i].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()][p.dajKolumnę()+i].dajBierkę().dajNazwę())) ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()][p.dajKolumnę()+i]));
            i=1;
            while(p.dajKolumnę()-i>=0 && !szachownica.pola()[p.dajWiersz()][p.dajKolumnę()-i].czyMaBierkę()){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()][p.dajKolumnę()-i]));
                i++;
            }
            if(p.dajKolumnę()-i>=0 && szachownica.pola()[p.dajWiersz()][p.dajKolumnę()-i].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()][p.dajKolumnę()-i].dajBierkę().dajNazwę())) ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()][p.dajKolumnę()-i]));

        }

        return ruchy;
    }
}
