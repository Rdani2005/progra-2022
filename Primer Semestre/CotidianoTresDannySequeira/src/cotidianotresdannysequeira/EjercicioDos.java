/* 
 *  Realice un programa en Java que lee dos números enteros 
 *  correspondiente a la base y al exponente de una potencia. 
 *  La lectura de los números lo debe hacer en un procedimiento 
 *  que se denomine lectura datos.
 *  En el programa desarrolle una función de tipo entero que 
 *  recibe 2 números enteros como parámetro
 *  que representan la base y el exponente de la potencia. La función debe calcular y retornar el
 *  resultado de elevar la base al exponente, considerando lo siguiente:
 *    • Toda base elevada al exponente 0 el resultado es 1.
 *    • Toda base elevada al exponente 1 el resultado es la misma base.
 *    • Toda base elevada al exponente positivo el resultado es la multiplicación de la base tantas veces
 *      indica el exponente.
 *    • Toda base elevada a un exponente negativo el resultado es 1 / baseexpo
 */
package cotidianotresdannysequeira;

import javax.swing.JOptionPane;

public class EjercicioDos {
    private int base = 0, exponente = 0;
    
    private void LeerDatos() {
        base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base de la potencia"));
        exponente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente de la potencia"));
    }
    
    private int Potencia(int num, int exponente) {
        return (exponente == 0) ? 1 : num * Potencia(num, exponente - 1);
    }
    
    public void RunProgram() {
        do {
            LeerDatos();
            JOptionPane.showMessageDialog(
                    null, "La potencia de la base " + 
                            base + 
                            " con el exponente " + 
                            exponente + 
                            " es igual a: " + Potencia(base, exponente));
            
            
        } while (JOptionPane.showConfirmDialog(null, "Desea ver otra potencia? (S/N)") == JOptionPane.OK_OPTION);
    }
}
