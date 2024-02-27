package com.programming.app.arrays;

import java.util.Scanner;

public class q03 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int i, j = 0;
    int numero;
    int vetor01[] = new int[10];
    int vetor02[] = new int[10];
    int intercalacao[] = new int[20];

    for (i = 0; i < 10; i++) {
      System.out.println("Digite um número para o vetor 1 :");
      vetor01[i] = input.nextInt();
      intercalacao[j] = vetor01[i];
      j++;
      System.out.println("Digite um número para o vetor 2 :");
      vetor02[i] = input.nextInt();
      intercalacao[j] = vetor02[i];
      j++;
    }

    for (int k = 0; k < intercalacao.length; k++) {
      System.out.println(intercalacao[k]);
    }

    input.close();
  }
}

