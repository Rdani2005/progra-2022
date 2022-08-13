package cotidianocuatrodannysequeira.ejerciciodos;
/**
 * @ Cuarto Trabajo Cotidiano
 * @ Vehiculo
 * @Date: 4/4/2022
 * @Copyright: 2022 Danny Sequeira All rights reserved.
 */
public class Vehiculo {

    private final int tipo;
    private final int caseta;

    public Vehiculo(int tipo, int caseta) {
        this.tipo = tipo;
        this.caseta = caseta;
    }

    public int getTipo() {
        return tipo;
    }


    public int getCaseta() {
        return caseta;
    }
}
