package solution_Files;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by syezdsultanov on 11/5/17.
 */
public class ReverseNumericalOrder implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        int i =o2 - o1;
        System.out.println(i);
        return i;
    }



    public static void main(String[] args) {
        final List<Integer> numbers = Arrays.asList(4, 7, 1, 6, 3, 5, 4);
        Collections.sort(numbers, new ReverseNumericalOrder());
        for (int i : numbers)
            System.out.println(i);

    }


}