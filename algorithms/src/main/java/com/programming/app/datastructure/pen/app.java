package com.programming.app.datastructure.pen;

public class app {
  public static void main(String[] args) {

    Pen p1 = new Pen();

    p1.cor = "Azul";
    p1.ponta = 0.5f;
    p1.tampada = false;
    p1.cover();
    p1.scribble();
    p1.status();

    Pen p2 = new Pen();

    p2.modelo = "Bic";
    p2.cor = "Preta";
    p2.uncover();
    p2.scribble();
    p2.status();

  }
}
