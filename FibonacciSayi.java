
package fibonaccisayi;

import java.util.Scanner;

public class FibonacciSayi {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int input=sn.nextInt();
        
        int s1=0;
        int s2=1;
        int toplam;
        System.out.println(input+"sayısının fibonacci serisi");
        
        for(int i=1;i<=input;i++){
            System.out.print(s1+",");
            toplam=s1+s2;
            s1=s2;
            s2=toplam;
        }
        
    }
    
}
