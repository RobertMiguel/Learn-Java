package com.programming.app.datastructure.remoteControl;

/**
 * app
 */
public class app {
  public static void main(String[] args) {

    RemoteControl rc = new RemoteControl();

    rc.ligar();
    rc.abrirMenu();
    rc.maisVolume();
    rc.menosVolume();
    rc.play();
    rc.pause();
    rc.ligarMudo();
    rc.desligarMudo();
    rc.desligar();
    
  }
}
