package com.suphawking.slice;

import io.airlift.slice.Slice;
import io.airlift.slice.Slices;

import static io.airlift.slice.Slices.allocate;
import static io.airlift.slice.Slices.utf8Slice;
import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Created by loveknut on 2016/12/9.
 */
public class playslice {
  public static void main(String[] args) {
    int size = 10;
    Slice slice = allocate(size);
    System.out.println(slice.length());
    for (int i = 0; i < slice.length(); i++) {
      System.out.print(slice.getByte(i));

    }
    System.out.print('\n');
    System.out.println("=========");
    slice.fill((byte) 0x7f);
    for (int i = 0; i < slice.length(); i++) {
      System.out.print(slice.getByte(i));
    }
    

    System.out.print('\n');
    System.out.println("=========");

    System.out.println(Slices.copiedBuffer("apple", UTF_8).toString(UTF_8));


    String s = "apple \u2603 snowman";
    Slice slices = Slices.copiedBuffer(s, UTF_8);
    System.out.println(utf8Slice(s));

  }
}
