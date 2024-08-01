package clases_sobre_figuras_geometricas;

public class rectangulo {
    int base;
    int altura;
    rectangulo (int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    double calcular_area() {
        return base * altura;
    }
    double calcular_perimetro() {
        return (2 * base) + (2 * altura);
    }
}