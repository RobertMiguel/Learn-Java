package com.programming.app.datastructure.remoteControl;

/**
 * RemoteControl
 */
public class RemoteControl implements Controller{
  private int volume;
  private boolean ligado;
  private boolean tocando;

  public RemoteControl() {
    this.volume = 50;
    this.ligado = false;
    this.tocando = false;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }
  
  public boolean getLigado() {
    return ligado;
  }

  public void setLigado(boolean ligado) {
    this.ligado = ligado;
  }

  public boolean getTocando() {
    return tocando;
  }

  public void setTocando(boolean tocando) {
    this.tocando = tocando;
  }

  @Override
  public void ligar() {
    this.setLigado(true);
  }

  @Override
  public void desligar() {
    this.setLigado(false);
  }

  @Override
  public void abrirMenu() {
    System.out.println("Está ligado : " + this.getVolume());
    System.out.println("Está tocando : " + this.getTocando());
    System.out.print("Volume : " + this.getVolume());

    for (int i = 0; i < this.getVolume(); i+=10) {
      System.out.println("[]");
    }

  }

  @Override
  public void fecharMenu() {
    System.out.println("Fechando menu ...");
  }
  
  @Override
  public void maisVolume() {
  }

  @Override
  public void menosVolume() {
  }

  @Override 
  public void ligarMudo() {
  }

  @Override 
  public void desligarMudo() {
  }

  @Override
  public void play() {
  }

  @Override 
  public void pause() {
  }
}
