package week8;

/**
 * Created by syezdsultanov on 2/28/17.
 */
public abstract class Shape {
    private String name;
    public Shape(String name){
        this.name=name;
    }
    public abstract void printShape();
    public String toString(){
        return name;
    }
    public abstract double area();
    public abstract double volume();
    public double perimeter(){

        return 0;
    }
}


