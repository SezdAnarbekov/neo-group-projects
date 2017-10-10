package week8;

/**
 * Created by syezdsultanov on 2/28/17.
 */
public class Rectangle extends Shape {
    double width,length;
    public Rectangle(){
        super("Rectangle");
    }

    public Rectangle(double width,double length){
        super("Rectangle1");
        this.width=width;
        this.length=length;
    }

    public void printShape() {

        System.out.println("I'm a rectangle");

    }

    @Override
    public double area() {

        return width*length;
    }

    @Override
    public double perimeter() {
        // TODO Auto-generated method stub
        return 2*(width+length);
    }

    @Override
    public double volume() {
        return 0;
    }
}
