public class CurrencyConverter {
  public static double dollarPrice;
  public static double iof = 6;
  public static double boughtValue;

  public static double totalBought() {
    return dollarPrice * boughtValue;
  }

  public static double amoutToPaid() {
    return totalBought() + (totalBought() * (iof / 100));
  }

}
