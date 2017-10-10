package solution_Files;

import java.util.Arrays;
import java.util.Scanner;
/**
 *Given five positive integers, find the minimum and maximum
 *values that can be calculated by summing exactly four of the five integers.
 *Then print the respective minimum and maximum values as a single
 *line of two space-separated long integers.
 */

public class Solution4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int maxSum = 0, minSum = 0;
        for (int arr_i = 0; arr_i < 5; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();


        for (int i = 0; i < 5; i++) {
            if (arr[i] == max)
                continue;
            else
                maxSum += arr[i];
        }
        System.out.println(maxSum);

        for (int i = 0; i < 5; i++) {
            if (arr[i] == min)
                continue;
            else
                minSum += arr[i];
        }
        System.out.println(minSum);


    }
}
