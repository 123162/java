
package javaapplication32;

public class JavaApplication32 {
    
    static int power(int x,int y){
        int result=1;//çarpma oldugu için 1 yazdık
        for(int i=1;i<=y;i++){
            result*=x;
            
        }
        return result;
    }
    public static void main(String[] args) {
        int r=power(2,3);//yukarıda return tanımladıgımız için ekrana bastıramıyoruz sonucu onun için main sınıfında bir degıskene 
        //atayıp bu degıskenı ekrana bastırarak sonucu gorebılırız.
        System.out.println("sonuç:"+r);
    }
    
}
