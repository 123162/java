
package javaapplication15;

import java.util.Arrays;

public class JavaApplication15 {

 
    public static void main(String[] args) {
        int[] dizi=new int[6];//6 karakter uzunlugunda bir dizi tanımladık
        for(int i=0;i<6;i++){//i değişkenimizi bu dizi içinde gezdirdik
            dizi[i]=i*i;//dizinin her elamanına o elamanın indisinin karesini degerini verdık
        }
        System.out.println(Arrays.toString(dizi));//bu diziyi yazdırdık
        for(int i=0;i<dizi.length;i++){
            System.out.println("dizisinin "+ i +".elamanı:"+dizi[i]);
        }
        
    }
    
}
