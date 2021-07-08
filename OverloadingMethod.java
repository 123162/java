
package javaapplication33;

public class JavaApplication33 {
    
    //add(int ,int)
    static int add (int a,int b){
        System.out.println("1.method..");
        return a+b;
    }
    //add(int ,int,int)
    static int add(int a,int b ,int c){
        System.out.println("2.method..");
        return a+b+c;
    }
    //add(int ,int,double)
    static int add(int a,int b,double c){
        System.out.println("3.method..");
        return a+b+c;
    }

  
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1,2,4.6));

    
    }
    
}
