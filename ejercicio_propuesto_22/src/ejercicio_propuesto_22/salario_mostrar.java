
package ejercicio_propuesto_22;


public class salario_mostrar {
    double salario;
    String salario_nulo="";

    public salario_mostrar(double _salario) {
        this.salario = _salario;
    }   

    String mostrar () {
        if (salario > 450000) {
            return String.valueOf(salario);
        } 
        else {
            return salario_nulo;
        }
    }
}

