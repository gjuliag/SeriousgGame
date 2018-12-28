
package seriousgame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import static seriousgame.Losowanie.losujSlowa;
import static seriousgame.Parametry.*;


public class RysowaniePanelu extends JPanel{
     
    int wysPaska=250;
    int wysMenu=700;
    int xMenu=260;
    public Font czcionka;
    public static boolean menu=false;
    
    int s=-200+Parametry.szerokoscOkna/2;
    int w=-150+Parametry.wysokoscOkna/2;
    
    
    int obrX=Parametry.szerGry;
    int obrY=-50+(Parametry.wysGry-wysPaska)/2;
    int wymiar=250;
    
    public static int ktore=0;
    public static int ok=0;
    public static int zle=0;
    boolean b=true;
    public static int klik=0;
    public static int k=0;
    
    public static int punkty=0;
    
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
        
        /* Obsługa zdarzeń po wciśnięciu myszki */
        addMouseListener(new MouseAdapter(){
            @Override
          public void mousePressed(MouseEvent mysz){
              
              //Wciśnięcie przycisku "Zakończ grę"
              if(mysz.getX()<xMenu+300 && mysz.getY()>Parametry.wysokoscOkna-wysPaska)
                      System.exit(1); 
              //Wciśnięcie przycisku "Nowa gra"
              if(mysz.getX()>xMenu+300 && mysz.getY()>Parametry.wysokoscOkna-wysPaska){
                StanGry.odNowa();
                repaint();
                }
              //Kiedy wciśnięta zostaje kropla
              if(mysz.getY()>obrY && mysz.getY()<obrY+wymiar){
                  /*Sprawdzanie poprawności kliknięć w zależności od poziomu. Dla 1 poziomu sprawdzanie
                  po 3 kliknięciach, dla 2 po 4, dla 3 po 5 kliknięciach. Zarówno po poprawnej jak i niepoprawnej 
                  odpowiedzi wyświetlanie nowego okna z komunikatem oraz odtworzenie odpowiedniego dźwięku. Za 
                  poprawną odpowiedź przyznawany jest punkt, za niepoprawną nie. Słowo wyświetla się do momentu 
                  poprawnego uszeregowania liter. Dopiero wtedy można przejść do kolejnego słowa.*/
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
                                            punkty++;
                                            
                                            PopUp p1= new PopUp(s,w, 350, 250);
                                            JLabel l1= new JLabel("GRATULACJE! POPRAWNA ODPOWIEDŹ! ", JLabel.CENTER);
                                            p1.add(l1);
                                            p1.setVisible(true);
                                            dzwiek(new File("dzwieki/correct.wav"));
                                        } 
                                        else if(zle >= 1){
                                            klik=0;
                                            zle=0;
                                            ok=0;
                                        
                                            PopUp p1= new PopUp(s,w, 350, 250);
                                            JLabel l2= new JLabel("NIESTETY NIE... PRÓBUJ DALEJ! ", JLabel.CENTER);
                                            p1.add(l2);
                                            p1.setVisible(true);
                                            dzwiek(new File("dzwieki/error.wav"));
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
                                            punkty++;
                                            
                                            PopUp p1= new PopUp(s,w, 350, 250);
                                            JLabel l1= new JLabel("GRATULACJE! POPRAWNA ODPOWIEDŹ! ", JLabel.CENTER);
                                            p1.add(l1);
                                            p1.setVisible(true);
                                            dzwiek(new File("dzwieki/correct.wav"));
                                        } 
                                        else if(zle >= 1){
                                            klik=0;
                                            zle=0;
                                            ok=0;
                                        
                                            PopUp p1= new PopUp(s,w, 350, 250);
                                            JLabel l2= new JLabel("NIESTETY NIE... PRÓBUJ DALEJ! ", JLabel.CENTER);
                                            p1.add(l2);
                                            p1.setVisible(true);
                                            dzwiek(new File("dzwieki/error.wav"));
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
                                            punkty++;
                                            
                                            if(punkty != 9){
                                                PopUp p1= new PopUp(s,w, 350, 250);
                                                JLabel l1= new JLabel("GRATULACJE! POPRAWNA ODPOWIEDŹ! ", JLabel.CENTER);
                                                p1.add(l1);
                                                p1.setVisible(true);
                                                dzwiek(new File("dzwieki/correct.wav"));
                                            }
                                            //Kiedy uzyska się 9 punktów gra się kończy
                                            else if(punkty > 8){
                                                PopUp p2= new PopUp(s,w-75, 450, 250);
                                                JLabel l3= new JLabel("<html>GRATULACJE! KONIEC GRY!"+"<br/>Lista poznanych słów: "
                                                        + "<br/>DOG- PIES<br/>CAT- KOT<br/>RAT- SZCZUR<br/>BEAR- NIEDŹWIEDŹ"
                                                        + "<br/>FROG- ŻABA<br/>BIRD- PTAK<br/>HORSE- KOŃ<br/>MOUSE- MYSZ"
                                                        + "<br/>WHALE- WIELORYB</html>",JLabel.CENTER);
                                                p2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                                p2.add(l3);
                                                p2.setVisible(true);
                                                dzwiek(new File("dzwieki/cheer.wav"));
                                            }
                                        } 
                                        else if(zle >= 1){
                                            klik=0;
                                            zle=0;
                                            ok=0;
                                        
                                            PopUp p1= new PopUp(s,w,350,250);
                                            JLabel l2= new JLabel("NIESTETY NIE... PRÓBUJ DALEJ! ", JLabel.CENTER);
                                            p1.add(l2);
                                            p1.setVisible(true); 
                                            dzwiek(new File("dzwieki/error.wav"));
                                        }
                                    }//if 
                            };
                            break;
                      }
              }   
          }//mouseClicked()
      });//MouseListener 
     }//RysowaniePanelu
    
     /* Rysowanie pola graficznego gry- tło, pola do przyciskania, pasek menu, rysowanie kropel 
     w owylosowanej kolejności.*/
    @Override
    public void paintComponent(Graphics gs){

            super.paintComponent(gs);
            Graphics2D g=(Graphics2D)gs;
            g.drawImage(Parametry.tlo,0,0, 1024, 784, null);
            g.setColor(new Color(77,182,250));
            g.fillRect(0,Parametry.wysokoscOkna-wysPaska,Parametry.szerokoscOkna,wysPaska);
            g.setColor(Color.BLACK);
            g.setFont(czcionka);
            g.drawString("ZAKOŃCZ GRĘ", xMenu, wysMenu);
            g.drawString("NOWA GRA", xMenu+300, wysMenu);
            g.drawString("PUNKTY: "+punkty, Parametry.szerGry-200, 50);
            
            switch(terazPoziom){
                case 1: kolejnosc(los1);
                        break;
                case 2: kolejnosc(los2);
                        break;
                case 3: kolejnosc(los3);
                        break;
            }
            //Rysowanie kropel
            for(int i=0; i<kolejnosc.length; i++){
                if(kolejnosc[i]!=-1)
            g.drawImage(Parametry.krople[kolejnosc[i]], (obrX/5*i), obrY, wymiar, wymiar, null);
                
            }
            //Wyświetlenie kolejnego słowa, dopóki nie zostaną wyświetlone wszystkie 3
            if(ktoreSlowo != 2) StanGry.kolejneSlowo();
            //Zwiększenie poziomu po odgadnięciu 3 słów
            if(k == 3) {
                ktore=0;
                k=0;
                StanGry.kolejnyPoziom();
                repaint();
            }         
    }//paintComponent
    
    /* 
    * Funkcja przyporządkowujaca literkom w wylosowanej kolejności odpowiadające im obrazki 
    kropel z literkami. 
    * @param los - tablica ze słowami w wylosowanej kolejności dla odpowiedniego poziomu
    */
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
    
    /*Funkcja wczytująca plik dźwiękowy o rozszerzeniu .wav- poprawna odpowiedź, zła odpowiedź 
    i koniec gry */
        public static synchronized void dzwiek(final File f) {
        new Thread(new Runnable() {
          public void run() {
            try {
              Clip c = AudioSystem.getClip();
              AudioInputStream is = AudioSystem.getAudioInputStream(f);
              c.open(is);
              c.start(); 
            } catch (Exception e) {
              System.err.println(e.getMessage());
            }
          }
        }).start();
    }//playSound()
    
}//RysowaniePanelu
