
package seriousgame;

import java.io.FileNotFoundException;


public class Glowna {
    
    //Metoda uruchamia grę- tworzy okno gry o podanych wymiarach na środku ekranu. 
    
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        
        int x=(Parametry.szerokoscOkna-Parametry.szerGry)/2;
        int y=(Parametry.wysokoscOkna-Parametry.wysGry)/2;
        
        OknoGry og= new OknoGry(Parametry.szerGry, Parametry.wysGry, x , y);
    
    }//main
    
}//class Glowna
