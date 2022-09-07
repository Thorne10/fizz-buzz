package com.tlglearning;

public class FizzBuzz {

  public static final String FIZZ_RESULT = "fizz";
  public static final String Buzz_RESULT = "buzz";

  public static String valueOf(int num) {
    String result = "";
    if (num % 3== 0) {
      result = FIZZ_RESULT;
    }
    if (num % 5 ==0) {
      result += Buzz_RESULT;
    }
    if (result.isEmpty()) {
      result = String.valueOf(num);
    }
    return result;
  }

}
