package solution_Files;

/**
 * Created by syezdsultanov on 11/1/17.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class FirstNonRepeated {

    public static void main(String[] args) {

        System.out.println(" Please enter the input string :");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char c = firstNonRepeatedCharacter(s);
        System.out.println("The first non repeated character is :  " + c);
    }

    public static Character firstNonRepeatedCharacter(String str) {
        HashMap<Character, Integer> characterhashtable =
                new HashMap<>();
        int i, length;
        Character c;
        length = str.length();  // Scan string and build hash table
        for (i = 0; i < length; i++) {
            c = str.charAt(i);
            if (characterhashtable.containsKey(c)) {
                // increment count corresponding to c
                characterhashtable.put(c, characterhashtable.get(c) + 1);
            } else {
                characterhashtable.put(c, 1);
            }
        }
        // Search characterhashtable in in order of string str

        Set<Map.Entry<Character, Integer>> set = characterhashtable.entrySet();
        for (Map.Entry<Character,Integer> s:set){
            System.out.println(""+s.getKey()+s.getValue());
        }

        for (i = 0; i < length; i++) {
            c = str.charAt(i);
            if (characterhashtable.get(c) == 1)
                return c;
        }
        return null;
    }
}