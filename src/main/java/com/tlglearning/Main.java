package com.tlglearning;

import java.util.Set;

public class Main {
  public static void main(String[]arg) {
    int i =1;
    do {
      Set<FizzBuzz> value = FizzBuzz.valueOf(i);
    }
   while (i <=100);{

     System.out.printf("%d: %s %n,i, value");
      ++i;
   }
  }

}
