package trabajocotidianouno;

import javax.swing.JOptionPane;

/*
* Desarrolle un programa que procesa 5 números por medio del ciclo for. 
* Para cada número leído debe evaluar y reportar el mensaje PAR si el número 
* leído es par y el mensaje IMPAR si el número leído es impar. 
* Al finalizar el procesamiento de los 10 números, el programa debe calcular 
* y reportar el promedio de todos los números, promedio de números pares 
* y promedio de números impares.
 */
public class PromediosParImpar {
    // Metodo principal
    public void Contemos() {
        // Variables
        int contPar = 0, contImpar = 0;
        float acumPar = 0, acumImpar = 0, acumulador = 0,
                prom, promPar, promImpar;
        // Pedir datos, acumularlos, y contar si es par o impar
        for (int i = 1; i <= 5; i++) {
            float num = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Ingrese un numero")
            );

            acumulador += num;
            if (num % 2 == 0) {
                contPar++;
                acumPar += num;
            } else {
                contImpar++;
                acumImpar += num;
            }
        }
        // Obtener promedios
        prom = getProms(acumulador, 5);
        promPar = getProms(acumPar, contPar);
        promImpar = getProms(acumImpar, contImpar);
        // Mensajes finales
        showFinalMessage(prom, 1);
        showFinalMessage(promPar, 2);
        showFinalMessage(promImpar, 3);
        
    }
    // Metodo que retorne el promedio, tomando en cuenta los contadores
    // y sus valores
    private float getProms(float acumulador, float contador) {
        if (contador != 0) {
            return acumulador / contador;
        } else {
            return 0;
        }
    }
    
    // Mensajes finales, primera opcion: promedio completo, segunda: promedio par, tercera: promedio impar 
    private void showFinalMessage(float prom, int types) {
        switch (types) {
            case 1:
                JOptionPane.showMessageDialog(
                        null,
                        "El promedio final de los numeros es: " + prom);
                break;
            case 2:
                JOptionPane.showMessageDialog(
                        null,
                        "El promedio final de los numeros  pares es: " + prom);
                break;
            default:
                JOptionPane.showMessageDialog(null,
                    "El promedio final de los numeros impares es: " + prom);
                break;
        }
    }
}
