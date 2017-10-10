package solution_Files;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by syezdsultanov on 9/21/17.
 * Make program that finds the sum of all numbers from 1, to n, where n is a number given through input!
 *sample
 */
public class Solution3 {

    public static void main(String[] args) throws IOException {
        Scanner stin = new Scanner(System.in);

        int n = stin.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
