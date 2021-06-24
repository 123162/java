
package etkinlikonerme;
import java.util.Scanner;

public class EtkinlikOnerme {

    public static void main(String[] args) {
        Scanner sn=new Scanner (System.in);
        int sıcaklık;
        System.out.print("hava sıcaklığını derece cinsinden giriniz: ");
        sıcaklık=sn.nextInt();
        if(sıcaklık>=30){
            System.out.println("yüzme yapabilirsiniz");
        }else if(sıcaklık>5 && sıcaklık<30){
            System.out.println("sinamaya gidebilirsiniz");
        }else if(sıcaklık<=4){
            System.out.println("kayak yapabilirsiniz");
        }else{
            System.out.println("geçerli sıcaklık değeri giriniz...");
        }
                
        
    }
    
}
