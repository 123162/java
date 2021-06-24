
package switchcase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sn=new Scanner (System.in);
        System.out.println("Bir sayi giriniz.");
        int sayi=sn.nextInt();
        switch(sayi){
            case 1:
                System.out.println("girdiğiniz sayi 1'dir.");
                break;
            case 2:
                System.out.println("girdiğiniz sayi 2'dir.");
                break;
            case 3:
                System.out.println("girdiğiniz sayi 3'tür.");
                break;
            default:
                System.out.println("geçersiz sayi girdiniz.");

        }
      
    }
    
}
