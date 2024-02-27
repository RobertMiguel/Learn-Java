package com.programming.app.arrays;

import java.util.Scanner;

public class q06 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int vetor[] = new int[10];

    System.out.println("Preencha o vetor ");
    for (int i = 0; i < 10; i++) {
      vetor[i] = input.nextInt();
    }

    for (int i = 0; i < 10; i++) {
      if (vetor[i] > vetor[i]) {

      }
    }

    input.close();

  }
}
