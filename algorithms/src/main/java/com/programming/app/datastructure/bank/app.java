package com.programming.app.datastructure.bank;

/**
 * app
 */
public class app {
  public static void main(String[] args) {
    
    BankAccount p1 = new BankAccount();

    p1.setDono("Jubileu");
    p1.setNumeroConta(1111);
    p1.abrirConta("CC");

    BankAccount p2 = new BankAccount();

    p2.setDono("Crelsa");
    p2.setNumeroConta(2222);
    p2.abrirConta("CP");

    p1.depositar(300);
    p2.depositar(500);
    
    p1.sacar(100);
    p1.fecharConta();

    p1.estadoAtual();
    p2.estadoAtual();
  }
}
