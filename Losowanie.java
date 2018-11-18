
package seriousgame;

import java.util.Random;
import static seriousgame.Parametry.*;


public class Losowanie {
    
    public static void losujSlowa(){
        
        ladujSlowa();
        Random r= new Random();
        int d;//zmienna z przypisana wylosowana liczba
        
        for(int terazPoziom=1; terazPoziom<4; terazPoziom++){
        switch (terazPoziom) {
            case 1:
                {
                        for (int i=0; i<poziom1.length;i++){
                        spr1[0]=0;
                        spr1[1]=0;
                        spr1[2]=0;
                        int licznik =0;
                        for(int j=0; j<poziom1[i].length; j++){
                            d=r.nextInt(los1[i].length);
                             boolean q = false;
                            if (licznik != 3)
                                q = true;

                            while(q){
                                    if(spr1[d]==0) {
                                        los1[i][d]= poziom1[i][j];
                                        spr1[d]=1;
                                        licznik++;
                                        q=false;
                                    }//if
                                    else d=r.nextInt(los1[i].length);   
                                }//while          
                        }//for
                    }//for
                    }//case1;
                    break;
                
                case 2:
                {
                    for (int i=0; i<poziom2.length;i++){
                        spr2[0]=0;
                        spr2[1]=0;
                        spr2[2]=0;
                        spr2[3]=0;
                        int licznik =0;
                        for(int j=0; j<poziom2[i].length; j++){
                            d=r.nextInt(los2[i].length);
                             boolean q = false;
                            if (licznik != 4)
                                q = true;

                            while(q){
                                    if(spr2[d]==0) {
                                        los2[i][d]= poziom2[i][j];
                                        spr2[d]=1;
                                        licznik++;
                                        q=false;
                                    }//if
                                    else d=r.nextInt(los2[i].length);   
                                }//while          
                        }//for
                    }//for
                }//case2
                break;
            case 3:
                {
                    for (int i=0; i<poziom3.length;i++){
                        spr3[0]=0;
                        spr3[1]=0;
                        spr3[2]=0;
                        spr3[3]=0;
                        spr3[4]=0;
                        int licznik =0;
                        for(int j=0; j<poziom3[i].length; j++){
                            d=r.nextInt(los3[i].length);
                             boolean q = false;
                            if (licznik != 5)
                                q = true;

                            while(q){
                                    if(spr3[d]==0) {
                                        los3[i][d]= poziom3[i][j];
                                        spr3[d]=1;
                                        licznik++;
                                        q=false;
                                    }//if
                                    else d=r.nextInt(los3[i].length);   
                                }//while          
                        }//for
                    }//for
                }//case3
                break; 
            default:
                break;
        }//switch
        }//for
    }//losujSlowa
}//class Losowanie
