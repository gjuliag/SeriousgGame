
package seriousgame;
import static seriousgame.Parametry.*;


public class StanGry {
    
    //public int punkty;//liczba punktow
    
    public static void odNowa(){
        //punkty=0;
        terazPoziom=1;
        ktoreSlowo=0;
    }//odNowa
    
    public static void kolejnyPoziom(){
    terazPoziom++;
    ktoreSlowo=0;
    
    }//kolejnyPoziom
    
    public static void kolejneSlowo(){
    ktoreSlowo++;
    }//kolejneSlowo
    
}//class StanGry
