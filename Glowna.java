
package seriousgame;

import java.awt.Toolkit;
import java.io.FileNotFoundException;


public class Glowna {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        
        //pole graficzne gry
        int szerokoscGry=1024;
        int wysokoscGry=768;
        
        int szerokoscOkna=Toolkit.getDefaultToolkit().getScreenSize().width;
        int wysokoscOkna=Toolkit.getDefaultToolkit().getScreenSize().height;
        
        int x=(szerokoscOkna-szerokoscGry)/2;
        int y=(wysokoscOkna-wysokoscGry)/2;
        OknoGry og= new OknoGry(szerokoscGry, wysokoscGry, x , y);
    
    }//main
    
}//class Glowna
