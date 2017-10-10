package solution_Files;

import java.util.Scanner;

/**
 * Created by syezdsultanov on 10/10/17.
 */
public class Solution6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] reverseArr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }

        for (int k = 0; k < arr.length; k++){
            reverseArr[k] = arr[arr.length - k - 1];
            System.out.print(reverseArr[k]);
        }

        in.close();
    }
}


