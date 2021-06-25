package whileornek;

import java.util.Scanner;

public class WhileOrnek {

    public static void main(String[] args) {
        
        Scanner sn=new Scanner(System.in);
        int sayi;
        int toplam=0;
    
        while(true){//sonsuz deger almak için  true yazdık 
            System.out.print("sayi giriniz: ");
            sayi=sn.nextInt();
        
            
            if(sayi<0){
                System.out.println("negatif deger girdiniz..");
                System.out.println("toplam:"+toplam);
                break;
         
            } if(sayi%2==1){
                toplam=toplam+sayi;
               
               
            }
            
        }
        
    }
   
    
}
