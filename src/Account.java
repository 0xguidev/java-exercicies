public class Account {
    private int accNumber;
    private String usrName;
    private double amountValue;

    private double getAmountValue() {
        return amountValue;
    }

    private void setAmountValue(double amountValue) {
        this.amountValue = amountValue;
    }

    private void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    private void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public void cadastro(int accNumber, String name, double value) {
        setUsrName(name);
        setAccNumber(accNumber);
        setAmountValue(value);
    }

    public void depositar(double depositValue) {
        double value = getAmountValue();
        setAmountValue(value + depositValue);
    }

    public void saque(double withdrawValue) {
        double value = getAmountValue();
        int withdrawTax = 5;
        if ((withdrawValue + withdrawTax) < value) {
            setAmountValue(value - (withdrawValue + withdrawTax));
        }
    }

    @Override
    public String toString() {
        return "Account: " + accNumber +
                ", Holder: " + usrName +
                ", Balance: " + amountValue + "\n";
    }
}
