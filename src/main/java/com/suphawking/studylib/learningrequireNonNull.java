package com.suphawking.studylib;

/**
 * Created by loveknut on 16/8/26.
 */

import java.util.Objects;

public class learningrequireNonNull {
  public static String name=null;
  public static void main(String[] args) throws Exception {
      name = Objects.requireNonNull(name, "name cannot be null");

  }
}
