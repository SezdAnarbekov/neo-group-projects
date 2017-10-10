package week5;

/**
 * Created by syezdsultanov on 3/4/17.
 */
public class Test extends S1{
    String s;
    int r;
    double d;
    boolean f;

    Test(){}








    public static void main(String[] args) {
       Test t = new Test();
       for (int i = 0; i<10; i++){
        System.out.println(t instanceof B);
        }
    }
}
class B extends Test{}