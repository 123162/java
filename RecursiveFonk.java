
package javaapplication34;


public class JavaApplication34 {
    
    static int f(int x){
        if(x==1){
            return 1;
        }
        return x+ f(x-1);
    }

    
    public static void main(String[] args) {
        System.out.println(f(10));
    }
    
}
