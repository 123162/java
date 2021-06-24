
package javaapplication10;

public class JavaApplication10 {
    public static void main(String[] args) {
        int a=4;
        int b=8;
        int c=7;
        /*
        if(c<a){
            System.out.println("a büyüktür c");
        }
        else{
            System.out.println("c büyüktür a");
        }
        */
        
        if((a>b)&&(a>c)){
            System.out.println("a en büyüktür.");
        }
        else if((b>a)&&(b>c)){
            System.out.println("b en büyüktür");
        }
        else{
            System.out.println("cen büyüktür.");
        }
        if(a==4){//bu if bloğu 18.satırdaki ife bağlıdır.
            System.out.println("a 4'e esittir.");
        }
    }  
    
}
