package solution_Files;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by syezdsultanov on 2/22/17.
 */
public class UbakitFormattoo {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date dat = new Date(reader.readLine());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.US);
        System.out.println(simpleDateFormat.format(dat).toUpperCase());
    }
}


