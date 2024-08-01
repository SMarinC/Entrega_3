package clases_sobre_figuras_geometricas;

public class triangulo_rectangulo {

    int base, altura;
    private double area, perimetro, hipotenusa;
    public triangulo_rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    double calcular_area() {
        area = ((base * altura) / 2.0);
        area = Math.round(area * 100.0) / 100.0;
        return area; 
    }
    double calcular_perimetro() {
        perimetro = (base + altura + calcular_hipotenusa());
        perimetro = Math.round(perimetro * 100.0) / 100.0;
        return perimetro;
    }
    double calcular_hipotenusa() {
        hipotenusa = Math.pow((base*base) + (altura*altura), 0.5);
        hipotenusa = Math.round(hipotenusa * 100.0) / 100.0;
        return hipotenusa;
    }
    String determinar_tipo() {
        if ((base == altura) && (base == calcular_hipotenusa()) && (altura
                == calcular_hipotenusa()))
            return ("Equilátero");
        else if ((base != altura) && (base != calcular_hipotenusa()) &&
                (altura != calcular_hipotenusa()))
            return("Escaleno");
        else
            return("Isósceles" );
    }
}