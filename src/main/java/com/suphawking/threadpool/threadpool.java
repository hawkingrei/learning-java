package com.suphawking.threadpool;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class threadpool {
  static ExecutorService executor = Executors.newFixedThreadPool(10);

  public static void main(String[] args) throws Exception {
    Future<String> future = executor.submit(new Task());
    String result = future.get();
    System.out.println(result);
  }

  static class Task implements Callable<String> {
    @Override
    public String call() throws Exception {
      TimeUnit.SECONDS.sleep(10);
      return "A";
    }
  }
}