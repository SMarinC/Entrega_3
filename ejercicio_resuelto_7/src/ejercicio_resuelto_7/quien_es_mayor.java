package ejercicio_resuelto_7;


public class quien_es_mayor {

    double valora, valorb;

    public quien_es_mayor(double _valora, double _valorb) {
        this.valora = _valora;
        this.valorb = _valorb;
    }
    String mayor() {
        if (valora > valorb) {
            return("A ="+String.valueOf(valora));
        } else if (valora == valorb) {
            return("son iguales ");
        } else {
            return("B ="+String.valueOf(valorb));
        }
    }
    
}