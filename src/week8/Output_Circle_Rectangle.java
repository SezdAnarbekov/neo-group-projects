package week8;

/**
 * Created by syezdsultanov on 2/28/17.
 */
public class Output_Circle_Rectangle {
    public static void main(String[] args) {

        //	Circle circle=new Circle();

        Circle circle1=new Circle(10.0);
        System.out.println("Area of circle is :"+circle1.area());
        System.out.println("Perimeter of circle is: "+circle1.perimeter());
        System.out.println("The name of the shape:"+circle1.toString());

        Rectangle  rect=new Rectangle(10.0,10.0);
        System.out.println("Area of circle is :"+rect.area());
        System.out.println("Perimeter of circle is: "+rect.perimeter());
        System.out.println("The name of the shape:"+rect.toString());

        //Rectangle rect1=new Rectangle();
        //System.out.println(rect1.toString());

        Rectangular_Prism prism=new Rectangular_Prism(5);
        System.out.println("The volume of prism is:  "+prism.volumePrism());
        System.out.println("The perimeter of the prism is: "+prism.perimeter());
        Cylinder cylinder=new Cylinder(5,10);
        System.out.println("The area of cyinder is :"+cylinder.getArea1());
        System.out.println("The volume of "+cylinder.getVolume());
        System.out.println("The volume of Circle " + circle1.volume());
        System.out.println("The volume of Rectangle " + + circle1.volume());

    }

}
