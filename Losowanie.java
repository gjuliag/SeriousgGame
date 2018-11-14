
package seriousgame;

import java.util.Random;
import static seriousgame.Parametry.*;

public class Losowanie {
    
    public static void losujSlowa(int terazPoziom){
        
        ladujSlowa();
        Random r= new Random();
        
        los1= new String [3][3];
        los2= new String [3][4];
        los3= new String [3][5];
        int x;//zmienna z przypisana wylosowana liczba
        int[] spr1;//tablica do sprawdzania, czy zostala wylosowana juz dana litera (poziom1)
        spr1= new int[3];
        int[] spr2;//tablica do sprawdzania, czy zostala wylosowana juz dana litera (poziom2)
        spr2= new int[4];
        int[] spr3;//tablica do sprawdzania, czy zostala wylosowana juz dana litera (poziom3)
        spr3= new int[5];
        
        switch (terazPoziom) {
            case 1:
                {
                    for (int i=0; i<poziom1.length;i++){
                        spr1[0]=0;
                        spr1[1]=0;
                        spr1[2]=0;
                        int licznik =0;
                        for(int j=0; j<poziom1[i].length; j++){
                            x=r.nextInt(los1[i].length);
                             boolean q = false;
                            if (licznik != 3)
                                q = true;

                            while(q){
                                    if(spr1[x]==0) {
                                        los1[i][x]= poziom1[i][j];
                                        spr1[x]=1;
                                        licznik++;
                                        q=false;
                                    }//if
                                    else x=r.nextInt(los1[i].length);   
                                }//while          
                        }//for
                    }//for
                                System.out.println(los1[0][0]+los1[0][1]+los1[0][2]);
                                System.out.println(los1[1][0]+los1[1][1]+los1[1][2]);
                                System.out.println(los1[2][0]+los1[2][1]+los1[2][2]); 
                    }//case;
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
                            x=r.nextInt(los2[i].length);
                             boolean q = false;
                            if (licznik != 4)
                                q = true;

                            while(q){
                                    if(spr2[x]==0) {
                                        los2[i][x]= poziom2[i][j];
                                        spr2[x]=1;
                                        licznik++;
                                        q=false;
                                    }//if
                                    else x=r.nextInt(los2[i].length);   
                                }//while          
                        }//for
                    }//for
                                System.out.println(los2[0][0]+los2[0][1]+los2[0][2]+los2[0][3]);
                                System.out.println(los2[1][0]+los2[1][1]+los2[1][2]+los2[1][3]);
                                System.out.println(los2[2][0]+los2[2][1]+los2[2][2]+los2[2][3]);
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
                            x=r.nextInt(los3[i].length);
                             boolean q = false;
                            if (licznik != 5)
                                q = true;

                            while(q){
                                    if(spr3[x]==0) {
                                        los3[i][x]= poziom3[i][j];
                                        spr3[x]=1;
                                        licznik++;
                                        q=false;
                                    }//if
                                    else x=r.nextInt(los3[i].length);   
                                }//while          
                        }//for
                    }//for
                                System.out.println(los3[0][0]+los3[0][1]+los3[0][2]+los3[0][3]+los3[0][4]);
                                System.out.println(los3[1][0]+los3[1][1]+los3[1][2]+los3[1][3]+los3[1][4]);
                                System.out.println(los3[2][0]+los3[2][1]+los3[2][2]+los3[2][3]+los3[2][4]);
                }//case3
                break;
            default:
                break;
        }//switch
    }//losujSlowa
}//class Losowanie
