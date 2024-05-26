public class Account {

  private final int  accNumber;
  private final String usrName;
  private double amountValue = 0;

  public Account(int accNumber, String usrName) {
    this.accNumber = accNumber;
    this.usrName = usrName;
  }

  public Account(int accNumber, String usrName, double initialDeposit) {
      this.accNumber = accNumber;
      this.usrName = usrName;
      depositar(initialDeposit);

  }

  public void depositar(double depositValue) {
      amountValue += depositValue;
  }

  public void saque(double withdrawValue) {
    amountValue -= withdrawValue + 5;
  }

  @Override
  public String toString() {
    return "Account: " + accNumber +
        ", Holder: " + usrName +
        ", Balance: $" + amountValue + "\n";
  }
}
