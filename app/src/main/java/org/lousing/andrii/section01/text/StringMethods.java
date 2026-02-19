package org.lousing.andrii.section01.text;

import java.util.Arrays;

public class StringMethods {

  public static void showDemo() {
    System.out.println("\n---String Methods---\n");
    String s = "A bottlle of water";
    System.out.println("s.length is " + s.length());
    System.out.println("contains bottle : " + s.contains("bottle"));
    s = s.replace("lle", "le");
    System.out.println("replace(\"lle\", \"le\")");
    System.out.println("Given string: " + s);
    System.out.println("startWith(\"A\") :" + s.startsWith("A"));
    System.out.println("endWith(\"A\") :" + s.endsWith("water"));

    System.out.println("------");
    var s2 = "Snow Flakes ";
    System.out.println("s2.length() is " + s2.length());
    s2 = s2.strip();
    System.out.println("s2.length after strip() is called : " + s2.length());
    System.out.println("substring : " + s2.substring(0, 3)); // endIndex is excluded
    System.out.println(Arrays.toString(s2.getBytes()));
    // let's find how many words are there in s2
    System.out.println("words count in s2 : " + s2.split(" ").length);
    System.out.println("charAt(0) : " + s2.charAt(0));

  }
}
