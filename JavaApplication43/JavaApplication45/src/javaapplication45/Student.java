
package javaapplication45;

public class Student {
    public String name;
    public int id,point;
    private static int counter=0;

    public Student(String name, int id,int point) {
        this.name = name;
        this.id = id;
        this.point=point;
        Student.counter++;
    }
    public void exit(){
        Student.counter--;
    }
    public static int howStudent(){
        return Student.counter;
    }
    public static double calcOverall(int[] arr){//not ortalaması hesaplayan method
        double overall=0;
        for(int i=0;i<=arr.length;i++){
            overall+=arr[i];
        }
        return arr.length/overall;
    }
    
    
}
