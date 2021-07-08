
public class Employee {
    private final String name;
    private final double salary;
    private final  int workHourse;
    private final int hireYear;

    public Employee(String name, double salary, int workHourse, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHourse = workHourse;
        this.hireYear = hireYear;
    }
    
    
    public double tax(){
        if(this.salary>=1000){
            return salary*0.03;
        }
        else{
            return 0.0;
        }
    }
    
    public double bonus(){
        return 30*this.workHourse;
    }
    
    public double increase(){
        int year=2020-this.hireYear;
        if(year<10){
            return salary*0.5;
        }else if(year>=10 && year<20){
            return salary*0.10;
        }else{
            return salary*0.15;
        }
    }

    
}
