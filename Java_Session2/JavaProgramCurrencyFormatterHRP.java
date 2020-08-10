import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class JavaProgramCurrencyFormatterHRP {

    public static void main(String[] args) {
        // HackerRankProblem : https://www.hackerrank.com/challenges/java-currency-formatter/problem
        /* Read input */
        System.out.println("Enter the amount in Rupees");
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        /* Create custom Locale for India.
          I used the "IANA Language Subtag Registry" to find India'bucket country code */
        Locale indiaLocale = new Locale("en", "IN");

        /* Create NumberFormats using Locales */
        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        /* Print output */
        System.out.println("US: "     + us.format(payment));
        System.out.println("India: "  + india.format(payment));
        System.out.println("China: "  + china.format(payment));
        System.out.println("France: " + france.format(payment));

        // End of hacker rank program
        double rupees = payment / 75.01;
        System.out.println(rupees + "Dollars");

        rupees = payment / 85.15;
        System.out.println(rupees + "Euros");

        rupees = payment / 10.73;
        System.out.println(rupees + "Yuan");
    }
}