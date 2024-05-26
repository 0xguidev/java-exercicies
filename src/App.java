import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);
    Account account;

    System.out.print("Enter account number: ");
    int accNum = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter account holder: ");
    String accName = scanner.nextLine();

    System.out.print("Is there an initial deposit (y/n)? ");
    char isInitialDeposit = scanner.nextLine().charAt(0);

    double initialValue;
    if (isInitialDeposit == 'y') {
      System.out.print("Enter initial deposit value: ");
      initialValue = scanner.nextDouble();
      scanner.nextLine();

      account = new Account(accNum, accName, initialValue);
    } else {
      account = new Account(accNum, accName);
    }

    System.out.println("Account Data:");
    System.out.println(account);

    System.out.print("Enter a deposit value: ");
    double depositValue = scanner.nextDouble();
    scanner.nextLine();

    account.depositar(depositValue);
    System.out.println(account);

    System.out.print("Enter a withdraw value: ");
    double withdrawValue = scanner.nextDouble();
    scanner.nextLine();

    account.saque(withdrawValue);
    System.out.println(account);

    scanner.close();
  }
}
