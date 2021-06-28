
package javaapplication21;

import java.util.Scanner;


public class JavaApplication21 {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in); 
        System.out.print("bir deger giriniz: ");
        int sayi=sn.nextInt();
        int sonuc=1;
        
        while(sayi>0){
            sonuc*=sayi;
            sayi--;
        }
        System.out.println("faktorıyel: "+sonuc);

       
    }
    
}
