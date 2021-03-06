package com.suphawking.google.guava.Multimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ArrayListMultimap;
import java.lang.String;
import java.util.Collection;
/**
 * Created by loveknut on 16/8/31.
 */
public class gMultimap {
  public static void main(String... args) {
    Multimap<String, String> myMultimap = ArrayListMultimap.create();

    // Adding some key/value
    myMultimap.put("Fruits", "Bannana");
    myMultimap.put("Fruits", "Apple");
    myMultimap.put("Fruits", "Pear");
    myMultimap.put("Vegetables", "Carrot");

    // Getting the size
    int size = myMultimap.size();
    System.out.println(size);  // 4

    // Getting values
    Collection<String> fruits = myMultimap.get("Fruits");
    System.out.println(fruits); // [Bannana, Apple, Pear]

    Collection<String> vegetables = myMultimap.get("Vegetables");
    System.out.println(vegetables); // [Carrot]

    // Iterating over entire Mutlimap
    for(String value : myMultimap.values()) {
      System.out.println(value);
    }

    // Removing a single value
    myMultimap.remove("Fruits","Pear");
    System.out.println(myMultimap.get("Fruits")); // [Bannana, Pear]

    // Remove all values for a key
    myMultimap.removeAll("Fruits");
    System.out.println(myMultimap.get("Fruits")); // [] (Empty Collection!)
  }
}
