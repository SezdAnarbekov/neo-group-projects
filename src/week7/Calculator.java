package week7;

/**
 * Created by syezdsultanov on 2/18/17.
 */

    class Test {
    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public static void addTwoNumbers(double a, int b) {
        System.out.println(a + b);
    }

    public static float addTwoNumbers(float a, int b) {
        return a + b;
    }
}
public class Calculator{
        public static void main(String[] args) {
           System.out.println(Test.addTwoNumbers(5,6));
        }
    }

