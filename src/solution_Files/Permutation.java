package solution_Files;

/**
 * Created by syezdsultanov on 10/11/17.
 */
public class Permutation {

    public static void main(String args[]) {
        System.out.println(permutation("lod","dol"));
        System.out.println(permutation("lod","lod"));
        System.out.println(permutation("God","dog"));


    }
    static String sort1(String s){
        char content[] = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    static boolean permutation(String s1, String s2){
       if (s1.length() != s2.length())
           return false;
       return sort1(s1).equals(sort1(s2));
    }
}


