import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accNum = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter account holder: ");
        String accName = scanner.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char isInitialDeposit = scanner.nextLine().charAt(0);

        double initialValue = 0;
        if (isInitialDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            initialValue = scanner.nextDouble();
            scanner.nextLine();
        } else if (isInitialDeposit == 'n') {
            System.out.print("Initial value is equal zero");
        } else {
            System.out.print("Invalid value");
        }


        Account accTeste = new Account();

        accTeste.cadastro(accNum, accName, initialValue);

        System.out.print("Account Data: ");
        System.out.println(accTeste.toString());

        System.out.print("Enter a deposit value: ");
        double depositValue = scanner.nextDouble();

        accTeste.depositar(depositValue);
        System.out.println(accTeste.toString());

        System.out.print("Enter withdraw value: ");
        double withdrawValue = scanner.nextDouble();

        accTeste.saque(withdrawValue);
        System.out.println(accTeste.toString());
        scanner.close();
    }
}
