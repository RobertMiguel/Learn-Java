package com.programming.app.lacos;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor01, valor02, valor03, valor04;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o valor do número 1° :");
            valor01 = input.nextInt();
            System.out.println("Digite o valor do número 2° :");
            valor02 = input.nextInt();
            System.out.println("Digite o valor do número 3° :");
            valor03 = input.nextInt();
            System.out.println("Digite o valor do número 4° :");
            valor04 = input.nextInt();

            if (valor01 > valor02) {
                int temp = valor01;
                valor01 = valor02;
                valor02 = temp;
            }
            if (valor02 > valor03) {
                int temp = valor02;
                valor02 = valor03;
                valor03 = temp;
            }
            if (valor03 > valor04) {
                int temp = valor03;
                valor03 = valor04;
                valor04 = temp;
            }
            if (valor01 > valor02) {
                int temp = valor01;
                valor01 = valor02;
                valor02 = temp;
            }
            if (valor02 > valor03) {
                int temp = valor02;
                valor02 = valor03;
                valor03 = temp;
            }
            if (valor01 > valor03) {
                int temp = valor01;
                valor01 = valor03;
                valor03 = temp;
            }
            if (valor03 > valor04) {
                int temp = valor03;
                valor03 = valor04;
                valor04 = temp;
            }

            System.out.println("Ordem crescente : " + valor01 + " " + valor02 + " " + valor03 + " " + valor04);
            System.out.println("Ordem descrecente : " + valor04 + " " + valor03 + " " + valor02 + " " + valor01);
        }

        input.close();
    }
}
