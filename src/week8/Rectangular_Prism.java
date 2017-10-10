package week8;

/**
 * Created by syezdsultanov on 2/28/17.
 */
public class Rectangular_Prism extends Rectangle {
    double height;

    public Rectangular_Prism(double height){
        super(10,10);
        this.height=height;

    }
    public double volumePrism(){
        return height*width*length;
    }

    public double perimeter(){
        return 2*(width+length)+2*(width+height)+2*(length+height);
    }

}
