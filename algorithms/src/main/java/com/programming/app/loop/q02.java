package com.programming.app.loop;

public class q02 {
  public static void main(String[] args) {

    double despesas = 200.0;
    double ingressosVendidos = 120;
    double aumentoIngressos = 26;


    for (double valorIngresso = 5; valorIngresso >= 1.0; valorIngresso-=0.5) {

      double ingressosVendidosComAumento = ingressosVendidos + aumentoIngressos;

      double lucroMaximo = (valorIngresso * ingressosVendidos) + ((valorIngresso - 0.5) * aumentoIngressos) - despesas;

      System.out.printf("Preço do Ingresso: R$ %.2f\n", valorIngresso);
      System.out.println("Ingressos Vendidos: " + ingressosVendidosComAumento);
      System.out.printf("Lucro Máximo Esperado: R$ %.2f\n", lucroMaximo);
      System.out.println("------------------------------");
    }
  }
}
