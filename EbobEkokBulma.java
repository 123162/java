

package ebobekokbulma;

import java.util.Scanner;

public class EbobEkokBulma {

   
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Lütfen sayiları giriniz: ");
       
        int s1,s2,ebob=1,ekok;
        s1=sn.nextInt();
        s2=sn.nextInt();
        int min=(s1<s2)? s1:s2;
         
        for(int i=min;i>0;i--){
            if((s1%i==0)&& (s2%i==0)){
                ebob=i;
                break;
            }
        }
        ekok=(s1*s2)/ebob;
        System.out.println("ekok: "+ekok);
        System.out.println("ebob: "+ebob);

        
    }
    
}
