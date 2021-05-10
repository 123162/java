
package javaapplication14;

import java.util.Arrays;

public class JavaApplication14 {

  
    public static void main(String[] args) {
        Object[] dizi=new Object[3];//object sınıfı sayesinde farklı tipte verileri bir dizi icinde tutabiliriz.
        dizi[0]=3;
        dizi[1]="ali";
        dizi[2]=3.66;
        System.out.println(Arrays.toString(dizi));
    }
    
}
