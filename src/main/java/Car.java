/**
 *
 * @author 0778364
 */
public class Car {
    private int yearModel;
    private String make;
    private double speed;
    
    Car(int yrmodel, String make){
        this.yearModel = yrmodel;
        this.make = make;
        this.speed = 0;
    }
    
    public static void main(String[] args) {
        
        Car sedan = new Car(2007, "Honda");
        for(int i = 1; i <= 5; i++){
            sedan.accelerate();
            System.out.println(sedan.getSpeed() + " mph");
        }
        
        for(int i = 1; i <= 5; i++){
            sedan.brake();
            System.out.println(sedan.getSpeed() + " mph");
        }
        
    }

    public int getYearModel() {
        return yearModel;
    }

    public String getMake() {
        return make;
    }

    public double getSpeed() {
        return speed;
    }
    
    public void accelerate() {
        this.speed = this.speed + 5;
    }
    
    public void brake() {
        this.speed = this.speed - 5;
    }


}
