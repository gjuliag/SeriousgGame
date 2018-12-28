
package seriousgame;

import java.awt.GridLayout;
import static java.lang.Thread.sleep;
import javax.swing.JFrame;

//Okno główne gry
public class OknoGry extends JFrame {
    
    /* Konstruktor klasy - ustawienie odpowiednich parametrów oraz rozpoczęcie akcji.
    * @param szerokosc - szerokość okna gry
    *@param wysokosc - wysokosc okna gry
    *@param pozycjaX - pozycja x, na której ma zostać utworzone okno
    *@param pozycjaY - pozycja y, na której ma zostać utworzone okno
    */
    public OknoGry(int szerokosc, int wysokosc, int pozycjaX, int pozycjaY) throws InterruptedException{
        super();
        setSize(szerokosc, wysokosc);//Określenie wielkości okna
        setLocation(pozycjaX,pozycjaY);//Określenie położenia okna
        setResizable(false);//Zablokowanie możliwości zmiany wymiarów okna
        setUndecorated(true);//Usunięcie ramki okna
        GUI();
     
        setVisible(true);
         
}//konstruktor OknoGry
    
    // Interfejs graficzny urzytkownika- załadowanie grafiki oraz dodanie panelu.
    private void GUI(){
        
        Parametry.ladujGrafike();
        add(new RysowaniePanelu());
           
    }

}//class OknoGry
