package com.programming.app.lacos;

import java.util.Scanner;

public class q12 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int numero;
    int quantidadePrimos = 0;
    int quantidadeNumeros = 10;

    for (int i = 1; i <= quantidadeNumeros; i++) {
      System.out.println("Digite um número :");
      numero = input.nextInt();

      int contadorPrimo = 0;

      for (int j = 1; j <= numero; j++) {
        if (numero % j == 0) {
          contadorPrimo++;
        }
      }

      if (contadorPrimo <= 2) {
        quantidadePrimos++;
      }
    }

    System.out.println("Quantidade de números primos : " + quantidadePrimos);

    input.close();

  }
}
