package gracze;

import gracze.Gracz;
import java.util.*;
import java.util.Random;
import szachownica.Pole;
import szachownica.Ruch;
import szachownica.Szachownica;

/**
 *
 * @author Urszula Kalinowska-Drozd
 */

public class GraczLosowy extends Gracz {
    public GraczLosowy(String kolor, String Imię, String Nazwisko){
        this.kolor = kolor;
        this.Imie = Imię;
        this.Nazwisko = Nazwisko;
    }

    @Override
    public Ruch wykonajRuch(Szachownica szachownica){
        Ruch mójRuch;
        ArrayList<Ruch> ruchy = new ArrayList<Ruch>();
        if(kolor=="Biały"){
            for(Pole p : szachownica.Białe){
                ruchy.addAll(p.dajBierkę().jakieRuchy(p, szachownica));
            }
        }if(kolor=="Czarny"){
            for(Pole p : szachownica.Czarne){
                ruchy.addAll(p.dajBierkę().jakieRuchy(p, szachownica));
            }
        }
        try{
            Random randomGenerator = new Random();
            int index = randomGenerator.nextInt(ruchy.size());
            mójRuch = ruchy.get(index);

            if(mójRuch.dajRuch()[1].czyMaBierkę()){
                if(mójRuch.czyMat()){
                    czyDalejGramy=false;
                }
            }

            szachownica.Białe.remove(mójRuch.dajRuch()[0]);
            szachownica.Czarne.remove(mójRuch.dajRuch()[0]);
            szachownica.Białe.remove(mójRuch.dajRuch()[1]);
            szachownica.Czarne.remove(mójRuch.dajRuch()[1]);

            if(kolor=="Biały") szachownica.Białe.add(mójRuch.dajRuch()[1]);
            if(kolor=="Czarny") szachownica.Czarne.add(mójRuch.dajRuch()[1]);

            mójRuch.dajRuch()[1].postaw(mójRuch.dajRuch()[0].dajBierkę());
            mójRuch.dajRuch()[0].zdejmij();

        }catch(IllegalArgumentException e){
            mójRuch = new Ruch(szachownica.pola()[0][0],szachownica.pola()[0][0]);
            if(kolor=="Biały")
                System.out.println("Wygrał gracz czarny.");
            if(kolor=="Czarny")
                System.out.println("Wygrał gracz biały.");
            czyDalejGramy=false;
        }

        return mójRuch;
    }
}