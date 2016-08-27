package com.suphawking.studylib;

import java.util.Objects;

import static java.lang.System.out;

/**
 * Created by loveknut on 16/8/26.
 */




class Test {

  int x;
  int y;

  public Test(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public int hashCode() {
    out.println(Objects.hash(this.x));
    return Objects.hash(this.x, this.y);
  }
}

public class learninghascode{
  public static void main(String[] args) {

    // Get hash code for these objects.
    Test t = new Test(1, 10);
    System.out.println(t.hashCode());
    Test t2 = new Test(2, 20);
    System.out.println(t2.hashCode());
  }
}

