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
    this.saldo = 0;
    this.status = false; 
  }

  public void abrirConta(String tipo) {
    setTipo(tipo);
    setStatus(true);
    if (tipo == "CC") {
      this.saldo = 50.0f;
    } else {
      this.saldo = 150.0f;
    }
  }

  public void fecharConta() {
    if (this.saldo > 0) {
      System.out.println("Conta ainda tem dinheiro!");
    } else if (this.saldo < 0) {
      System.out.println("A conta ainda está em débito!");
    } else {
      setStatus(false);
    }
  }

  public void depositar(float valor) {
    if (this.status != false) {
      setSaldo(getSaldo() + valor);
    } else {
      System.out.println("Impossível depositar");
    }
  }

  public void sacar(float valor) {
    if (this.status != false) {
      if(getSaldo() > valor) {
        setSaldo(getSaldo() - valor);
      } else {
        System.out.println("Saldo insuficiente!");
      }
    } else {
      System.out.println("Impossível sacar!");
    }
  }

  public void pagarMensal() {
    float valor;
    if (this.tipo == "CC") {
      valor = 12;
    } else {
      valor = 20;
    }
    if (this.status != false) {
      if (this.saldo > valor) {
        setSaldo(getSaldo() - valor);
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
