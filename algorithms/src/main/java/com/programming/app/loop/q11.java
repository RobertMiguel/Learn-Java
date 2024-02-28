package com.programming.app.loop;

import java.util.Scanner;

public class q11 {
  public static void main(String[] args) {
   
    Scanner input = new Scanner(System.in);

    int op;
    int contadorParcela = 0;
    double valorCarro;
    double precoFinal = 0, quantidadeParcelas, valorParcela;

    System.out.println("Digite um valor do carro R$ :");
    valorCarro = input.nextInt();
    System.out.println("Digite a opção para forma de pagamento");
    System.out.println("1 - A vista");
    System.out.println("2 - Parcelado");
    op = input.nextInt();

    switch (op) {
      case 1:
        precoFinal = valorCarro - (valorCarro * 0.20); 
        System.out.println("Preco final do carro R$ : " + precoFinal);
        break;
      case 2:
        System.out.println("Digite a quantidade de parcelas :");
        quantidadeParcelas = input.nextInt();
        double porcentagemAcrescimo = 0.5;
        valorParcela = valorCarro / quantidadeParcelas;
        for (int i = 1; i <= quantidadeParcelas; i++) {
          double acrescimo = (i / 6.0) * porcentagemAcrescimo;
          valorParcela+= valorParcela + (acrescimo / 100.0);
          precoFinal+=valorParcela;
        }
        System.out.println("Preco final do carro R$ : " + precoFinal);
        break;

      default:
        System.out.println("Opção inválida!");
        break;
    }
    

    input.close();
  }
}
