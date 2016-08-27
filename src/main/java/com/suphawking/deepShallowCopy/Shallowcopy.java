package com.suphawking.deepShallowCopy;

/**
 * Created by loveknut on 16/7/24.
 */
class Professor10 implements Cloneable {
  String name;
  int age;

  Professor10(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}

class Student10 implements Cloneable {
  String name;// 常量对象。
  int age;
  Professor10 p;// 学生1和学生2的引用值都是一样的。

  Student10(String name, int age, Professor10 p) {
    this.name = name;
    this.age = age;
    this.p = p;
  }

  public Object clone() {
    Student10 o = null;
    try {
      o = (Student10) super.clone();
    } catch (CloneNotSupportedException e) {
      System.out.println(e.toString());
    }

    return o;
  }
}

public class Shallowcopy {
  public static void main(String[] args) {
    Professor10 p = new Professor10("wangwu", 50);
    Student10 s1 = new Student10("zhangsan", 18, p);
    Student10 s2 = (Student10) s1.clone();
    s2.p.name = "lisi";
    s2.p.age = 30;
    s2.name = "z";
    s2.age = 45;
    System.out.println("学生s1的姓名：" + s1.name + "\n学生s1教授的姓名：" + s1.p.name + "," + "\n学生s1教授的年纪" + s1.p.age);// 学生1的教授
  }
}
