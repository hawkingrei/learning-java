package com.suphawking.google.guava.ImmutableSet;

import com.google.common.collect.ImmutableSet;

/**
 * Created by loveknut on 2016/12/7.
 */
public class gImmutableSet {
  public static void main(String[] args) {
    ImmutableSet<String> a = ImmutableSet.<String>builder()
        .add("wwz")
        .add("wwz")
        .add("fyl")
        .build();


    System.out.println(a);




  }
}
