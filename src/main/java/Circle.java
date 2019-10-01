import java.util.Scanner;
/**
 *
 * @author 0778364
 */
public class Circle {
    
    private double radius;
    private final double pi = 3.14159;
    
    Circle(double radius){
        this.radius = radius;
    }
    
    Circle(){
        this.radius = 0.0;
    }
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your circle's radius?");
        double inputRadius = Double.parseDouble(keyboard.nextLine());
        
        Circle myCircle = new Circle(inputRadius);
        System.out.println("Your circle's area is: " + myCircle.getArea());
        System.out.println("Your circle's diameter is: " + myCircle.getDiameter());
        System.out.println("Your circle's circumference is: " + myCircle.getCircumference());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return this.radius * this.radius * this.pi;
    }
    
    public double getDiameter(){
        return this.radius * 2;
    }
    public double getCircumference(){
        return this.radius * this.pi * 2;
    }
    
}
