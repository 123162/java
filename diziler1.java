paket diziler;

içe aktarma java.util.Arrays;

public class Diziler {

public static void main(String[] args) {
   /* int[] numbers;//dizimizi tanımladık.
    numbers =new int[16];//16 karakterli bır dızı alanı olusturduk.
    System.out.println(Arrays.toString(numbers));//dizinın ıcındekı elamanları bastırma ıslemı yapılır.
    System.out.println(numbers[5]);//dızının 5.indexındekı degerı yazdırır.
    numbers[5]=32;//5.indexdekı elmanı degıstık
    System.out.println(numbers[5]);*/
   
   int[] numbers={1,2,3,4,5,6,7,8,9};
   System.out.println(numbers[5]);//5.indextekı elamanı yazdırdık.
    System.out.println(numbers.length); //diznin uzunlugunu verıyor.
  
   String[] names=new String[10];//10 karakterli string dizi tanımladık.
   System.out.println(Arrays.toString(names));//dizinın ıcındekı elamanları bastırma ıslemı yapılır.
   
   names[2]="ali";//2.indisteki karakteri degsıtırdık
   System.out.println(Arrays.toString(names));
           
}
}
