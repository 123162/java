
package methodgiris;


public class MethodGiris {

   
    public static void main(String[] args) {
        f(2);
        power(2,3);
        
    }
    static void f(int x){
        int result=(x+2)*3;
        System.out.println(result);
    }
    static void power(int x,int y){
        int result=1;//çarpma oldugu için 1 yazdık
        for(int i=1;i<=y;i++){
            result*=x;
            
        }
        System.out.println("cevap: "+result);
    }
    
}
