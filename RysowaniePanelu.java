
package seriousgame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.JPanel;
import static seriousgame.Losowanie.losujSlowa;
import static seriousgame.Parametry.*;


public class RysowaniePanelu extends JPanel{
     
    int wysOkna=Toolkit.getDefaultToolkit().getScreenSize().height;
    int szerOkna=Toolkit.getDefaultToolkit().getScreenSize().width;
    int wysPaska=250;
    int wysMenu=700;
    int xMenu=260;
    public Font czcionka;
    public static boolean menu=false;
   
    
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
        StanGry.odNowa();
        
        addMouseListener(new MouseAdapter(){
            @Override
          public void mouseClicked(MouseEvent mysz){

              if(mysz.getX()<xMenu+300 && mysz.getY()>wysOkna-wysPaska)
                      System.exit(1); 
              
              if(mysz.getX()>xMenu+300 && mysz.getY()>wysOkna-wysPaska)
                {StanGry.odNowa();
                repaint();}
              
          }//mouseClicked()
      });//MouseListener
        
    }//RysowaniePanelu
    
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
            g.drawString("ZAKOŃCZ GRĘ", xMenu, wysMenu);
            g.drawString("NOWA GRA", xMenu+300, wysMenu);
            
            switch(terazPoziom){
                case 1: kolejnosc(los1);
                        break;
                case 2: kolejnosc(los2);
                        break;
                case 3: kolejnosc(los3);
                        break;
            }
            
            for(int i=0; i<kolejnosc.length; i++){
                if(kolejnosc[i]!=-1)
            g.drawImage(Parametry.krople[kolejnosc[i]],(Parametry.szerGry/5*i), -50+(Parametry.wysGry-wysPaska)/2, 250, 250,null);
            }
            
            ktoreSlowo++;
            if(ktoreSlowo == 3){
                StanGry.kolejnyPoziom();
            }//if
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
}//RysowaniePanelu
