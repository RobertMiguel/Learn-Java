package com.programming.app.vetor;

import java.util.Scanner;

public class q01 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int i, j;
    int contador;
    int numeros[] = new int[9];

    for (i = 0; i < 9; i++) {
      System.out.println("Digite um número :");
      numeros[i] = input.nextInt();
    }

    for (i = 0; i < 9; i++) {
      contador = 0 ; 
      for (j = 1; j < numeros[i]; j++) {
        if (numeros[i] % j == 0) {
          contador++;
        }
      }
      if (contador < 2) {
        System.out.println("Número : " + numeros[i] + " é primo"); 
        System.out.println("Na posição : " + i);
      }
    }


    input.close();
  }
}
