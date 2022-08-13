/*
* Desarrolle un programa que lee tres números enteros. 
* El programa debe determinar y reportar el número mayor, 
* así como el número menor de los 3 números leídos.
 */
package trabajocotidianouno;

import javax.swing.JOptionPane;

public class NumerosEnteros {

    public void StartNumEnteros() {
        // Obtener numeros
        int num1 = LeerNum(),
                num2 = LeerNum(),
                num3 = LeerNum();
        // Comparar numeros mayores
        if (num1 > num2 && num1 > num3) {
            esMayor(num1);
        } else if (num2 > num1 && num2 > num3) {
            esMayor(num2);
        } else if (num3 > num1 && num3 > num2) {
            esMayor(num3);
        } else {
            sinCondicion(1);
        }
        // Comparar numeros menores
        if (num1 < num2 && num1 < num3) {
            esMenor(num1);
        } else if (num2 < num1 && num2 < num3) {
            esMenor(num2);
        } else if (num3 < num1 && num3 < num2) {
            esMenor(num3);
        } else {
            sinCondicion(4);
        }

    }

    // Metodo para indicar el numero mayor
    private void esMayor(int num) {
        JOptionPane.showMessageDialog(null, "El numero mayor es: " + num);
    }

    // Metodo que indique que no hay mayor o menor, dependiendo del caso
    private void sinCondicion(int option) {

        if (option == 1) {
            JOptionPane.showMessageDialog(null, "No hay numero mayor!");
        } else {
            JOptionPane.showMessageDialog(null, "No hay numero menor!");

        }

    }

    // Mostrar mensaje de es menor
    private void esMenor(int num) {
        JOptionPane.showMessageDialog(null, "El numero menor es: " + num);
    }

    // Metodo para leer numeros
    private int LeerNum() {
        int num = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese un numero")
        );
        return num;
    }

}
