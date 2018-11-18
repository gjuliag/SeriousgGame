
package seriousgame;

import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class OknoGry extends JFrame {
    
    int wysokoscPaska=60; //wysokosc paska menu 
    
    public OknoGry(int szerokosc, int wysokosc, int pozycjaX, int pozycjaY) throws InterruptedException{
        super();
        setSize(szerokosc, wysokosc); //ustaw wymiary okna
        setLocation(pozycjaX,pozycjaY); //ustaw pozycję okna
        setResizable(false); //zablokuj możliwość zmian rozmiaru okna
        setUndecorated(true); //ukryj ramkę okna i przyciski kontrolne
        GUI();
     
        
        setVisible(true);
        petla();
         
}//konstruktor OknoGry
    
    public void GUI(){
        setLayout(new GridLayout(1,1));
        Parametry.ladujGrafike();
        add(new RysowaniePanelu());
           
    }
    
    public void petla() throws InterruptedException{
    while(true){
        sleep(3000);
        repaint();
        
    }
}//petla

}//class OknoGry
