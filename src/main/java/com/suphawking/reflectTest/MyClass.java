package com.suphawking.reflectTest;

/**
 * Created by loveknut on 2017/1/15.
 */
public class MyClass {
  public int count;

  public MyClass(int start) {
    count = start;
  }

  public void increase(int step) {
    count = count + step;
  }
}

