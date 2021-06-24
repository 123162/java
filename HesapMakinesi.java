
package hesapmakinesi;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int sayi1,sayi2,secim;
        System.out.println("birinci sayiyi giriniz");
        sayi1=sn.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        sayi2=sn.nextInt();
        
        System.out.println("yapmak istediğiniz işlemi seçiniz..");
        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.println("seçtiğiniz işlem..");
        secim=sn.nextInt();
        if(secim==1){
            System.out.println("toplama:"+(sayi1+sayi2));  
        }else if(secim==2){
            System.out.println("çıkarma:"+(sayi1-sayi2));
            
        }else if(secim==3){
            System.out.println("çarpma:"+(sayi1*sayi2));
        }else if(secim==4){
            if(sayi2==0){
                System.out.println("sonuç belirsizdir");
            }else{
                System.out.println("bölme:"+(sayi1/sayi2));
            }
      
        }else{
            System.out.println("gecersiz işlem sectiniz");
        }
    
    }
    
}
