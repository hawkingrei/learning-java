package com.suphawking.deepShallowCopy;

/**
 * Created by loveknut on 16/7/24.
 */

  class Professor1 implements Cloneable {
    String name;
    int age;

    Professor1(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public Object clone() {
      Object o = null;
      try {
        o = super.clone();
      } catch (CloneNotSupportedException e) {
        System.out.println(e.toString());
      }
      return o;
    }
  }

class Student1 implements Cloneable {
  String name;
  int age;
  Professor1 p;

  Student1(String name, int age, Professor1 p) {
    this.name = name;
    this.age = age;
    this.p = p;
  }

  public Object clone() {
    Student1 o = null;
    try {
      o = (Student1) super.clone();
    } catch (CloneNotSupportedException e) {
      System.out.println(e.toString());
    }
    o.p = (Professor1) p.clone();
    return o;
  }
}

public class Deepcopy {
  public void main(String args[]) {
    long t1 = System.currentTimeMillis();
    Professor1 p = new Professor1("wangwu", 50);
    Student1 s1 = new Student1("zhangsan", 18, p);
    Student1 s2 = (Student1) s1.clone();
    s2.p.name = "lisi";
    s2.p.age = 30;
    System.out.println("name=" + s1.p.name + "," + "age=" + s1.p.age);// 学生1的教授不改变。
    long t2 = System.currentTimeMillis();
    System.out.println(t2-t1);
  }
}
