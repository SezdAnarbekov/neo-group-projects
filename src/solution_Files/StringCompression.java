package solution_Files;

/**
 * Created by syezdsultanov on 10/19/17.
 */
public class StringCompression {
    public static void main(String[] args) {

        System.out.println(sCompression("aabcccccaaa"));
    }
    static String sCompression(String s){
        int count = 0;
        StringBuilder result = new StringBuilder();
        char[] input = s.toCharArray();
        for (int i = 0; i < input.length; i++) {
            count++;

                if (i+1 >= input.length || input[i] != input[i+1]) {


                    result = result.append(input[i]).append(count);
                    count = 0;
                }
            }

        return result.toString();
    }
}
