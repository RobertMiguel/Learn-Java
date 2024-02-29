package com.programming.app.hackerrank;

import java.util.Scanner;

/**
 * solution03
 */
public class solution03 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double q = 0;

    int a = input.nextInt();
    int b = input.nextInt();
    int n = input.nextInt();

    for (int i = 0; i < n; i++) {
      q = a + Math.pow(2, i) * b;
      System.out.println("Valor q : " + q);
    }

    System.out.println(q);

    input.close();

  }
}
