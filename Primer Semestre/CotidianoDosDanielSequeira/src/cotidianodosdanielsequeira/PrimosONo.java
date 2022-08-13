package cotidianodosdanielsequeira;
import javax.swing.JOptionPane;
/**
 *
 * @author Rdani2005
 */
public class PrimosONo {
    
    private int Contador = 0;
    // Metodo para averiguar si el numero es primo o no
    private void esPrimo(int num) {
        Contador = 0;
        // For para trabajar
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                Contador++;
            }
        }
        // Condicion para ver si hay mas valores
        if (Contador <= 2) {
            JOptionPane.showMessageDialog(
                    null,
                    "El numero " + num + " es primo"
            );
            // El numero no es primo
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "El numero " + num + " no es primo"
            );
        }
    }
    // Pedir el nombre
    private int askNumber() {
        return Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese un numero para saber si es primo o no")
        );
    }
    // Correr el programa
    public void RunProgram() {
        do {
            esPrimo(askNumber());
        } while (JOptionPane.showConfirmDialog(null, "Desea ingresar otro numero? (S/N)")
                == JOptionPane.OK_OPTION);
    }
}
