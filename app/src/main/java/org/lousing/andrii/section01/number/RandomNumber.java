package org.lousing.andrii.section01.number;

import java.util.Random;

public class RandomNumber {

  public static void showDemo() {
    // let's simulate rolling a dice.
    Random r = new Random();
    System.out.println(r.nextInt(6) + 1);
  }
}
