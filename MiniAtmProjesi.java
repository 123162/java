
package atmprojesi;

import java.util.Scanner;

public class AtmProjesi {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int bakiye=1000,input,miktar;
        System.out.println("yapı kredi bankasına hoşgeldiniz...");
        System.out.println("güncel bakiyeniz:"+bakiye+"TL'dir.");
        
        while(bakiye>0){
            System.out.println("1-) para yatır");
            System.out.println("2-) para çek");
            System.out.println("3-) bakiye sorgula");
            System.out.println("4-) çıkış yap");
            System.out.println("yapmak istediğiniz işlemi seçiniz: ");
            input=sn.nextInt();
            
            if(input==1){
                System.out.println("yatırmak istediğiniz miktarı giriniz: ");
                miktar=sn.nextInt();
                bakiye+=miktar;
                System.out.println("güncellenen bakiyeniz:"+bakiye);
                
            }else if(input==2){
                 System.out.println("çekmek istediğiniz miktarı giriniz: ");
                 miktar=sn.nextInt();
                 if(miktar>bakiye){
                     System.out.println("yetersiz bakiye");
                 }else{
                     bakiye -=miktar;
                 }

            }else if(input==3){
                System.out.println("güncel bakiyeniz:"+bakiye);
            }else if(input==4){
                System.out.println("çıkış yapılıyor...");
                break;
            }else{
                System.out.println("geçersiz işlem girdiniz");
            }
            

        }
    }
    
    
}
