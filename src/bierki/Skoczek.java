package bierki;

import java.util.ArrayList;
import szachownica.Pole;
import szachownica.Ruch;
import szachownica.Szachownica;

/**
 *
 * @author Urszula Kalinowska-Drozd
 */

public class Skoczek extends Figura {
    public Skoczek(char nazwa){
        this.nazwa = nazwa;
    }

    @Override
    public ArrayList<Ruch> jakieRuchy(Pole p, Szachownica szachownica){

        ArrayList<Ruch> ruchy = new ArrayList<Ruch>();

        if(nazwa=='S'){
            if(p.dajKolumnę()-2>=0 && p.dajWiersz()-1>=0 && (!szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()-2].czyMaBierkę() || (szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()-2].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()-2].dajBierkę().dajNazwę())))){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()-2]));
            }
            if(p.dajKolumnę()-1>=0 && p.dajWiersz()-2>=0 && (!szachownica.pola()[p.dajWiersz()-2][p.dajKolumnę()-1].czyMaBierkę() || (szachownica.pola()[p.dajWiersz()-2][p.dajKolumnę()-1].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()-2][p.dajKolumnę()-1].dajBierkę().dajNazwę())))){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-2][p.dajKolumnę()-1]));
            }
            if(p.dajKolumnę()+2<8 && p.dajWiersz()-1>=0 && (!szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()+2].czyMaBierkę() || (szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()+2].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()+2].dajBierkę().dajNazwę())))){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()+2]));
            }
            if(p.dajKolumnę()+1<8 && p.dajWiersz()-2>=0 && (!szachownica.pola()[p.dajWiersz()-2][p.dajKolumnę()+1].czyMaBierkę() || (szachownica.pola()[p.dajWiersz()-2][p.dajKolumnę()+1].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()-2][p.dajKolumnę()+1].dajBierkę().dajNazwę())))){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-2][p.dajKolumnę()+1]));
            }
            if(p.dajKolumnę()-2>=0 && p.dajWiersz()+1<8 && (!szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()-2].czyMaBierkę() || (szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()-2].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()-2].dajBierkę().dajNazwę())))){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()-2]));
            }
            if(p.dajKolumnę()-1>=0 && p.dajWiersz()+2<8 && (!szachownica.pola()[p.dajWiersz()+2][p.dajKolumnę()-1].czyMaBierkę() || (szachownica.pola()[p.dajWiersz()+2][p.dajKolumnę()-1].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()+2][p.dajKolumnę()-1].dajBierkę().dajNazwę())))){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+2][p.dajKolumnę()-1]));
            }
            if(p.dajKolumnę()+1<8 && p.dajWiersz()+2<8 && (!szachownica.pola()[p.dajWiersz()+2][p.dajKolumnę()+1].czyMaBierkę() || (szachownica.pola()[p.dajWiersz()+2][p.dajKolumnę()+1].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()+2][p.dajKolumnę()+1].dajBierkę().dajNazwę())))){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+2][p.dajKolumnę()+1]));
            }
            if(p.dajKolumnę()+2<8 && p.dajWiersz()+1<8 && (!szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()+2].czyMaBierkę() || (szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()+2].czyMaBierkę() && !Character.isUpperCase(szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()+2].dajBierkę().dajNazwę())))){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()+2]));
            }
        }
        if(nazwa=='s'){
            if(p.dajKolumnę()-2>=0 && p.dajWiersz()-1>=0 && (!szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()-2].czyMaBierkę() || (szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()-2].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()-2].dajBierkę().dajNazwę())))){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()-2]));
            }
            if(p.dajKolumnę()-1>=0 && p.dajWiersz()-2>=0 && (!szachownica.pola()[p.dajWiersz()-2][p.dajKolumnę()-1].czyMaBierkę() || (szachownica.pola()[p.dajWiersz()-2][p.dajKolumnę()-1].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()-2][p.dajKolumnę()-1].dajBierkę().dajNazwę())))){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-2][p.dajKolumnę()-1]));
            }
            if(p.dajKolumnę()+2<8 && p.dajWiersz()-1>=0 && (!szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()+2].czyMaBierkę() || (szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()+2].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()+2].dajBierkę().dajNazwę())))){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-1][p.dajKolumnę()+2]));
            }
            if(p.dajKolumnę()+1<8 && p.dajWiersz()-2>=0 && (!szachownica.pola()[p.dajWiersz()-2][p.dajKolumnę()+1].czyMaBierkę() || (szachownica.pola()[p.dajWiersz()-2][p.dajKolumnę()+1].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()-2][p.dajKolumnę()+1].dajBierkę().dajNazwę())))){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()-2][p.dajKolumnę()+1]));
            }
            if(p.dajKolumnę()-2>=0 && p.dajWiersz()+1<8 && (!szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()-2].czyMaBierkę() || (szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()-2].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()-2].dajBierkę().dajNazwę())))){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()-2]));
            }
            if(p.dajKolumnę()-1>=0 && p.dajWiersz()+2<8 && (!szachownica.pola()[p.dajWiersz()+2][p.dajKolumnę()-1].czyMaBierkę() || (szachownica.pola()[p.dajWiersz()+2][p.dajKolumnę()-1].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()+2][p.dajKolumnę()-1].dajBierkę().dajNazwę())))){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+2][p.dajKolumnę()-1]));
            }
            if(p.dajKolumnę()+1<8 && p.dajWiersz()+2<8 && (!szachownica.pola()[p.dajWiersz()+2][p.dajKolumnę()+1].czyMaBierkę() || (szachownica.pola()[p.dajWiersz()+2][p.dajKolumnę()+1].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()+2][p.dajKolumnę()+1].dajBierkę().dajNazwę())))){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+2][p.dajKolumnę()+1]));
            }
            if(p.dajKolumnę()+2<8 && p.dajWiersz()+1<8 && (!szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()+2].czyMaBierkę() || (szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()+2].czyMaBierkę() && Character.isUpperCase(szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()+2].dajBierkę().dajNazwę())))){
                ruchy.add(new Ruch(p,szachownica.pola()[p.dajWiersz()+1][p.dajKolumnę()+2]));
            }
        }

        return ruchy;
    }
}