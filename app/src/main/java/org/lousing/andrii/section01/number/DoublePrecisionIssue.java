
package org.lousing.andrii.section01.number;

public class DoublePrecisionIssue {

  public static void showDemo() {

    double value = 0.02;
    double value2 = 0.03;
    double result = value2 - value;
    System.out.println(result); // Outputs: 0.009999999999999998
  }
}
