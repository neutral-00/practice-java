package org.lousing.andrii.section01.number;

public class MathExample {

  public static void showDemo() {
    double pi = Math.PI;
    System.out.println(pi);
    System.out.println(Math.max(3, 5));
    System.out.println(Math.min(3, 5));
    System.out.println(Math.sqrt(4));
    System.out.println(Math.abs(-5));

    System.out.println(Math.sqrt(-1)); // NaN
    System.out.println(0 / 0.00); // NaN
    System.out.println(5 / 0.00); // Infinity
    System.out.println(-5 / 0.00); // - Infinity

    System.out.println(Math.round(20.0 / 3.0)); // 7
    System.out.println(Math.round(20.0 * 100 / 3.0));

    System.out.println(Math.random()); // 0.0 and 1.0
    System.out.println((int) Math.random() * 100); // 0 - 100
    System.out.println((int) (Math.random() * 100) + 100); // 100 - 200
  }
}
