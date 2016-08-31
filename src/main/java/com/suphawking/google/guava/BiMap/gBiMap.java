package com.suphawking.google.guava.BiMap;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.Map;

/**
 * Created by loveknut on 16/8/31.
 */
public class gBiMap {
  public static void main(String... args) {
    BiMap<String,String> britishToAmerican = HashBiMap.create();
    britishToAmerican.put("aubergine","egglant");

    britishToAmerican.put("courgette","zucchini");

    britishToAmerican.put("jam","jelly");

    System.out.println(britishToAmerican.get("aubergine")); // eggplant

    BiMap<String,String> americanToBritish = britishToAmerican.inverse();

    System.out.println(americanToBritish.get("eggplant")); // aubergine

    System.out.println(americanToBritish.get("zucchini")); // courgette

    britishToAmerican.put("pudding","dessert");

    //britishToAmerican.put("sweet","dessert");  //BiMap强制其value的唯一性，如果发现违规则会抛出
    britishToAmerican.forcePut("sweet","dessert");
    System.out.println(britishToAmerican.get("sweet")); // dessert

    System.out.println(britishToAmerican.get("pudding")); // null  
  }
}
