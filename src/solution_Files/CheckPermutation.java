package solution_Files;

import java.util.Arrays;

/**
 * Created by syezdsultanov on 1/23/18.
 */
public class CheckPermutation {
    public static void main(String[] args) {
        System.out.println(isPermutation("sam","mas"));
    }
    static boolean isPermutation(String s,String t){
    if (s.length() != t.length()){
        return false;
        }
        return sort(s).equals(sort(t));
    }
    static String sort(String s){
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}
