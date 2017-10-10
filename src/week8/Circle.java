package week8;

/**
 * Created by syezdsultanov on 2/28/17.
 */
public class Circle extends Shape {
    private double radius;
    public Circle(double radius){
        super("Circle");
        this.radius=radius;
    }
    public void printShape(){
        System.out.println(toString());
    }

    @Override
    public double volume() {
        return 0;
    }

    public double area(){
        return radius*radius*3.14;
    }
    public double getRaduis(){
        return radius;
    }

    public double perimeter() {
        return 2*3.14*radius;
    }

}
