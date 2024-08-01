package clases_sobre_figuras_geometricas;

public class cuadrado {
    int lado;
    public cuadrado(int lado) {
        this.lado = lado;
    }
    double calcular_area() {
        return lado*lado;
    }
    double calcular_perimetro() {
        return (4*lado);
    }
}