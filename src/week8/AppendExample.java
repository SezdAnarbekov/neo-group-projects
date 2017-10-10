package week8;

import java.util.Locale;

/**
 * Created by syezdsultanov on 3/11/17.
 */
public class AppendExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        String s = new String("Syezd");
        sb.append("Java");
        System.out.println(sb);
        sb.delete(1,1);
        System.out.println(sb);
        sb.insert(1, "John");
        System.out.println(sb);
        sb.reverse();

        System.out.println(s.toUpperCase(Locale.KOREA));

        System.out.println(s.substring(2,4));
        String s2 = "java string";
        s2.concat("is mutable");
        s2 = s2.concat(" is immutable so assign it explecitly");
        System.out.println(s2);



    }
}
