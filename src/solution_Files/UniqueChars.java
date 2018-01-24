package solution_Files;

/**
 * Created by syezdsultanov on 1/23/18.
 */
public class UniqueChars {
    public static void main(String[] args) {
        System.out.println(isUniqueChars("kaabanso"));
    }

    static boolean isUniqueChars(String str) {
        if (str.length() > 128) {
            return false;
        }
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;

        }
        return true;
    }
}
