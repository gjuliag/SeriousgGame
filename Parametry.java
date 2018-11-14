
package seriousgame;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Parametry {
    
    public static long maxCzasGry=Long.MAX_VALUE;
    public final int liczbaPoziomow=3;
    public static String[][] poziom1;//slowa na poziomie 1(kazda lieteraw oddzielnej komorce)
    public static String[][] poziom2;//slowa na poziomie 2
    public static String[][] poziom3;//slowa na poziomie 3
    public static String[][] los1;//slowa w poziomie w wylosowanej kolejnosci
    public static String[][] los2;//slowa w poziomie w wylosowanej kolejnosci
    public static String[][] los3;//slowa w poziomie w wylosowanej kolejnosci
    public static String[] alfabet;//tablica z literami
    public static Image[] krople;//tablica przyciskow z literami
    public static Image tlo;//obraz na tlo
    public static long startGry;//poczatek gry
    public static double czasPoziomu;//czas poziomu
    public static int terazPoziom;//aktualny poziom
    public static boolean czyKoniec=false;//koniec gry
    public static int szerGry=1024;
    public static int wysGry=768;
    
    //wczytywanie slow z pliku
    public static void ladujSlowa(){
      
        poziom1 = new String[3][3];
        poziom1[0][0]="D";
        poziom1[0][1]="O";
        poziom1[0][2]="G";
        poziom1[1][0]="C";
        poziom1[1][1]="A";
        poziom1[1][2]="T";
        poziom1[2][0]="R";
        poziom1[2][1]="A";
        poziom1[2][2]="T";
        
        poziom2 = new String[3][4];
        poziom2[0][0]="B";
        poziom2[0][1]="E";
        poziom2[0][2]="A";
        poziom2[0][3]="R";
        poziom2[1][0]="F";
        poziom2[1][1]="R";
        poziom2[1][2]="O";
        poziom2[1][3]="G";
        poziom2[2][0]="B";
        poziom2[2][1]="I";
        poziom2[2][2]="R";
        poziom2[2][3]="D";
        
        poziom3 = new String[3][5];
        poziom3[0][0]="H";
        poziom3[0][1]="O";
        poziom3[0][2]="R";
        poziom3[0][3]="S";
        poziom3[0][4]="E";
        poziom3[1][0]="M";
        poziom3[1][1]="O";
        poziom3[1][2]="U";
        poziom3[1][3]="S";
        poziom3[1][4]="E";
        poziom3[2][0]="W";
        poziom3[2][1]="H";
        poziom3[2][2]="A";
        poziom3[2][3]="L";
        poziom3[2][4]="E";
        
            alfabet= new String[17];
            alfabet [0]="A";
            alfabet [1]="B";
            alfabet [2]="C";
            alfabet [3]="D";
            alfabet [4]="E";
            alfabet [5]="F";
            alfabet [6]="G";
            alfabet [7]="H";
            alfabet [8]="I";
            alfabet [9]="L";
            alfabet [10]="M";
            alfabet [11]="O";
            alfabet [12]="R";
            alfabet [13]="S";
            alfabet [14]="T";
            alfabet [15]="U";
            alfabet [16]="W";

    }//ladujSlowa
    
        public static void ladujGrafike(){
        
            krople= new Image[17];
            krople[0]=ladujZdj("alfabet/A.png");
            krople[1]=ladujZdj("alfabet/B.png");
            krople[2]=ladujZdj("alfabet/C.png");
            krople[3]=ladujZdj("alfabet/D.png");
            krople[4]=ladujZdj("alfabet/E.png");
            krople[5]=ladujZdj("alfabet/F.png");
            krople[6]=ladujZdj("alfabet/G.png");
            krople[7]=ladujZdj("alfabet/H.png");
            krople[8]=ladujZdj("alfabet/I.png");
            krople[9]=ladujZdj("alfabet/L.png");
            krople[10]=ladujZdj("alfabet/M.png");
            krople[11]=ladujZdj("alfabet/O.png");
            krople[12]=ladujZdj("alfabet/R.png");
            krople[13]=ladujZdj("alfabet/S.png");
            krople[14]=ladujZdj("alfabet/T.png");
            krople[15]=ladujZdj("alfabet/U.png");
            krople[16]=ladujZdj("alfabet/W.png");
            
            
            tlo=ladujZdj("alfabet/tlo.jpg");
        }//ladujKrople
        
        public static Image ladujZdj(String nazwaPliku) {
        return new ImageIcon(nazwaPliku).getImage();
    }//ladujZdj 
}//class Parametry
        

    
    
    
    

