
package seriousgame;

import java.util.Random;
import static seriousgame.Parametry.*;


public class Losowanie {
    
    public static void losujSlowa(){
        
        ladujSlowa();
        Random r= new Random();
        int d;//zmienna z przypisana wylosowana liczba
        //int jak1[]= new int[3];
        
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
                                        jak1[i][j]= d;
                                        spr1[d]=1;
                                        licznik++;
                                        q=false;
                                    }//if
                                    else d=r.nextInt(los1[i].length);   
                                }//while          
                        }//for
                    }//for
                        /*
                        System.out.println(los1[0][0]+" "+los1[0][1]+" "+los1[0][2]);
                        System.out.println(jak1[0][0]+" "+jak1[0][1]+" "+jak1[0][2]);
                        System.out.println(los1[1][0]+" "+los1[1][1]+" "+los1[1][2]);
                        System.out.println(jak1[1][0]+" "+jak1[1][1]+" "+jak1[1][2]);
                        System.out.println(los1[2][0]+" "+los1[2][1]+" "+los1[2][2]);
                        System.out.println(jak1[2][0]+" "+jak1[2][1]+" "+jak1[2][2]);
                        */
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
                                        jak2[i][j]=d;
                                        spr2[d]=1;
                                        licznik++;
                                        q=false;
                                    }//if
                                    else d=r.nextInt(los2[i].length);   
                                }//while          
                        }//for
                    }//for
                    /*
                        System.out.println(los2[0][0]+" "+los2[0][1]+" "+los2[0][2]+" "+los2[0][3]);
                        System.out.println(jak2[0][0]+" "+jak2[0][1]+" "+jak2[0][2]+" "+jak2[0][3]);
                        System.out.println(los2[1][0]+" "+los2[1][1]+" "+los2[1][2]+" "+los2[1][3]);
                        System.out.println(jak2[1][0]+" "+jak2[1][1]+" "+jak2[1][2]+" "+jak2[1][3]);
                        System.out.println(los2[2][0]+" "+los2[2][1]+" "+los2[2][2]+" "+los2[2][3]);
                        System.out.println(jak2[2][0]+" "+jak2[2][1]+" "+jak2[2][2]+" "+jak2[2][3]);
                    */
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
                                        jak3[i][j]=d;
                                        spr3[d]=1;
                                        licznik++;
                                        q=false;
                                    }//if
                                    else d=r.nextInt(los3[i].length);   
                                }//while          
                        }//for
                    }//for
                        
                        System.out.println(los3[0][0]+" "+los3[0][1]+" "+los3[0][2]+" "+los3[0][3]+" "+los3[0][4]);
                        System.out.println(jak3[0][0]+" "+jak3[0][1]+" "+jak3[0][2]+" "+jak3[0][3]+" "+jak3[0][4]);
                        System.out.println(los3[1][0]+" "+los3[1][1]+" "+los3[1][2]+" "+los3[1][3]+" "+los3[1][4]);
                        System.out.println(jak3[1][0]+" "+jak3[1][1]+" "+jak3[1][2]+" "+jak3[1][3]+" "+jak3[1][4]);
                        System.out.println(los3[2][0]+" "+los3[2][1]+" "+los3[2][2]+" "+los3[2][3]+" "+los3[2][4]);
                        System.out.println(jak3[2][0]+" "+jak3[2][1]+" "+jak3[2][2]+" "+jak3[2][3]+" "+jak3[2][4]);
                        
            }//case3
                break; 
            default:
                break;
        }//switch
        }//for
    }//losujSlowa
}//class Losowanie
