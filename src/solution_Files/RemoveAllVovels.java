package solution_Files;

import java.util.Scanner;

/**
 * Created by syezdsultanov on 11/4/17.
 */
public class RemoveAllVovels {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string...");

    String inputString = sc.nextLine();

    String newInputString = inputString.replaceAll("[AEIOUaeiou]", "");

		System.out.println("The string without vowels...");

		System.out.println(newInputString);

		sc.close();
}
}