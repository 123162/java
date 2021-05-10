
package javaapplication16;

import java.util.Arrays;

public class JavaApplication16 {

    public static void main(String[] args) {
        int[] dizi={1,2,3,4,5,9};
        int[] dizi2=dizi;//dizi elamanlarını dizi1 e kopyaladık
        System.out.println(Arrays.toString(dizi2));
        
        
        //KOPYALAMA 2. YÖNTEM
        int[] numbers1=new int[6];
        for(int i=0;i<numbers1.length;i++){
            numbers1[i]=i+i;//numbers1 dızı elamanları ikişer ikişer0 dan başlayarak artırarak olusturuypruz
        }
        System.out.println(Arrays.toString(numbers1));//1. dizimizin elamanlarını yazdırıyoruz
        
        int[] numbers2=new int[numbers1.length];//2.dizimizi olustutp boyutunu 1. dizi kadar olusturyoruz
        for(int i=0;i<numbers1.length;i++){
            numbers2[i]=numbers1[i];//1.dizi elamnlarını 2.diziye kolyaladık
        }
        System.out.println(Arrays.toString(numbers2));
    }   
    
}
