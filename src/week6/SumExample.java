package week6;

/**
 * Created by syezdsultanov on 2/15/17.
 * Write a method called sum100 that returns the sum of the integers from 1 to 100.
 */
public class SumExample {
    static int sum;
    static int SumOfNumbers(){
       for (int i = 1; i <= 100; i++) {
           sum += i;
       }
       return sum;
    }
}
