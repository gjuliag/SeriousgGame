
package seriousgame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;


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
    
   
    int obrX=Parametry.szerGry;
    int obrY=-50+(Parametry.wysGry-wysPaska)/2;
    int wysObr=250;
    int szerObr=250;
    
    int ktore=0;
    int ok=0;
    int zle=0;
    boolean b=true;
    int klik=0;
    int k=0;
    
     RysowaniePanelu(){
                   
        czcionka=new Font("Dialog",Font.BOLD,30);
        los1= new String [3][3];
        los2= new String [3][4];
        los3= new String [3][5];
        
        spr1= new int[3];
        spr2= new int[4];
        spr3= new int[5];
        
        jak1= new int[3][3];
        jak2= new int[3][4];
        jak3= new int[3][5];

        kolejnosc= new int[5];      

        
        losujSlowa();
        StanGry.odNowa();
        
        addMouseListener(new MouseAdapter(){
            @Override
          public void mousePressed(MouseEvent mysz){
              
              if(mysz.getX()<xMenu+300 && mysz.getY()>wysOkna-wysPaska)
                      System.exit(1); 
              
              if(mysz.getX()>xMenu+300 && mysz.getY()>wysOkna-wysPaska){
                StanGry.odNowa();
                repaint();
                }
              if(mysz.getY()>obrY && mysz.getY()<obrY+wysObr){
                  
             System.out.println(terazPoziom);
                      switch(terazPoziom){
                          case 1:
                            {
                                if(mysz.getX() > obrX/5*(jak1[ktore][klik]) && mysz.getX() < obrX/5+(obrX/5*jak1[ktore][klik])) ok++;
                                else zle++;
                                
                                klik++;
                                
                                    if(klik ==3){
                                        if(ok == 3 ) {
                                            ktore++;
                                            repaint();
                                            ok=0;
                                            klik=0;
                                            k++;
                                            System.out.println("DOBRZE");
                                            } 
                                        else if(zle >= 1){
                                        klik=0;
                                        zle=0;
                                        ok=0;
                                        System.out.println("ZLE");
                                        }
                                    }//if
                            };//case
                            break;
                        case 2:
                            { 
                               if(mysz.getX() > obrX/5*(jak2[ktore][klik]) && mysz.getX() < obrX/5+(obrX/5*jak2[ktore][klik])) ok++;
                               else zle++;
                                
                                klik++;
                                
                                    if(klik == 4){
                                        if(ok == 4 ) {
                                            ktore++;
                                            repaint();
                                            ok=0;
                                            klik=0;
                                            k++;
                                            System.out.println("DOBRZE");
                                            } 
                                        else if(zle >= 1){
                                        klik=0;
                                        zle=0;
                                        ok=0;
                                        System.out.println("ZLE");
                                        }
                                    }//if 
                            };
                            break;
                          case 3:
                            {
                               if(mysz.getX() > obrX/5*(jak3[ktore][klik]) && mysz.getX() < obrX/5+(obrX/5*jak3[ktore][klik])) ok++;
                               else zle++;
                                
                                klik++;
                                
                                    if(klik == 5){
                                        if(ok == 5 ) {
                                            ktore++;
                                            repaint();
                                            ok=0;
                                            klik=0;
                                            k++;
                                            System.out.println("DOBRZE");
                                            } 
                                        else if(zle >= 1){
                                        klik=0;
                                        zle=0;
                                        ok=0;
                                        System.out.println("ZLE");
                                        }
                                    }//if 
                            };
                            break;
                      }
                    
              }   
          }//mouseClicked()
      });//MouseListener  
    }//RysowaniePanelu
    
    @Override
    public void paintComponent(Graphics gs){

            super.paintComponent(gs);
            Graphics2D g=(Graphics2D)gs;
            g.drawImage(Parametry.tlo,0,0, 1024, 784, null);
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
            g.drawImage(Parametry.krople[kolejnosc[i]], (obrX/5*i), obrY, szerObr, wysObr, null);
                
            }
            if(ktoreSlowo != 2) StanGry.kolejneSlowo();
            
            if(k == 3) {
                ktore=0;
                k=0;
                StanGry.kolejnyPoziom();
                repaint();
            } 
            
            
    }//paintComponent
    
    
    public void kolejnosc(String[][] los){
        
        for(int i=0; i<kolejnosc.length; i++){
            kolejnosc[i]=-1;   
        }
        int h=0;
        for(int i=0; i<los[ktoreSlowo].length; i++){
            for(int j=0; j<alfabet.length;j++){
                if(los[ktoreSlowo][i] == alfabet[j]){
                    kolejnosc[h] = j;
                    h++;
                }//if
            }//for
        }//for
    }//kolejnosc   
    
}//RysowaniePanelu
