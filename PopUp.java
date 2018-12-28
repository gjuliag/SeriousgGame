
package seriousgame;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javafx.scene.paint.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*Okno, które wyświetla się przy każdej wykonanej odpowiedzi- złej oraz dobrej. Zmienia się tekst 
drukowany w oknie. */

public class PopUp extends JFrame{

    /* Konstruktor klasy
    *@param s- szerokość tworzonego okna
    *@param w- wysokość tworzonego okna
    *@param wymX- pozycja x, na której ma zostać utworzone okno
    *@param wymY- pozycja y, na której ma zostać utworzone okno
    */
    PopUp(int s, int w, int wymX, int wymY){
        
    super();
    setSize(wymX,wymY);// Określenie wymiaru okna
    setLocation(s, w); //Określenie położenia okna
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Zamykanie okna przyciskiem x na ramce 
    setResizable(false); //Zablokowanie możliwości zmiany wymiarów okna
    }    
}//class PopUp()
