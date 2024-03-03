package com.programming.app.datastructure.pen;

public class Pen {
  public String modelo;
  private float ponta;
  private boolean tampada; 
  private String color;

  public Pen(String m, float p, String c) {
    this.setModelo(m);
    this.setPonta(p);
    this.setColor(c);
    this.tampar();
  }
  
  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String m) {
    this.modelo = m;
  }

  public Float getPonta() {
    return this.ponta;
  }

  public void setPonta(Float p) {
    this.ponta = p;
  }

  public void tampar() {
    this.tampada = true;
  }

  public void destampar() {
    this.tampada = false;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String c) {
    this.color = c;
  }

  public void status() {
    System.out.println("About pen :");
    System.out.println("Model : " + this.getModelo());
    System.out.println("Tip : " + this.getPonta());
    System.out.println("Covered : " + this.tampada); 
    System.out.println("Color : " + this.color);
  }
}
