
package notorthesapla;

import java.util.Scanner;

public class NotOrtHesapla {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int guiz,vize,ffinal;
        double ortalama;
        System.out.println("guiz notunuzu giriniz");
        guiz=sn.nextInt();
        System.out.println("vize notunuzu giriniz");
        vize=sn.nextInt();
        System.out.println("ffinal notunuzu giriniz");
        ffinal=sn.nextInt();
        
        ortalama=(guiz*0.2)+(vize*0.3)+(ffinal*0.5);
        System.out.println("not ortalamanız:"+ortalama);
        
        String sonuc=(ortalama>=40)?"geçti":"kaldı";
        System.out.println("durum:"+sonuc);

    }
    
}
