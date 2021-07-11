
package javaapplication43;

public class Car {
    private int enginePower,model;
    public int speed;
    protected String color;

    Car() {
        this.enginePower = 300;
        this.model = 2020;
        this.speed = 120;
        this.color = "black";
    }
    public void print(){
        System.out.println(model);
    }

    
}
