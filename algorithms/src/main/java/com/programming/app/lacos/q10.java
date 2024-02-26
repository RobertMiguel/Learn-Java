package com.programming.app.lacos;

import java.util.Scanner;

public class q10 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int numero, somaPares = 0, somaPrimos = 0;          

    for (int i = 1; i <= 10; i++) {
      System.out.println("Digite um número :");
      numero = input.nextInt();

      if (numero % 2 == 0) {
        somaPares+=numero;
      }

      int contadorPrimo = 0;

      for (int j = 1; j <= numero; j++) {
        if (numero % j == 0) {
          contadorPrimo++; 
        }
        if (contadorPrimo > 2) {
          break;
        }
      }

      if (contadorPrimo == 2) {
        somaPrimos+=numero;
      }

    }

    System.out.println("Soma dos pares : " + somaPares);
    System.out.println("Soma dos primos : " + somaPrimos);

    input.close();

  }
}
