package solution_Files;

import java.util.Scanner;

/**
 * Created by syezdsultanov on 10/10/17.
 */
public class Solution5 {
    public static void main(String[] args) {


        Scanner stdin = new Scanner(System.in);

        int linesOfStrings = stdin.nextInt();

        String outputEven = "";
        String outputOdd = "";

        for (int i = 0; i < linesOfStrings; i++){

            char[] soz= stdin.next().toCharArray();


            for (int k = 0; k < soz.length; k++){
                if (k % 2 == 0){
                    outputEven = outputEven + soz[k];
                }

                else {
                    outputOdd = outputOdd + soz[k];
                }
            }
            System.out.print(outputEven + " " + outputOdd);
            outputEven = "";
            outputOdd = "";

        }


    }
}
