package week7;

/**
 * Created by syezdsultanov on 2/25/17.
 */
public class Circle {
    double radius;
    final double PI = 3.14;
    Circle(double r){
        radius = r;
    }
    public  double circleArea(){
        return PI * radius * radius;
    }
}
