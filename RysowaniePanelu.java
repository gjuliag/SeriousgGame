
package seriousgame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import static seriousgame.Parametry.*;


public class RysowaniePanelu extends JPanel{
     
    int wysOkna=Toolkit.getDefaultToolkit().getScreenSize().height;
    int szerOkna=Toolkit.getDefaultToolkit().getScreenSize().width;
    int wysPaska=250;
    int szerGry;
    int wysGry=1024;
    
   
    
    public RysowaniePanelu(){
                   
                    JButton zakonczGre=new JButton("Zakoncz gre");
                    JButton zasadyGry=new JButton("Zasady gry");
                    
                    add(zakonczGre);
                    add(zasadyGry);
    }
    
    @Override
    public void paintComponent(Graphics gs){
           int ktoreSlowo=0;
           //int i=0;
            super.paintComponent(gs);
            Graphics2D g=(Graphics2D)gs;
            //this.setBackground(Color.GRAY);
            g.drawImage(Parametry.tlo,0,0, 1024, 784, null);
            //g.setColor(Color.BLUE);
            //g.drawRect(0,wysOkna-wysPaska,szerOkna,wysPaska);
            g.setColor(new Color(77,182,250));
            g.fillRect(0,wysOkna-wysPaska,szerOkna,wysPaska);
            
            
            for(int i=0; i<poziom1[ktoreSlowo].length; i++)
            g.drawImage(Parametry.krople[i],256, 200, 250, 250,null);
            
            
    
    }//paintComponent
    
}
