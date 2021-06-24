package sinifatlama;

import java.util.Scanner;

public class SinifAtlama {

    public static void main(String[] args) {
       Scanner sn=new Scanner (System.in);
       int turkce,matematik,fen,sosyal,bedenEgitimi;
       double ortalama;
        System.out.print("türkçe notunuzu giriniz: ");
        turkce=sn.nextInt();
        System.out.print("matematik notunuzu giriniz: ");
        matematik=sn.nextInt();
        System.out.print("fen notunuzu giriniz: ");
        fen=sn.nextInt();
        System.out.print("sosyal notunuzu giriniz: ");
        sosyal=sn.nextInt();
        System.out.print("bedenEgitimi notunuzu giriniz: ");
        bedenEgitimi=sn.nextInt();
        ortalama=(turkce+matematik+fen+sosyal+bedenEgitimi)/5;
        System.out.println("dönem sonu not ortalamanız: "+ortalama);
       
        if(ortalama<=50){
            System.out.println("kaldınız:((");
        }else{
            System.out.println("tebrikler,geçtiniz:)))");
        }
        
    }
    
}
