package models;

public class Calc {

  public int testMultiply(int a, int b) {
    return a * b;
  }

  public int testAdd(int a, int b) {
    return a + b;
  }

  public double testDivide(double a, double b) {
    if (b == 0) {
      throw new IllegalArgumentException("Can't divide by zero");
    }
    return a / b;
  }
}