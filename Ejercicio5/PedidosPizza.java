package Ejercicio5;

public class PedidosPizza {
  public static void main(String[] args) {
    
    Pizza p1 = new Pizza("Carbonara", "pequeña");
    Pizza p2 = new Pizza("funghi", "familiar");
    p2.sirve();
    Pizza p3 = new Pizza("cuatro quesos", "mediana");
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    p2.sirve();
    System.out.println("pedidas: " + Pizza.getTotalPedidas());
    System.out.println("servidas: " + Pizza.getTotalServidas());
    System.out.println("pendientes: " + (Pizza.getTotalPedidas() - Pizza.getTotalServidas()));

  }
}
