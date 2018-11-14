
package seriousgame;
import static seriousgame.Parametry.*;


public class StanGry {
    
    public int punkty;//liczba punktow
    
    public void odNowa(){
        punkty=0;
        terazPoziom=1;
    }//odNowa
    
    public void kolejnyPoziom(){
    terazPoziom++;
    }//kolejnyPoziom
    
}//class StanGry
