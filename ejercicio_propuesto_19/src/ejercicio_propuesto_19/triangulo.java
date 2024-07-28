package ejercicio_propuesto_19;


public class triangulo {
    double lado;

    public triangulo(double _lado) {
        this.lado = _lado;
    }

    double perimetro() {
        double perimetro = lado * 3;
        return perimetro;
    }

    double altura() {
        double altura = (Math.sqrt(3) / 2) * lado;
        return altura;
    }

    double area() {
        double area = (Math.sqrt(3)  * Math.pow(lado,2))/4;
        return area;
    }
}

