package ejercicio_resuelto_10;


public class calculadora_matricula {
    double patrimonio, matricula =50000, estrato;

    public calculadora_matricula(double _patrimonio, double _estrato) {
        this.patrimonio = _patrimonio;
        this.estrato = _estrato;
    }

    double calcular_matricula() {
        if (patrimonio > 2000000 && estrato > 3) {
            matricula = matricula + (patrimonio * 0.03);
        }
        return matricula;
    }
}

