
package operatorler;

public class Operatorler {

    public static void main(String[] args) {
        int a=12;
        int b=2;
        
        int toplama=a+b;
        int cikarma=a-b;
        int carpma=a*b;
        int bolme=a/b;
        int mod=a%b;
        
        System.out.println("toplama:"+toplama);
        System.out.println("cikarma:"+cikarma);
        System.out.println("carpma:"+carpma);
        System.out.println("bolme:"+bolme);
        System.out.println("mod:"+mod);
        
        toplama++;
        System.out.println("toplama:"+toplama);
        cikarma--;
        System.out.println("cikarma:"+cikarma);
        
        int sonuc=++a + --b;//a yı bir arttırıp,b yi bir azaltıp topladık
        System.out.println(sonuc);
        
        boolean kosul=(a/b)==2;//a nın b ye bolumunden kalan 2 mi
        System.out.println(kosul);
        
        boolean kosul1=(a<b);
        boolean kosul2=(a>b);
        boolean sonuc1=kosul1 && kosul2;//kosul1 VE kosul2 gerceklesiyor mu
        System.out.println(sonuc1);
        
        boolean sonuc2=kosul1 || kosul2;//kosul1 VEYA kosul2 den biri gerceklesiyor mu
        System.out.println(sonuc2);
        
        String sonuc3=(kosul1)? "dogru":"yanlış";//kosul1 için dogru yada yanlıs degerlerinden birini bas
        System.out.println(sonuc3);

    }
    
}
