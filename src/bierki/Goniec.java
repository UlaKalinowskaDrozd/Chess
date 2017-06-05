package bierki;

import java.util.ArrayList;
import szachownica.Pole;
import szachownica.Ruch;
import szachownica.Szachownica;

/**
 *
 * @author Urszula Kalinowska-Drozd
 */

public class Goniec extends Figura {
    public Goniec(char nazwa){
        this.nazwa = nazwa;
    }

    @Override
    public ArrayList<Ruch> jakieRuchy(Pole p, Szachownica szachownica){

        ArrayList<Ruch> ruchy = new ArrayList<Ruch>();

        if(nazwa=='G'){
            int i=1;
            while(p.dajWiersz()-i>=0 && p.dajKolumnę()-i>=0 && !szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()-i].czyMaBierkę()){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()-i]));
                i++;
            }
            if(p.dajWiersz()-i>=0 && p.dajKolumnę()-i>=0 && szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()-i].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()-i].dajBierkę().dajNazwę())) ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()-i]));
            i=1;
            while(p.dajWiersz()+i<8 && p.dajKolumnę()-i>=0 && !szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()-i].czyMaBierkę()){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()-i]));
                i++;
            }
            if(p.dajWiersz()+i<8 && p.dajKolumnę()-i>=0 && szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()-i].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()-i].dajBierkę().dajNazwę())) ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()-i]));
            i=1;
            while(p.dajWiersz()-i>=0 && p.dajKolumnę()+i<8 && !szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()+i].czyMaBierkę()){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()+i]));
                i++;
            }
            if(p.dajWiersz()-i>=0 && p.dajKolumnę()+i<8 && szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()+i].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()+i].dajBierkę().dajNazwę())) ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()+i]));
            i=1;
            while(p.dajWiersz()+i<8 && p.dajKolumnę()+i<8 && !szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()+i].czyMaBierkę()){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()+i]));
                i++;
            }
            if(p.dajWiersz()+i<8 && p.dajKolumnę()+i<8 && szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()+i].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()+i].dajBierkę().dajNazwę())) ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()+i]));

        }
        if(nazwa=='g'){
            int i=1;
            while(p.dajWiersz()-i>=0 && p.dajKolumnę()-i>=0 && !szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()-i].czyMaBierkę()){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()-i]));
                i++;
            }
            if(p.dajWiersz()-i>=0 && p.dajKolumnę()-i>=0 && szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()-i].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()-i].dajBierkę().dajNazwę())) ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()-i]));
            i=1;
            while(p.dajWiersz()+i<8 && p.dajKolumnę()-i>=0 && !szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()-i].czyMaBierkę()){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()-i]));
                i++;
            }
            if(p.dajWiersz()+i<8 && p.dajKolumnę()-i>=0 && szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()-i].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()-i].dajBierkę().dajNazwę())) ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()-i]));
            i=1;
            while(p.dajWiersz()-i>=0 && p.dajKolumnę()+i<8 && !szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()+i].czyMaBierkę()){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()+i]));
                i++;
            }
            if(p.dajWiersz()-i>=0 && p.dajKolumnę()+i<8 && szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()+i].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()+i].dajBierkę().dajNazwę())) ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-i][p.dajKolumnę()+i]));
            i=1;
            while(p.dajWiersz()+i<8 && p.dajKolumnę()+i<8 && !szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()+i].czyMaBierkę()){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()+i]));
                i++;
            }
            if(p.dajWiersz()+i<8 && p.dajKolumnę()+i<8 && szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()+i].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()+i].dajBierkę().dajNazwę())) ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+i][p.dajKolumnę()+i]));

        }
        return ruchy;
    }
}