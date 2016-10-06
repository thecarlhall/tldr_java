package com.tldrjava.lang;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseCounter
    implements Counter, Serializable {

  protected final List<Number> numbers = new ArrayList<>();

  @Override
  public void collect(Number n) {
    numbers.add(n);

    collected(n);
  }

  protected void collected(Number n) {}

  public List<Number> getNumbers() {
    return new ArrayList<>(numbers);
  }
}
