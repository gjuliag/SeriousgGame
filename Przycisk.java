
package seriousgame;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import static seriousgame.Parametry.*;


public class Przycisk extends JPanel{
    Przycisk(int terazPoziom){
    //public void generujPrzyciski(int terazPoziom){
    ladujGrafike();
    int wysOkna=Toolkit.getDefaultToolkit().getScreenSize().height;
    int szerOkna=Toolkit.getDefaultToolkit().getScreenSize().width;
    int wysPaska=250;
    int szerGry;
    int wysGry=1024;
        switch(terazPoziom){
            case 1: {
                    JButton zakonczGre=new JButton("Zakoncz gre");
                    JButton zasadyGry=new JButton("Zasady gry");
                    add(zakonczGre,BorderLayout.SOUTH);
                    //add(zasadyGry,1080,600);
            break;
            }//case1
            case 2: {
                    JButton pierwszyPrzycisk=new JButton("");
                    JButton drugiPrzycisk=new JButton("");
                    JButton trzeciPrzycisk=new JButton("");
                    JButton czwartyPrzycisk=new JButton("");
                    
                    add(pierwszyPrzycisk);
                    add(drugiPrzycisk);
                    add(trzeciPrzycisk);
                    add(czwartyPrzycisk);
            break;
            }//case2
            case 3: {
                    JButton pierwszyPrzycisk=new JButton("");
                    JButton drugiPrzycisk=new JButton("");
                    JButton trzeciPrzycisk=new JButton("");
                    JButton czwartyPrzycisk=new JButton("");
                    JButton piatyPrzycisk=new JButton("");
                    
                    add(pierwszyPrzycisk);
                    add(drugiPrzycisk);
                    add(trzeciPrzycisk);
                    add(czwartyPrzycisk);
                    add(piatyPrzycisk);
            break;
            }//case3
            default: 
                break;
        }//switch
        
    }//generujPrzyciski
    
    @Override
    public void paintComponent(Graphics gs){
           int i=0;
            //super.paintComponent(g);
            Graphics2D g=(Graphics2D)gs;
            g.drawImage(Parametry.krople[i], 0, 0, null);
            
            
    
    }//paintComponent
}
      


