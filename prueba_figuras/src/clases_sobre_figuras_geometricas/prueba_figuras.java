
package clases_sobre_figuras_geometricas;


public class prueba_figuras {

    
    public static void main(String[] args) {
        ventana_principal ventana = new ventana_principal();
        ventana.show(true);
    
    }
    
}
/*
*Aclaración: en la clase triangulo se aplico lo dado en la guia,
*pero hay que tener en cuenta que va ser imposible el caso de 
*prueba equilatero, ya que se usa el teorema de pitagoras que esta
*diseñado para triangulos rectangulos, los cuales por definición su
*hipotenusa siempre sera más grande que los catetos, por lo que su 
*prueba solo se ejecuto en tipo isosceles y escaleno.
*/