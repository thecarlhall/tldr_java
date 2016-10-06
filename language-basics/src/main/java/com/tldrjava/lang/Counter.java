package com.tldrjava.lang;

import java.util.List;

public interface Counter {
  void collect(Number n);
  List<Number> getNumbers();

  /**
   * Get a count of the number of numbers collected.
   *
   * @return
   */
  int getCount();

  /**
   * Sum the numbers that have been collected.
   *
   * @return
   */
  double getSum();
}
