
package javaapplication21;

import java.util.Scanner;


public class JavaApplication21 {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in); 
        System.out.print("bir deger giriniz: ");
        double sayi=sn.nextDouble();
        double harmonik=0.0;
        
        while(sayi>0){
            harmonik=harmonik+(1/sayi);
            sayi--;
        }
        System.out.println("harmonik: "+harmonik);

       
    }
    
}
