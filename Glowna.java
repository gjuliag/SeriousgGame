
package seriousgame;

import java.awt.Toolkit;
import java.io.FileNotFoundException;
import javax.swing.JPanel;
import static seriousgame.Losowanie.losujSlowa;



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
        //JPanel mypanel=new RysowaniePanelu(wysokoscOkna, szerokoscOkna);
        
        
        //losujSlowa(1);
    
    }//main
    
}//class Glowna
