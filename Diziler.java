
package javaapplication38;

import java.util.Random;
import java.util.Scanner;


public class JavaApplication38 {

    public static void main(String[] args) {
        int tahmin,can=5,i=0;
        Random rand=new Random();
        Scanner sn=new Scanner(System.in);
        int sayi=rand.nextInt(100);
        int tahminler[]=new int[5];
        
        boolean oyunDurumu=false;
        System.out.println(sayi);
        System.out.println("hoşgeldiniz!   0-99 arası sayınızı giriniz:");
        
        while(can>0){
            System.out.println("tahmininiz:");
            tahmin=sn.nextInt();
            tahminler[i++]=tahmin;
            if(tahmin<0 || tahmin>99){
                System.out.println("lütfen 0-99 arası bir sayı giriniz:");
                continue;
            }
            if(tahmin==sayi){
                oyunDurumu=true;
                break;
            }else{
                System.out.println("yanlış tekrar deneyiniz! kalan can:"+ can--);
            }
            
        }
        if(oyunDurumu){
            System.out.println("tebrikler!kazandınız");
            System.out.println("girdiğiniz sayı:"+sayi);
            System.out.println("kalan canınız:"+can);
        }
        else{
            System.out.println("başaramadnız!!");
        }
        
        for(int value:tahminler){
            System.out.print(value+",");
        }
    }
    
}
