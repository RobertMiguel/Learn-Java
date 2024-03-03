package com.programming.app.datastructure.bank;

/**
 * Bank
 */
public class BankAccount {

  public int numeroConta;
  protected String tipo;
  private String dono;
  private float saldo;
  private boolean status;

  public BankAccount() {
    this.setSaldo(0);
    this.setStatus(true);
  }

  public void estadoAtual() {
    System.out.println("Conta : " + this.getNumeroConta());
    System.out.println("Tipo da conta : " + this.getTipo());
    System.out.println("Dono : " + this.getDono());
    System.out.println("Saldo : " + this.getSaldo());
    System.out.println("Status : " + this.getStatus());
  }

  public void abrirConta(String tipo) {
    setTipo(tipo);
    setStatus(true);
    if (tipo == "CC") {
      this.setSaldo(50);
    } else {
      this.setSaldo(150);
    }
  }

  public void fecharConta() {
    if (this.getSaldo() > 0) {
      System.out.println("Conta ainda tem dinheiro!");
    } else if (this.getSaldo() < 0) {
      System.out.println("A conta ainda está em débito!");
    } else {
      setStatus(false);
      System.out.println("Conta fechada com sucesso!");
    }
  }

  public void depositar(float valor) {
    if (getStatus() != false) {
      this.setSaldo(this.getSaldo() + valor);
      System.out.println("Deposito realizado com sucesso! Depositado na conta do : " + getDono());
    } else {
      System.out.println("Impossível depositar");
    }
  }

  public void sacar(float valor) {
    if (this.getStatus() != false) {
      if(this.getSaldo() > valor) {
        this.setSaldo(this.getSaldo() - valor);
        System.out.println("Saque realizado com sucesso! Na conta do : " + getDono());
      } else {
        System.out.println("Saldo insuficiente!");
      }
    } else {
      System.out.println("Impossível sacar!");
    }
  }

  public void pagarMensal() {
    float valor;
    if (this.getTipo() == "CC") {
      valor = 12;
    } else {
      valor = 20;
    }
    if (this.getStatus() != false) {
      if (this.getSaldo() > valor) {
        this.setSaldo(this.getSaldo() - valor);
        System.out.println("Mensalidade paga com sucesso! Na conta do : " + getDono());
      } else{
        System.out.println("Saldo insuficiente!");
      }
    } else {
      System.out.println("Impossível pagar");
    }
  }

  public int getNumeroConta() {
    return numeroConta;
  }

  public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getDono() {
    return dono;
  }

  public void setDono(String dono) {
    this.dono = dono;
  }

  public float getSaldo() {
    return saldo;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  public boolean getStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

}
