package week6;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by syezdsultanov on 2/11/17.
 */
public class Solution2 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> list = new HashSet<String>();
        list.add("арбуз");
        list.add("банан");
        list.add("вишня");
        list.add("груша");
        list.add("дыня");
        list.add("ежевика");
        list.add("жень-шень");
        list.add("земляника");
        list.add("ирис");
        list.add("картофель");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext())
        {
            String text = iterator.next();
            System.out.println(text);
        }

    }
}


