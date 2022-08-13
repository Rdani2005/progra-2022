/*
* Desarrolle un programa que lee tres números enteros. 
* El programa debe determinar y reportar el tipo de triangulo, 
* escaleno (todos los lados diferentes), isosceles, y equilatero 
* (lados iguales)
 */
package trabajocotidianouno;

import javax.swing.JOptionPane;

public class Triangulo {
    // Metodo principal
    public void VerTriangulo() {
        // Leer Numeros
        int num1 = LeerNum(), num2 = LeerNum(), num3 = LeerNum();
        // Comparar tipos de triangulos
        if (num1 == num2 && num1 == num3) {
            JOptionPane.showMessageDialog(null, "El triangulo es equilatero");
        } else if (num1 != num2 && num1 != num3) {
            JOptionPane.showMessageDialog(null, "El triangulo es escaleno");
        } else {
            JOptionPane.showMessageDialog(null, "El triangulo es isosceles");
        }

    }

    // Metodo para leer numeros
    private int LeerNum() {
        int num = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese un numero")
        );
        return num;
    }
}
