
package seriousgame;


import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static seriousgame.Parametry.*;
import static seriousgame.Przycisk.*;



public class OknoGry extends JFrame {
    
    int wysokoscPaska=60; //wysokosc paska menu 
    
    public OknoGry(int szerokosc, int wysokosc, int pozycjaX, int pozycjaY){
        super();
        setSize(szerokosc, wysokosc); //ustaw wymiary okna
        setLocation(pozycjaX,pozycjaY); //ustaw pozycję okna
        setResizable(false); //zablokuj możliwość zmian rozmiaru okna
        setUndecorated(true); //ukryj ramkę okna i przyciski kontrolne
        //GUI(szerokosc,wysokosc); //wywołaj metodę budowy interfejsu
        GUI();
        
        
        setVisible(true);
         
}//konstruktor OknoGry
    
    public void GUI(){
        setLayout(new GridLayout(1,1));
        Parametry.ladujGrafike();
        add(new RysowaniePanelu());
        
        
    }

}//class OknoGry
