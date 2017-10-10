package solution_Files;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by syezdsultanov on 10/10/17.
 */
public class Solution8 {
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);

        }
        Arrays.sort(array);

        for (int i : array)
            System.out.println(i);
    }
}
