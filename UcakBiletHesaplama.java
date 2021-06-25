package ucakbilethesaplama;

import java.util.Scanner;

public class UcakBiletHesaplama {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int yas,km,tip;
      
        System.out.print("yaşınızı giriniz : ");
        yas=sn.nextInt();
        System.out.print("km yi giriniz: ");
        km=sn.nextInt();
        System.out.print("gidiş dönüş tipini seçiniz(1-gidiş 2-gidiş-dönüş): ");
        tip=sn.nextInt();
        double fiyat ,yasIndirimi,tipIndirimi;
       
        if(yas>0 &&km>0 &&(tip==1 ||  tip==2)){
            fiyat=km*0.10;
            System.out.println("seçimler doğru...");
            if(yas<12){
                yasIndirimi=fiyat*0.5;
                fiyat=fiyat-yasIndirimi;
            }else if(yas>12 || yas<24){
                yasIndirimi=fiyat*0.1;
                fiyat=fiyat-yasIndirimi;
            }else if(yas>65){
                yasIndirimi=fiyat*0.3;
                fiyat=fiyat-yasIndirimi;
            }else{
                System.out.println("yaş indirimi yokk");
            }if(tip==2){
                tipIndirimi=fiyat*0.2;
                fiyat=(fiyat-tipIndirimi)*0.2;
            }
            System.out.println("bilet fiyatınız:"+fiyat+"$");
            
        
        }else{
            System.out.println("yanlış seçim !! istatiklerden seçiniz....");
        }
    }
    
}
