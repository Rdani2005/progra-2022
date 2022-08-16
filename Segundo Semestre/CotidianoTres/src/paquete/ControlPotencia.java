package paquete;

public class ControlPotencia {

    public float Potencia(int b, int e) {
        if (e == 0) {
            return 1;
        }

        if (e == 1) {
            return b;
        }
        
        int acum = b;

        for (int i = 1; (e > 0) ? i < e : i < e; i++) {
            acum *= b;
        }
               
        return (e > 0) ? acum : 1 / acum;
    }
    
    
}
