package bierki;

import szachownica.Ruch;
import szachownica.Pole;
import szachownica.Szachownica;
import java.util.ArrayList;

/**
 *
 * @author Urszula Kalinowska-Drozd
 */

public class Król extends Figura {
    public Król(char nazwa){
        this.nazwa = nazwa;
    }

    @Override
    public ArrayList<Ruch> jakieRuchy(Pole p, Szachownica szachownica){

        ArrayList<Ruch> ruchy = new ArrayList<Ruch>();
        if(nazwa=='K'){
            if(p.dajKolumnę()-1>=0){
                if(p.dajWiersz()-1>=0 && !szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()-1].czyMaBierkę()) //puste pole
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()-1]));
                if(p.dajWiersz()-1>=0 && szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()-1].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()-1].dajBierkę().dajNazwę())) //pole z bierką przeciwnika
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()-1]));
                if(!szachownica.pola()[p.dajWiersz()][p.dajKolumnę()-1].czyMaBierkę()) //puste pole
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()][p.dajKolumnę()-1]));
                if(szachownica.pola()[p.dajWiersz()][p.dajKolumnę()-1].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()][p.dajKolumnę()-1].dajBierkę().dajNazwę())) //pole z bierką przeciwnika
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()][p.dajKolumnę()-1]));
                if(p.dajWiersz()+1<8 && !szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()-1].czyMaBierkę()) //puste pole
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()-1]));
                if(p.dajWiersz()+1<8 && szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()-1].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()-1].dajBierkę().dajNazwę())) //pole z bierką przeciwnika
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()-1]));
            }
            if(p.dajWiersz()-1>=0 && !szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()].czyMaBierkę()) //puste pole
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()]));
            if(p.dajWiersz()-1>=0 && szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()].dajBierkę().dajNazwę()))
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()]));
            if(p.dajWiersz()+1<8 && !szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()].czyMaBierkę()) //puste pole
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()]));
            if(p.dajWiersz()+1<8 && szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()].dajBierkę().dajNazwę()))
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()]));
            if(p.dajKolumnę()+1<8){
                if(p.dajWiersz()-1>=0 && !szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()+1].czyMaBierkę()) //puste pole
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()+1]));
                if(p.dajWiersz()-1>=0 && szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()+1].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()+1].dajBierkę().dajNazwę())) //pole z bierką przeciwnika
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()+1]));
                if(!szachownica.pola()[p.dajWiersz()][p.dajKolumnę()+1].czyMaBierkę()) //puste pole
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()][p.dajKolumnę()+1]));
                if(szachownica.pola()[p.dajWiersz()][p.dajKolumnę()+1].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()][p.dajKolumnę()+1].dajBierkę().dajNazwę())) //pole z bierką przeciwnika
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()][p.dajKolumnę()+1]));
                if(p.dajWiersz()+1<8 && !szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()+1].czyMaBierkę()) //puste pole
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()+1]));
                if(p.dajWiersz()+1<8 && szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()+1].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()+1].dajBierkę().dajNazwę())) //pole z bierką przeciwnika
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()+1]));
            }
        }
        if(nazwa=='k'){
            if(p.dajKolumnę()-1>=0){
                if(p.dajWiersz()-1>=0 && !szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()-1].czyMaBierkę()) //puste pole
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()-1]));
                if(p.dajWiersz()-1>=0 && szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()-1].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()-1].dajBierkę().dajNazwę())) //pole z bierką przeciwnika
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()-1]));
                if(!szachownica.pola()[p.dajWiersz()][p.dajKolumnę()-1].czyMaBierkę()) //puste pole
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()][p.dajKolumnę()-1]));
                if(szachownica.pola()[p.dajWiersz()][p.dajKolumnę()-1].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()][p.dajKolumnę()-1].dajBierkę().dajNazwę())) //pole z bierką przeciwnika
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()][p.dajKolumnę()-1]));
                if(p.dajWiersz()+1<8 && !szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()-1].czyMaBierkę()) //puste pole
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()-1]));
                if(p.dajWiersz()+1<8 && szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()-1].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()-1].dajBierkę().dajNazwę())) //pole z bierką przeciwnika
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()-1]));
            }
            if(p.dajWiersz()-1>=0 && !szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()].czyMaBierkę()) //puste pole
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()]));
            if(p.dajWiersz()-1>=0 && szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()].dajBierkę().dajNazwę()))
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()]));
            if(p.dajWiersz()+1<8 && !szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()].czyMaBierkę()) //puste pole
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()]));
            if(p.dajWiersz()+1<8 && szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()].dajBierkę().dajNazwę()))
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()]));
            if(p.dajKolumnę()+1<8){
                if(p.dajWiersz()-1>=0 && !szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()+1].czyMaBierkę()) //puste pole
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()+1]));
                if(p.dajWiersz()-1>=0 && szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()+1].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()+1].dajBierkę().dajNazwę())) //pole z bierką przeciwnika
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()+1]));
                if(!szachownica.pola()[p.dajWiersz()][p.dajKolumnę()+1].czyMaBierkę()) //puste pole
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()][p.dajKolumnę()+1]));
                if(szachownica.pola()[p.dajWiersz()][p.dajKolumnę()+1].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()][p.dajKolumnę()+1].dajBierkę().dajNazwę())) //pole z bierką przeciwnika
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()][p.dajKolumnę()+1]));
                if(p.dajWiersz()+1<8 && !szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()+1].czyMaBierkę()) //puste pole
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()+1]));
                if(p.dajWiersz()+1<8 && szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()+1].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()+1].dajBierkę().dajNazwę())) //pole z bierką przeciwnika
                    ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()+1]));
            }
        }

        return ruchy;
    }
}
