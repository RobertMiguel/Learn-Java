package com.programming.app.loop;

import java.util.Scanner;

public class q08 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int i, idade = 0, quantidadePessoas = 6, contadorSuperior50 = 0, contadorPesoInferior60 = 0, contadorOlhoAzul = 0, contadorCabeloRuivo = 0, contadorNaoPossuemOlhoAzul = 0, totalIdade = 0, totalCorOlhos = 0;
    double peso, altura, contadorIdadeInferior150 = 0,mediaIdadeInferior150, porcentagemPessoasOlhosAzuis;
    char corOlhos, corCabelo;
    
   for(i = 0; i <= quantidadePessoas; i++) {
     System.out.println("Digite a idade :");
     idade = input.nextInt();
     System.out.println("Digite o peso :");
     peso = input.nextDouble();
     System.out.println("Digite a altura :");
     altura = input.nextDouble();
     System.out.println("Digite a cor dos olhos (A - Azul, P - Preto, V - Verde e C - Castanho)");
     corOlhos = input.next().toUpperCase().charAt(0);
     System.out.println("Digite a cor do cabelo (P - Preto, C - Castanho, L - Loiro e R - Ruivo)");
     corCabelo = input.next().toUpperCase().charAt(0);

     if(idade >= 50 && peso < 60) {
      contadorSuperior50++;
      contadorPesoInferior60++;
     }

     if(altura < 1.50) {
       contadorIdadeInferior150+=idade;
     }

     if(corOlhos == 'A') {
       contadorOlhoAzul++;
     }

     if(corCabelo == 'R' && corOlhos != 'A') {
        contadorCabeloRuivo++;
        contadorNaoPossuemOlhoAzul++;
     }

     totalIdade+=idade;
     totalCorOlhos++;

   } 

   mediaIdadeInferior150 = (totalCorOlhos > 0) ? (double) totalIdade / totalCorOlhos : 0;
   porcentagemPessoasOlhosAzuis = (contadorOlhoAzul * 100) / totalCorOlhos; 

   System.out.println("Quantidade de pessoas com idade superior a 50 : " + contadorSuperior50 + " e peso inferior a 60kg : " + contadorPesoInferior60);
    System.out.println("Média das idades das pessoas com altura inferior a 1,50 m : " + mediaIdadeInferior150);
    System.out.println("Porcentagem de pessoas com olhos azuis : " + porcentagemPessoasOlhosAzuis);
    System.out.println("Quantidade de pessoas ruivas : " + contadorCabeloRuivo + ", e não possuem olhos azuis : " + contadorNaoPossuemOlhoAzul);
    

    input.close();

  }
}
