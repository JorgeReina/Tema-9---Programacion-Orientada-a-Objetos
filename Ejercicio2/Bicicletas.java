package Ejercicio2;

public class Bicicletas extends Vehiculo {
  
  private int marchas; // número de marchas.

  public Bicicletas(int m) {
    super();
    this.marchas = m;
  }

  public void pincharRueda() {
    System.out.println("He pinchado la rueda delantera.");
  }

}
