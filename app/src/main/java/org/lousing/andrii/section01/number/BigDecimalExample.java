package org.lousing.andrii.section01.number;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExample {

  public static void showDemo() {
    int totalRideFee = 20;
    int friendsCount = 3;

    System.out.println("20 / 3 is " + totalRideFee / friendsCount);
    System.out.println("(double) 20/3 is " + ((double) totalRideFee / friendsCount));

    BigDecimal rideFee = BigDecimal.valueOf(20).setScale(2);
    BigDecimal noOfPeople = BigDecimal.valueOf(friendsCount);
    BigDecimal chargePerPerson = rideFee.divide(noOfPeople, RoundingMode.HALF_UP);
    System.out.println("chargePerPerson is " + chargePerPerson);

    double d1 = 3.1;
    double d2 = 1.21;

    System.out.println(d1 - d2);

    BigDecimal d3 = BigDecimal.valueOf(d1).setScale(2);
    BigDecimal d4 = BigDecimal.valueOf(d2).setScale(2);
    System.out.println(d3.subtract(d4));
  }
}
