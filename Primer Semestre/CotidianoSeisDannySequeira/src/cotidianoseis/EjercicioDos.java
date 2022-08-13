package cotidianoseis;

import cotidianoseis.operaciones.OperacionesDos;
import java.util.Random;
import javax.swing.JOptionPane;

public class EjercicioDos {

    OperacionesDos funciones = new OperacionesDos();

    private final int tamano = 3;

    Random rd = new Random();

    float notas[][] = new float[tamano][tamano];

    // Agregar datos por usuario
    private void DatosUsuario() {
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                notas[i][j] = Float.parseFloat(
                        JOptionPane.showInputDialog("Ingrese la nota de la fila " + (i + 1) + " columna " + (j + 1))
                );
            }
        }
    }

    // Añadir datos aleatorios a la matriz
    private void DatosAleatorios() {
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                boolean noEncontrado;
                float num;
                do {
                    num = (float) (rd.nextFloat() * 100 + 1);
                    noEncontrado = funciones.Aleatorios(notas, tamano, num);
                } while (noEncontrado);
                notas[i][j] = num;
            }
        }

        JOptionPane.showMessageDialog(null, "Datos aleatorios agregados correctamente");
    }

    // Enseñar datos de la matriz
    private void EnseñarMatriz() {
        String output = "Notas de estudiantes:\n";

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                output += " [ " + notas[i][j] + " ] ";
            }
            output += "\n";
        }
        JOptionPane.showMessageDialog(null, output);
    }

    // Consultar un dato en especifico de la matriz
    private void Consultar() {
        int fila;
        int col;

        do {
            fila = Integer.parseInt(JOptionPane.showInputDialog("Cual es la fila a consultar?"));
            col = Integer.parseInt(JOptionPane.showInputDialog("Cual es la columna a consultar?"));

            if (col < 1 || col > tamano || fila < 1 || fila > tamano) {
                JOptionPane.showMessageDialog(null, "Solo numeros entre 1 y " + tamano);
            }

        } while (col < 1 || col > tamano || fila < 1 || fila > tamano);

        JOptionPane.showMessageDialog(null, "La nota consultada es: " + notas[fila - 1][col - 1]);
    }

    // Modificar un dato especifico de la matriz
    private void Modificar() {
        int fila, columna;
        do {
            fila = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la fila a consultar (1 y " + tamano + ")"));
            columna = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la columna a consultar (1 y " + tamano + ")"));
            if (fila > tamano || fila <= 0 || columna > tamano || columna < 1 || columna > tamano) {
                JOptionPane.showMessageDialog(null, "Solo numeros entre (1 y " + tamano + ")");
            }
        } while (fila > tamano || fila < 1 || columna > tamano || columna < 1 || columna > tamano);

        if (JOptionPane.showConfirmDialog(null, "Desea cambiar el valor " + notas[fila - 1][columna - 1] + " por un nuevo valor?") == JOptionPane.YES_OPTION) {
            notas[fila - 1][columna - 1] = Integer.parseInt(JOptionPane.showInputDialog("Cual es el nuevo valor?"));
            JOptionPane.showMessageDialog(null, "Valor cambiado");
        } else {
            JOptionPane.showMessageDialog(null, "No cambiaremos el valor");
        }
    }

    // Enseñar estadisticas (Operaciones Dos)
    private void Estadisticas() {
        JOptionPane.showMessageDialog(null,
                    "Promedio de Notas: " + funciones.prom(notas, tamano) +
                            "\nPromedio de Notas Aprobadas " + funciones.promApro(notas, tamano) +
                            "\nPromedio de notas Aplazadas " + funciones.promApla(notas, tamano) +
                            "\nPromedio de notas Reprobadas " + funciones.promRepro(notas, tamano) +
                            "\nNota Mayor: " + funciones.mayor(notas, tamano) +
                            "\nNota menor: " + funciones.menor(notas, tamano) +
                            "\nPromedio diagonal izquierda " + funciones.promIzquierda(notas, tamano) + 
                            "\nPromedio diagonal derecha " + funciones.promDerecha(notas, tamano)
                
                );
    }

    // Rango de notas dadas por el usuario
    private void Rango() {
        float menor = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota menor a enseñar"));
        float mayor = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota mayor a buscar"));

        String output = "Notas encontradas!\n";
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                output += (notas[i][j] >= menor && notas[i][j] <= mayor)
                        ? "Fila " + (i + 1) + " columna " + (j + 1) + " nota: " + notas[i][j] + "\n"
                        : "";
            }
        }

        JOptionPane.showMessageDialog(null, output);

    }

    // Diagonal Izquierda
    private void Izquierda() {
        String output = "Notas en la diagonal izquierda\n";
        for (int i = 0; i < tamano; i++) {
            output += "Nota: " + notas[i][i] + "\n";
        }
        JOptionPane.showMessageDialog(null, output);
    }

    // Diagonal Derecha
    private void Derecha() {
        String output = "Notas en la diagonal derecha\n";
        int aux = tamano - 1;
        for (int i = 0; i < tamano; i++) {
            output += "Nota: " + notas[i][aux] + "\n";
            aux--;
        }
        JOptionPane.showMessageDialog(null, output);
    }

    //Copia Aprobadas
    private void CopyApro() {
        String output = "Notas de estudiantes:\n";

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                output += " [ " + notas[i][j] + " ] ";
            }
            output += "\n";
        }
        output += "\n\nNotas Aprobadas!\n";
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                output += (notas[i][j] >= 70) ? " [ " + notas[i][j] + " ] " : "";
            }
            output += "\n";
        }

        JOptionPane.showMessageDialog(null, output);
    }

    // Copia Aplazadas
    private void CopyApla() {
        String output = "Notas de estudiantes:\n";

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                output += " [ " + notas[i][j] + " ] ";
            }
            output += "\n";
        }
        output += "\n\nNotas Aplazadas!\n";
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                output += (notas[i][j] >= 50 && notas[i][j] < 70) ? " [ " + notas[i][j] + " ] " : "";
            }
            output += "\n";
        }

        JOptionPane.showMessageDialog(null, output);
    }

    // Copia Reprobadas
    private void CopyRepro() {
        String output = "Notas de estudiantes:\n";

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                output += " [ " + notas[i][j] + " ] ";
            }
            output += "\n";
        }
        output += "\n\nNotas Reprobadas!\n";
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                output += (notas[i][j] < 50) ? " [ " + notas[i][j] + " ] " : "";
            }
            output += "\n";
        }

        JOptionPane.showMessageDialog(null, output);
    }

    // Enseñar menu principal
    public void Principal() {
        int op;
        do {
            op = funciones.Operaciones();
            switch (op) {
                case 1:
                    DatosUsuario();
                    break;
                case 2:
                    DatosAleatorios();
                    break;
                case 3:
                    EnseñarMatriz();
                    break;
                case 4:
                    Consultar();
                    break;
                case 5:
                    Modificar();
                    break;
                case 6:
                    Estadisticas();
                    break;
                case 7:
                    Rango();
                    break;
                case 8:
                    Izquierda();
                    break;
                case 9:
                    Derecha();
                    break;
                case 10:
                    CopyApro();
                    break;
                case 11:
                    CopyApla();
                    break;
                case 12:
                    CopyRepro();
                    break;
                case 13:
                    JOptionPane.showMessageDialog(null, "Volviendo al menu principal");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ERROR!!!! \nSolo datos entre 1 y 13");
                    break;
            }
        } while (op != 13);
    }

}
