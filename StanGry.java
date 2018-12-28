
package seriousgame;
import static seriousgame.Parametry.*;


public class StanGry {
    
    //Zarządzanie stanem gry- rozpoczęcie nowej gry, zwiększenie poziomu, kolejne słowo.
    public static void odNowa(){
        
        terazPoziom=1;
        ktoreSlowo=0;
        RysowaniePanelu.punkty=0;
        RysowaniePanelu.k=0;
        RysowaniePanelu.klik=0;
        RysowaniePanelu.ktore=0;
        RysowaniePanelu.ok=0;
        RysowaniePanelu.zle=0;
        
    }//odNowa
    
    public static void kolejnyPoziom(){
        
        terazPoziom++;
        ktoreSlowo=0;
    
    }//kolejnyPoziom
    
    public static void kolejneSlowo(){
        
        ktoreSlowo++;
        
    }//kolejneSlowo
    
}//class StanGry
