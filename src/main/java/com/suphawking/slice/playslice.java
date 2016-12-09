package com.suphawking.slice;

import io.airlift.slice.Slice;
import io.airlift.slice.Slices;

import static io.airlift.slice.Slices.allocate;
import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Created by loveknut on 2016/12/9.
 */
public class playslice {
  public static void main(String[] args) {
    for (int size = 0; size < 100; size++) {
      Slice slice = allocate(size);
    }
    System.out.print(Slices.copiedBuffer("apple", UTF_8).toString(UTF_8));
  }
}
