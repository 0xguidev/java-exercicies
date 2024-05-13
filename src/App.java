import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number: ");
        System.out.println("Enter account holder: ");
        System.out.println("Is there an initial deposit (y/n)? ");
        System.out.println("Enter initial deposit value: ");

        System.out.println("Account Data: ");


        scanner.close();
    }
}
