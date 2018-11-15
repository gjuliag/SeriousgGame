
package seriousgame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import java.util.Random;

import javax.swing.JPanel;
import static seriousgame.Losowanie.losujSlowa;
import static seriousgame.Parametry.*;


public class RysowaniePanelu extends JPanel{
     
    int wysOkna=Toolkit.getDefaultToolkit().getScreenSize().height;
    int szerOkna=Toolkit.getDefaultToolkit().getScreenSize().width;
    int wysPaska=250;
    int szerGry;
    int wysGry=1024;
    public Font czcionka;
    int poziom=1;
    int ktoreSlowo=0;
   
    
     RysowaniePanelu(){
                   
        czcionka=new Font("Dialog",Font.BOLD,30);
        los1= new String [3][3];
        los2= new String [3][4];
        los3= new String [3][5];
        
        
        spr1= new int[3];
        spr2= new int[4];
        spr3= new int[5];
        
        kolejnosc= new int[5];
        
        losujSlowa();
        
       

    }
    
    @Override
    public void paintComponent(Graphics gs){
          
           //int i=0;
            super.paintComponent(gs);
            Graphics2D g=(Graphics2D)gs;
            //this.setBackground(Color.GRAY);
            //g.drawImage(Parametry.tlo,0,0, 1024, 784, null);
            //g.setColor(Color.BLUE);
            //g.drawRect(0,wysOkna-wysPaska,szerOkna,wysPaska);
            g.setColor(new Color(77,182,250));
            g.fillRect(0,wysOkna-wysPaska,szerOkna,wysPaska);
            g.setColor(Color.BLACK);
            g.setFont(czcionka);
            g.drawString("ZAKOŃCZ GRĘ", 260, 700);
            g.drawString("ZASADY GRY", 560, 700);
            
            switch(poziom){
                case 1: kolejnosc(los1);
                        break;
                case 2: kolejnosc(los2);
                        break;
                case 3: kolejnosc(los3);
                        break;
            }
            
            for(int i=0; i<kolejnosc.length; i++){
                if(kolejnosc[i]!=-1)
            g.drawImage(Parametry.krople[kolejnosc[i]],200*i, 200, 250, 250,null);
            }
            
            ktoreSlowo++;
            if(ktoreSlowo == 3){
                poziom++;
                ktoreSlowo=0;
            }
            
            
            
            
    
    }//paintComponent
    
    
    public void kolejnosc(String[][] los){
        
        for(int i=0; i<kolejnosc.length; i++){
            kolejnosc[i]=-1;   
        }
        int h=0;
        for(int i=0; i<los[ktoreSlowo].length; i++){
            for(int j=0; j<alfabet.length;j++){
                if(los[ktoreSlowo][i]==alfabet[j]){
                  
                    kolejnosc[h]=j;
                    h++;
                }//if
            }//for
        }//for
    }//kolejnosc
    
    
    
}
