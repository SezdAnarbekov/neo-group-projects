package week8;

import java.util.ArrayList;

/**
 * Created by syezdsultanov on 3/15/17.
 */
public class Test {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        double ave = 0;
        double sum = 0;
        double ave1 = 0;
        double sum1 = 0;
        int b;
        ArrayList<Double> di = new ArrayList<>();
        di.add(new Double(4.5));
        di.add(4.3);
        di.add(4.1);
        di.add(3.9);
        di.add(3.7);
        di.add(3.5);
        di.add(3.3);
        for (int i = 0; i < di.size(); i++){
            sum += di.get(i);
        }
        ave = sum / di.size();
        System.out.println(ave);

        double[] sa = {4.5, 4.3, 4.1, 3.9, 3.7, 3.5, 3.3};
        for (int i = 0; i < sa.length; i++){
            sum1 += sa[i];
        }
        ave1 = sum1 / sa.length;
        System.out.println(ave1);
        int[][] square = new int[3][3];
        for (int i = 0; i < 3; i++){
            square[i][i] = 5;
        }
        int sum2 = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                sum2 += square[i][j];
            }
        }
        System.out.println(sum2);
        System.out.println(5 +( b = 4));
    }


}