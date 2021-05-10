paket dizgi dizisi;

içe aktarma java.util.Arrays;

public class StringArray {

public static void main(String[] args) {
   String[] names=new String[3];//dizmizin uzunlugunu 2 karakterden olusacak.
   names[0]="ali";
   names[1]="ayşe";
   names[2]="mehmet";
   
   System.out.println(Arrays.toString(names));//dizimizin elamanlarını yazdırıyoruz.
   
   //dizi elamanlarımızı tersten yazdırma
   for(int i=names.length-1;i>=0;i--){//names.length-1 dememizin nedeni en son 2.indexte bir elaman olmasındaıdr.-1 demezsek
       //3.indexte bir elaman bulamayıp hata verecek.
       System.out.println(names[i]);
   }
}
