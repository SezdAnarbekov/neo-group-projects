package week8;

class Car{
    public int gearRatio = 8;
 int i;
}
class SportsCar extends Car {
  int i = 3;

    public static void main(String[] args){
        Car c = new SportsCar();
        System.out.println( c.gearRatio +""+ c.i );
    }
}