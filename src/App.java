import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dollar price?");
        CurrencyConverter.dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        CurrencyConverter.boughtValue = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.amoutToPaid());

        sc.close();
    }
}
