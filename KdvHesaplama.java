
package kdvhesaplama;

import java.util.Scanner;

public class KdvHesaplama {

    public static void main(String[] args) {
       Scanner sn=new Scanner(System.in);
       double tutar,kdvliFiyat,kdv=0.18;
       
       System.out.println("ürünün tutarını giriniz:");
       tutar=sn.nextDouble();
       kdvliFiyat=tutar+(tutar*kdv);
       System.out.println("ürünün kdvli fiyatı: "+kdvliFiyat);
       
        
    }
    
}
