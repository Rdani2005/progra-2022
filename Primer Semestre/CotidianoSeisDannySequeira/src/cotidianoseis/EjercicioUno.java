package cotidianoseis;

import cotidianoseis.operaciones.OperacionesUno;
import javax.swing.JOptionPane;

public class EjercicioUno {

    OperacionesUno funciones = new OperacionesUno();
    private final int Tamano = 5;
    private final int matriz[][] = new int[Tamano][Tamano];

    // Metodo para agregar datos a la matriz
    private void AgregarDatos() {
        // Recorrer la matriz
        for (int i = 0; i < Tamano; i++) {
            for (int j = 0; j < Tamano; j++) {
                // Agregar datos a la matriz
                matriz[i][j] = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Ingrese el valor perteneciente a la fila: " + (i + 1) + " columna: " + (j + 1)
                        ));
            }
        }
    }

    // Metodo para reportar datos de la matriz
    private void ReportarDatos() {
        String output = "Contenido de la matriz:\n";
        // Recorrer la matriz
        for (int i = 0; i < Tamano; i++) {
            for (int j = 0; j < Tamano; j++) {
                output += "\t[ " + matriz[i][j] + " ]"; // Agregar numeros de la matriz
            }
            output += "\n";
        }
        // Enseñar resultados
        JOptionPane.showMessageDialog(null, output);
    }

    // Consultar un dato de la matriz
    private void ConsultarDato() {
        int fila, columna;
        do {
            fila = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la fila a consultar (1 y " + Tamano + ")"));
            columna = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la columna a consultar (1 y " + Tamano + ")"));
            if (fila > Tamano || fila <= 0 || columna > Tamano || columna < 1 || columna > Tamano) {
                JOptionPane.showMessageDialog(null, "Solo numeros entre (1 y " + Tamano + ")");
            }
        } while (fila > Tamano || fila < 1 || columna > Tamano || columna < 1 || columna > Tamano);
        JOptionPane.showMessageDialog(null, "EL numero encontrado es: " + matriz[(fila - 1)][(columna - 1)]);
    }

    // Modificar un dato de la matriz
    private void ModificarDato() {
        int fila, columna;
        do {
            fila = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la fila a consultar (1 y " + Tamano + ")"));
            columna = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la columna a consultar (1 y " + Tamano + ")"));
            if (fila > Tamano || fila <= 0 || columna > Tamano || columna < 1 || columna > Tamano) {
                JOptionPane.showMessageDialog(null, "Solo numeros entre (1 y " + Tamano + ")");
            }
        } while (fila > Tamano || fila < 1 || columna > Tamano || columna < 1 || columna > Tamano);
        
        if (JOptionPane.showConfirmDialog(null, "Desea cambiar el valor " + matriz[fila - 1][columna - 1] + " por un nuevo valor?") == JOptionPane.YES_OPTION) {
            matriz[fila - 1][columna - 1] = Integer.parseInt(JOptionPane.showInputDialog("Cual es el nuevo valor?"));
            JOptionPane.showMessageDialog(null, "Valor cambiado");
        } else {
            JOptionPane.showMessageDialog(null, "No cambiaremos el valor");
        }
    }

    // Enseñar datos pares de la matriz
    private void Pares() {
        String output = "Datos pares de la matriz\n";
        for (int i = 0; i < Tamano; i++) {
            for (int j = 0; j < Tamano; j++) {
                if (matriz[i][j] % 2 == 0) {
                    output += "\t [ " + matriz[i][j] + " ] "; // Agregar numeros de la matriz
                } else {
                    output += "\t[ \t  ]";
                }
            }
            output += "\n";
        }
        
        JOptionPane.showMessageDialog(null, output);
        
    }

    //Enseñar datos impares de la matriz
    private void Impares() {
        String output = "Datos impares de la matriz\n";
        for (int i = 0; i < Tamano; i++) {
            for (int j = 0; j < Tamano; j++) {
                if (matriz[i][j] % 2 != 0) {
                    output += "\t [ " + matriz[i][j] + " ] "; // Agregar numeros de la matriz
                } else {
                    output += "\t[ \t  ]";
                }
            }
            output += "\n";
        }
        
        JOptionPane.showMessageDialog(null, output);
    }

    // Reporte de estadisticas
    private void Estadisticas() {
        JOptionPane.showMessageDialog(
                null,
                "Estadisticas de la matriz: "
                + "\nPromedio de todos los elementos de la matriz: " + funciones.promedio(matriz, Tamano)
                + "\nPromedio de los elementos pares de la matriz " + funciones.promPar(matriz, Tamano)
                + "\nPromedio de todos los elementos impares de la matriz " + funciones.promImpar(matriz, Tamano)
                + "\nNumero maximo de la matriz " + funciones.max(matriz, Tamano)
                + "\nNumero minimo de la matriz " + funciones.min(matriz, Tamano)
                + "\nPromedio diagonal izquierda de la matriz " + funciones.promIzquierda(matriz, Tamano)
                + "\nPromedio diagonal derecha de la matriz " + funciones.promDerecha(matriz, Tamano)
        );
    }

    // Enseñar datos pedidos por el usuario
    private void MinMax() {
        String output = "Numeros minimos y maximos \n";
        int minF = Integer.parseInt(JOptionPane.showInputDialog("Cual es la fila minima a buscar?"));
        int maxF = Integer.parseInt(JOptionPane.showInputDialog("Cual es la fila maxima a buscar?"));
        
        int minC = Integer.parseInt(JOptionPane.showInputDialog("Cual es la culumna minima a buscar?"));
        int maxC = Integer.parseInt(JOptionPane.showInputDialog("Cual es la culumna maxima a buscar?"));
        
        for (int i = minF; i <= maxF; i++) {
            for (int j = minC; j <= maxC; j++) {
                output += " [ " + matriz[i - 1][j - 1] + " ] ";
            }
            output += "\n";
        }
        
        JOptionPane.showMessageDialog(null, output);
    }

    // Copiar matriz con pares
    private void CopyPares() {
        String output = "Matriz Original: \n";
        for (int i = 0; i < Tamano; i++) {
            for (int j = 0; j < Tamano; j++) {
                output += "\t [ " + matriz[i][j] + " ] "; // Agregar numeros de la matriz
            }
            output += "\n";
        }
        
        output += "\n\n\nCopia de matriz con numeros pares: \n";
        for (int i = 0; i < Tamano; i++) {
            for (int j = 0; j < Tamano; j++) {
                if (matriz[i][j] % 2 == 0) {
                    output += "\t [ " + matriz[i][j] + " ] "; // Agregar numeros de la matriz
                } else {
                    output += "\t[ \t  ]";
                }
            }
            output += "\n";
        }
        
        JOptionPane.showMessageDialog(null, output);
        
    }

    // Copiar matriz con datos impares
    private void CopyImpares() {
        String output = "Matriz Original: \n";
        for (int i = 0; i < Tamano; i++) {
            for (int j = 0; j < Tamano; j++) {
                output += "\t [ " + matriz[i][j] + " ] "; // Agregar numeros de la matriz
            }
            output += "\n";
        }
        
        output += "\n\n\nCopia de matriz con numeros impares: \n";
        for (int i = 0; i < Tamano; i++) {
            for (int j = 0; j < Tamano; j++) {
                if (matriz[i][j] % 2 != 0) {
                    output += "\t [ " + matriz[i][j] + " ] "; // Agregar numeros de la matriz
                } else {
                    output += "\t[ \t  ]";
                }
            }
            output += "\n";
        }
        
        JOptionPane.showMessageDialog(null, output);
        
    }
    
    public void MenuPrincipal() {
        
        int op;
        do {
            op = funciones.operaciones();
            switch (op) {
                case 1:
                    AgregarDatos();
                    break;
                case 2:
                    ReportarDatos();
                    break;
                case 3:
                    ConsultarDato();
                    break;
                case 4:
                    ModificarDato();
                    break;
                case 5:
                    Pares();
                    break;
                case 6:
                    Impares();
                    break;
                case 7:
                    Estadisticas();
                    break;
                case 8:
                    MinMax();
                    break;
                case 9:
                    CopyPares();
                    break;
                case 10:
                    CopyImpares();
                    break;
                case 11:
                    JOptionPane.showMessageDialog(null, "Un gusto saludarlo!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }
        } while (op != 11);
        
    }
}
