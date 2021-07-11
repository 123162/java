
package javaapplication45;

public class JavaApplication45 {

   
    public static void main(String[] args) {
        Student s1=new Student("ayse",34,90);
        Student s2=new Student("rabia",78,100);
        Student s3=new Student("nazlı",70,89);

        System.out.println("online ogrencı sayısı:"+Student.howStudent());
        s1.exit();
        System.out.println("online ogrencı sayısı:"+Student.howStudent());
        
        int[] notlar=new int[3];
        notlar[0]=s1.point;
        notlar[1]=s2.point;
        notlar[2]=s3.point;
        System.out.println(Student.calcOverall(notlar));
        
    }
    
}
