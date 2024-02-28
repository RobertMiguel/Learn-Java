package com.programming.app.datastructure.pen;

public class Pen {
  String modelo;
  String cor;
  float ponta;
  int carga;
  boolean tampada;

  void status() {
    System.out.print("It's pen : " + this.cor);
    System.out.print("Model : " + this.modelo);
    System.out.print("Tip : " + this.ponta);
    System.out.print("Charge : " + this.carga);
    System.out.print("Is it covered ?" + this.tampada);
  }

  void scribble () {
    if (this.tampada == true) {
      System.out.println("Error, I don't scribble!");
    } else {
      System.out.println("I'm scribbling!");
    }
  } 

  void cover() {
    this.tampada = true;
  } 

  void uncover() {
    this.tampada = false;
  }

}
