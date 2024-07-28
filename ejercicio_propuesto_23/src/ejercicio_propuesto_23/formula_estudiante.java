
package ejercicio_propuesto_23;

public class formula_estudiante {
    double coeficiente_a, coeficiente_b, coeficiente_c;
    double x1, x2, discriminante;

    public formula_estudiante(double _coeficiente_a, double _coeficiente_b, double _coeficiente_c) {
        this.coeficiente_a = _coeficiente_a;
        this.coeficiente_b = _coeficiente_b;
        this.coeficiente_c = _coeficiente_c;
    }

    String formula(){
        discriminante = Math.pow(coeficiente_b, 2) - 4 * coeficiente_a * coeficiente_c;
        if (discriminante > 0) {
            x1 = (-coeficiente_b + Math.sqrt(discriminante)) / (2 * coeficiente_a);
            x2 = (-coeficiente_b - Math.sqrt(discriminante)) / (2 * coeficiente_a);
            return ( x1 + " y " + x2);
        } else if (discriminante == 0) {
            x1 = -coeficiente_b / (2 * coeficiente_a);
            return("Raiz es repetida =" + x1 );
        } else {
            return ("No tiene raices reales");
        }
    }
}
