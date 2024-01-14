package com.programming.app.lacos;

import java.util.Scanner;

public class q6 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    int i, quantidadeTransacoes = 15, contadorComprasAVista = 0, contadorComprasAPrazo = 0;
    double transacao = 0, valorComprasAVista = 0, valorComprasAPrazo = 0, primeiraPrestacao = 0;
    char codigoTransacao;

    for(i = 1; i <= quantidadeTransacoes; i++) {
      System.out.println("Digite o código (V : para transacão ou P : para transacão a prazo) :");
      codigoTransacao = input.next().toUpperCase().charAt(0);

      if(codigoTransacao != 'V' && codigoTransacao != 'P') {
        System.out.println("Código inválido! tente novamente :");
        i--;
        continue;
      }

      System.out.println("Digite o valor da " + i + "º, transação :");
      transacao = input.nextDouble(); 

      if(codigoTransacao == 'V') {
        valorComprasAVista+=transacao;
        contadorComprasAVista++;
      } else {
        valorComprasAPrazo+=transacao;
        contadorComprasAPrazo++;
      }

    }
    
    if(valorComprasAPrazo > 1) {
      primeiraPrestacao = valorComprasAPrazo / 3;
    }

    if(contadorComprasAVista > 0) {
      System.out.println("Quantidade de compras efetuadas à vista : " + contadorComprasAVista);
      System.out.println("Valor total das compras à vista R$ : " + valorComprasAVista);
    } else {
      System.out.println("Nenhuma compra realizada à vista !");
    } 

    if(contadorComprasAPrazo > 0) {
      System.out.println("Quantidade de compras efetuadas a prazo : " + contadorComprasAPrazo);
      System.out.println("Valor total das compras a prazo R$ : " + valorComprasAPrazo);
      System.out.println("Valor da primeiras prestação das compras a prazo juntas : " + primeiraPrestacao);
    } else {
      System.out.println("Nenhuma compra realizada a prazo !");
    }

    input.close();

  }
}
