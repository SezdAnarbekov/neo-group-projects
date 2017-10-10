package week8;

import week7.*;

/**
 * Created by syezdsultanov on 2/28/17.
 */
public class Cylinder extends Circle{
    private double height;
    public Cylinder(double r, double h) {
        super( r );  // call base-class constructor
        setHeight( h );
    }
    public void setHeight( double h ) {
        height = h > 0 ? h : 0;
    }
    public double getHeight() { return height; }
    public double getArea1() {
        return 2 * super.area() +
                2 * Math.PI * super.getRaduis() * height;
    }
    public double getVolume() {
        return super.area() * height;
    }
    public  String toString() {
        return "(" + super.toString() + "," + height + ")";
    }
}
