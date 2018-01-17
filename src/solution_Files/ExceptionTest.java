package solution_Files;

import java.util.HashSet;

/**
 * Created by syezdsultanov on 12/23/17.
 */


public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println(isColorful(326));
    }

    //3, 2, 6, 32, 26,
    static boolean isColorful(int i) {
        HashSet set = new HashSet();
        String st = String.valueOf(i);
        String l;
        for (int k = 0; k < st.length(); k++) {
            for (int j = k + 1; j < st.length() + k; j++) {
                l = st.substring(k, j);
                if (j == st.length())
                    break;
                System.out.println(l);
                int san = calculate(l);
                if (set.contains(san))
                    return false;
                set.add(san);
            }
        }
        return true;
    }

    static int calculate(String s) {
        int input = Integer.parseInt(s);
        if (input < 10) {
            return input;
        }
        int result = 1;
        while (input > 0) {
            int temp = input % 10;
            result *= temp;
            input = input / 10;
        }
        return result;
    }
}