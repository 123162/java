
package kullanicigirisi;

import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {
        Scanner sn=new Scanner (System.in);
        String k_adi;
        int sifre;
        System.out.print("kullanıcı adınızı giriniz : ");
        k_adi=sn.nextLine();
        System.out.print("şifrenizi giriniz : ");
        sifre=sn.nextInt();
        
        if(k_adi.equals("java")&& sifre==123){
            System.out.println("sisteme giriş yapılıyor...");
            
        }else{
            System.out.println("yanlış kullanıcı adı veya şifre!");
        }
         
        
        
    }
    
}
