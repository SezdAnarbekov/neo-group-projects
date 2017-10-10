package week7;

/**
 * Created by syezdsultanov on 2/25/17.
 */
public class Cylinder extends Circle {
    double height;
    Cylinder(double r, double h) {
        super(r);
        height = h;
    }
    double calculateCylinderArea(){
        return circleArea() * height;
    }
}
