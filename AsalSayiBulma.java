package asalsayibulma;

import java.util.Scanner;

public class AsalSayiBulma {

    public static void main(String[] args) {
        Scanner sn=new Scanner (System.in);
        int sayi;
        boolean asal=true;
        do{
            System.out.println("lütfen pozitif bir sayi giriniz:");
            sayi=sn.nextInt();
            
        }while(sayi<2);
        
        for(int i=2;i<sayi;i++){
            if(sayi%2==0){
                asal=false;
                break;
            }
        }
        if(asal){
            System.out.println("asal sayı:"+sayi);
        }
        else{
            System.out.println("asal sayi değildir.");
        }
        
    }
    
}
