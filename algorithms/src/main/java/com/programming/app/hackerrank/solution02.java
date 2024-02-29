package com.programming.app.hackerrank;

import java.util.Scanner;

/**
 * solution02
 */
public class solution02 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int mult;

    int number = input.nextInt();

    for (int i = 1; i <= 10; i++) {
      mult = number * i;
      System.out.println(number + " x " + i + " = " + mult);
    }

    input.close();

  }
}
