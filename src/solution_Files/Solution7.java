package solution_Files;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by syezdsultanov on 9/28/17.
 * Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers.
 * You will then be given an unknown number of names to query your phone book for. For each number queried,
 * print the associated entry from your phone book on a new line in the form name=phoneNumber; if an entry for
 * is not found, print Not found instead.
 * <p>
 * Note: Your phone book should be a Dictionary/Map/HashMap data structure.
 */
class Solution7 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phonebook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            phonebook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            if (phonebook.containsKey(s)){
                System.out.println(s + "=" + phonebook.get(s));
            }
            else
                System.out.println("Not Found");
        }
        in.close();
    }
}
