/**
 * Ejemplo del libro, gato simple
 * 
 * Nombre del archivo: GatoSimple.java
 * 
 * @author Jorge Reina Romero
 */

public class GatoSimple {
  
  //Atributos

  String color, raza, sexo;
  int edad;
  double peso;

  //Metodos

  //Constructor

  GatoSimple (String s) {
    this.sexo = s;
  }

  //getter

  String getSexo() {
    return this.sexo;
  }

  /**
   * Hace que el gato maulle
   */

   void maulla() {
    System.out.println("Miauuuu");
   }

   /**
    * hace que el gato ronronee
    */

    Void ronronea() {
      System.out.println("mrrrrrr");
    }

    /**
     * Hace que el gato coma.
     * A los gatos les gusta el pescado, si le damos otra comida la rechazara.
     * 
     * @param comida la comida que se le ofrece al gato
     */

     Void come(String comida) {
      if (comida.equals("pescado")) {
        System.out.println("Hmmm, gracias");
      } else {
        System.out.println("Lo siento, yo solo como pescado");
      }
     }

     /**
      * Pone a pelear a dos gatos.
      * Solo se van a pelear dos machos entre si.
      *
      * @param contrincante es el gato contra el que pelear
      *
      */

      Void peleaCon(GatoSimple contrincante) {
        if (this.sexo.equals("hembra")) {
          System.out.println("no me gusta pelear");
        } else {
          if (contrincante.getSexo().equals("hembra")) {
            System.out.println("No peleo contra gatitas");
          } else {
            System.out.println("Ven aquí que te vas a enterar");
          }
        }
      }

}
