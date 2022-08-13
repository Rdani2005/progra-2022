
package cotidianodosdanielsequeira;

import javax.swing.JOptionPane;

/**
 *
 * @author Rdani2005
 */
public class Factoriales {
        // Metodo para obtener el factorial, mediante recursividad.
    private int Factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * Factorial(num - 1);
        }
    }
    // Metodo para pedir y mostrar en pantalla la informacion al usuario
    private void information() {
        // Pedir valores
        int num = Integer.parseInt(
                JOptionPane.showInputDialog(
                        null,
                        "Introduce el numero a darle el factorial"
                ));
        // Mostrar factorial
        JOptionPane.showMessageDialog(
                null,
                "El factorial del numero " + num + " es " + Factorial(num)
        );
    }
    // Metodo para correr el programa en un ciclo do while, 
    // hasta que el usuario quiera detenerse
    public void RunProgram() {
        do {
            information();
        } while (JOptionPane.showConfirmDialog(null, "Desea ingresar obtener otro factorial? (S/N)")
                == JOptionPane.OK_OPTION);
    }
}
