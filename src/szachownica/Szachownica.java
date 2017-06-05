package szachownica;

import bierki.Goniec;
import bierki.Hetman;
import bierki.Król;
import bierki.Pionek;
import bierki.Skoczek;
import bierki.Wieża;
import java.util.ArrayList;

/**
 *
 * @author Urszula Kalinowska-Drozd
 */

public class Szachownica {
    private Pole[][] pola;
    public ArrayList<Pole> Białe = new ArrayList<Pole>();
    public ArrayList<Pole> Czarne = new ArrayList<Pole>();

    public Szachownica(){
        pola = new Pole[8][8];
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                pola[i][j] = new Pole(i,j);

            }
        }

        Król królB = new Król('K');
        Król królC = new Król('k');
        Pionek pionekB = new Pionek('P');
        Pionek pionekC = new Pionek('p');
        Skoczek skoczekB = new Skoczek('S');
        Skoczek skoczekC = new Skoczek('s');
        Wieża wieżaB = new Wieża('W');
        Wieża wieżaC = new Wieża('w');
        Goniec goniecB = new Goniec('G');
        Goniec goniecC = new Goniec('g');
        Hetman hetmanB = new Hetman('H');
        Hetman hetmanC = new Hetman('h');

        //Ustawiamy bierki na szachownicy:
        pola[0][3].postaw(królB);
        pola[7][3].postaw(królC);
        for(int i=0; i <8; i++){
            pola[1][i].postaw(pionekB);
            pola[6][i].postaw(pionekC);
        }
        pola[0][1].postaw(skoczekB);
        pola[0][6].postaw(skoczekB);
        pola[7][1].postaw(skoczekC);
        pola[7][6].postaw(skoczekC);
        pola[0][0].postaw(wieżaB);
        pola[0][7].postaw(wieżaB);
        pola[7][0].postaw(wieżaC);
        pola[7][7].postaw(wieżaC);
        pola[0][2].postaw(goniecB);
        pola[0][5].postaw(goniecB);
        pola[7][2].postaw(goniecC);
        pola[7][5].postaw(goniecC);
        pola[0][4].postaw(hetmanB);
        pola[7][4].postaw(hetmanC);

        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                if(i==0 || i==1) Białe.add(pola[i][j]);
                if(i==6 || i==7) Czarne.add(pola[i][j]);
            }
        }

    }

    @Override
    public String toString(){
        String napis = "   A B C D E F G H\n";
        for(int i=8; i>0; i--){
            String linia = i + ": ";
            for(int j=0; j<8; j++){
                if(pola[i-1][j].czyMaBierkę()==false){
                    linia = linia + ". ";
                }
                else{
                    linia = linia + pola[i-1][j].dajBierkę().dajNazwę() + " ";
                }
            }
            napis = napis + linia + " " + i + "\n";
        }
        napis = napis + "   A B C D E F G H\n";
        return napis;
    }

    public Pole[][] pola(){
        return pola;
    }
}