package com.programming.app.loop;

import java.util.Scanner;

/**
 * q14
 */
public class q14 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int fatorial = 1;

    int n = input.nextInt();

    for (int i = 1; i <= n; i++) {
      fatorial = fatorial * i;
    }

    System.out.println(fatorial);

    input.close();

  }
}
