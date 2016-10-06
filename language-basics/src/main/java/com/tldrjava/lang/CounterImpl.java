package com.tldrjava.lang;

public class CounterImpl extends BaseCounter {
  public int getCount() {
    return numbers.size();
  }

  public double getSum() {
    // Java 7
    double sum = 0;

    for (Number number : numbers) {
      sum += number.doubleValue();
    }

    // Java 8
    sum = numbers.stream().mapToDouble(Number::doubleValue).sum();

    return sum;
  }

  public static void main(String[] args) {
    Counter c = new CounterImpl();
    c.collect(1);
    c.collect(2.0);
    c.collect(3.3d);
    c.collect((byte) 4);
    c.collect((int) 'a');

    Thread t = new Thread() {
      public void run() {
        for (char i = 'a'; i <= 'z'; i++) {
          System.out.println(i);
        }
      }
    };
    t.start();

    System.out.println("The count is " + c.getCount() + " and the sum is " + c.getSum());
  }

  @Override
  protected void collected(Number n) {
    System.out.println("Collected " + n);
  }
}
