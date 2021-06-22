package karsilastirmaoperatoreleri;

public class KarsilastirmaOperatoreleri {

    public static void main(String[] args) {
        int a=34;
        int b=21;
        System.out.println(a==b);// a b 'ye esit mi
        //yada
        boolean sonuc=(a==b);
        System.out.println(sonuc);// a b 'ye esit mi
        
        boolean sonuc1=(a!=b);//a b'ye eşit değil mi
        System.out.println(sonuc1);

        boolean sonuc2=(a==b);//a b'ye eşit değil mi
        System.out.println(!sonuc2);//çıkan sonuc true ie false yapar,false ise true yapar.
    }
    
}
