package paquete;

import javax.swing.JOptionPane;

public class ControlNumeros {

    // Funcion para encontrar el mayor de tres numeros
    public int mayor(int n1, int n2, int n3) {
        return (n1 > n2 && n1 > n3) ? n1
                : (n2 > n1 && n2 > n3) ? n2
                        : (n3 > n1 && n3 > n1) ? n3
                                : 0;
    }

    // Funcion para encontrar el menor de tres numeros
    public int menor(int n1, int n2, int n3) {
        return (n1 < n2 && n1 < n3) ? n1
                : (n2 < n1 && n2 < n3) ? n2
                        : (n3 < n1 && n3 < n1) ? n3
                                : 0;
    }

    // Funcion Para encontrar el tipo de triangulo
    public void TriangleType(int n1, int n2, int n3) {
        if (n1 == n2 && n1 == n3) {
            JOptionPane.showMessageDialog(null, "El triangulo es equilatero");
        } else if (n1 == n2 || n1 == n3 || n2 == n3) {
            JOptionPane.showMessageDialog(null, "El triangulo es escaleno");
        } else {
            JOptionPane.showMessageDialog(null, "El triangulo es isoceles");
        }
    }
}
