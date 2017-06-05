package szachownica;

import szachownica.Szachownica;
import gracze.Gracz;

/**
 *
 * @author Urszula Kalinowska-Drozd
 */

public class RozgrywkaSzachowa {

    public RozgrywkaSzachowa(Gracz gracz1, Gracz gracz2){
        Szachownica szach = new Szachownica();
        System.out.println("szachownica:");
        System.out.println(szach);
        System.out.println(gracz1.kolor()+": "+gracz1.nazywaSię());
        System.out.println(gracz2.kolor()+": "+gracz2.nazywaSię()+"\n");

        int i = 1;
        Ruch ruch;
        System.out.println("Tura "+1);

        while(i<=50 && gracz1.czyDalejGramy() && gracz2.czyDalejGramy()){
            ruch = gracz1.wykonajRuch(szach);

            if(ruch.czyBicie())
                System.out.println("Bicie: ("+ruch.dajRuch()[0].dajBierkę().dajNazwę()+") z "+(char)(ruch.dajRuch()[0].dajKolumnę()+65)+(ruch.dajRuch()[0].dajWiersz()+1)+" na "+(char)(ruch.dajRuch()[1].dajKolumnę()+65)+(ruch.dajRuch()[1].dajWiersz()+1)+" zbija "+ruch.bita().dajNazwę());
            else System.out.println("Ruch: ("+ruch.dajRuch()[0].dajBierkę().dajNazwę()+") z "+(char)(ruch.dajRuch()[0].dajKolumnę()+65)+(ruch.dajRuch()[0].dajWiersz()+1)+" na "+(char)(ruch.dajRuch()[1].dajKolumnę()+65)+(ruch.dajRuch()[1].dajWiersz()+1));

            if(gracz1.czyDalejGramy() || ruch.czyMat())
                System.out.println(szach);
            if(ruch.czyMat())System.out.println("Mat! Wygrał gracz biały.");
            if(gracz2.czyDalejGramy() && !ruch.czyMat()){
                ruch = gracz2.wykonajRuch(szach);
                if(ruch.czyBicie())
                    System.out.println("Bicie: ("+ruch.dajRuch()[0].dajBierkę().dajNazwę()+") z "+(char)(ruch.dajRuch()[0].dajKolumnę()+65)+(ruch.dajRuch()[0].dajWiersz()+1)+" na "+(char)(ruch.dajRuch()[1].dajKolumnę()+65)+(ruch.dajRuch()[1].dajWiersz()+1)+" zbija "+ruch.bita().dajNazwę());
                else{
                    if(gracz2.czyDalejGramy())
                        System.out.println("Ruch: ("+ruch.dajRuch()[0].dajBierkę().dajNazwę()+") z "+(char)(ruch.dajRuch()[0].dajKolumnę()+65)+(ruch.dajRuch()[0].dajWiersz()+1)+" na "+(char)(ruch.dajRuch()[1].dajKolumnę()+65)+(ruch.dajRuch()[1].dajWiersz()+1));
                }
                if(gracz2.czyDalejGramy() || ruch.czyMat())
                    System.out.println(szach);
                if(ruch.czyMat())System.out.println("Mat! Wygrał gracz czarny.");

                i++;
                if(gracz1.czyDalejGramy() && gracz2.czyDalejGramy() && i<=50 &&  !ruch.czyBicie())
                    System.out.println("Tura "+i);
                else if(gracz1.czyDalejGramy() && gracz2.czyDalejGramy() && i<=50 && !ruch.czyMat())
                    System.out.println("Tura "+i);
            }
            if(i==51 && !ruch.czyMat())
                System.out.println("Remis!");
        }

        System.out.println("Koniec gry");
    }

}