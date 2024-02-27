package com.programming.app.arrays;

import java.util.Scanner;

public class q04 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int i, j;
    int numeros[] = new int[8];
    int positivos[] = new int[8];
    int negativo[] = new int[8];
    int indicePositivo = 1, indiceNegativo = 1;

    for (i = 0; i < 8; i++) {
      System.out.println("Digite um número :");
      numeros[i] = input.nextInt();

      if (numeros[i] > 0 && indicePositivo < 8) {
          positivos[indicePositivo] = numeros[i];
          indicePositivo++;
      } else if (numeros[i] < 0 && indiceNegativo < 8) {
        negativo[indiceNegativo] = numeros[i];
        indiceNegativo++;
      }
    }

    if (indicePositivo == 0) {
      System.out.println("Array positivo vazio!");
    } else {
      System.out.println("Array negativo :");
      for (j = 0; j < indicePositivo; j++) {
        System.out.println(positivos[j]);
      }
    }
    if (indiceNegativo == 0) {
      System.out.println("Array negativo vazio!");
    } else {
      System.out.println("Array negativo :");
      for(j = 0; j < indiceNegativo; j++) {
        System.out.println(negativo[j]);
      }
    }

    input.close();

  }
}
