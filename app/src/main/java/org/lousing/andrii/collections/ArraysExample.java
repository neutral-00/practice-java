package org.lousing.andrii.collections;

import java.util.Arrays;

public class ArraysExample {

  public static void showDemo() {
    int[] numbers = new int[2];
    double[] doubles = new double[2];
    boolean[] booleans = new boolean[2];

    System.out.println("numbers[1] : " + numbers[0]); // 0
    System.out.println("doubles[0] : " + doubles[0]); // 0.0
    System.out.println("booleans[0] : " + booleans[0]); // false
    System.out.println("numbers.length : " + numbers.length);

    // array literals
    int[] someInts = { 16, 8, 32 };
    // multi dimensional array
    int[][] matrix = {
        { 1, 4, 8 },
        { 3, 9, 12 }
    };
    System.out.println("matrix[1][1] : " + matrix[1][1]);

    // print and sort arrays - using java.util.Arrays class
    System.out.println(Arrays.toString(someInts));
    Arrays.sort(someInts);
    System.out.println("After sorting");
    System.out.println(Arrays.toString(someInts));

  }
}
