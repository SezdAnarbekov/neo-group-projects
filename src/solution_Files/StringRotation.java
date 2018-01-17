package solution_Files;

/**
 * Created by syezdsultanov on 10/19/17.
 */
public final class StringRotation {
     static public void main(String[] args) {
        System.out.println(isRotation("waterbottle","elttobretaw"));
    }
    static boolean isRotation(String s1, String s2){
     String reverseString = new StringBuilder(s1).reverse().toString();

        return s2.equals(reverseString);
    }

}
