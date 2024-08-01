package clases_sobre_figuras_geometricas;

public class circulo {
    int radio;
    private double area, perimetro;
    circulo(int radio) {
        this.radio = radio;
    }
    double calcular_area() {
        area = Math.PI * Math.pow(radio, 2);
        area = Math.round(area * 100.0) / 100.0;
        return area;
    }
    double calcular_perimetro() {
        perimetro= 2*Math.PI*radio;
        perimetro = Math.round(perimetro * 100.0) / 100.0;
        return perimetro;
    }
}