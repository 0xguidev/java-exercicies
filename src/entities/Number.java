package entities;

public class Number {
  public int value;

  public Number(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public boolean isNegative() {
    return value < 0;
  }
}
