package cotidianocincodannysequeira;

import cotidianocincodannysequeira.procesos.ProcesoEjercicioDos;
import javax.swing.JOptionPane;

public class EjercicioDos {

    //  Variables globales
    private static final int N = 10; // tamaño del vector
    private static float vec[] = new float[N];  // Vector con un tamaño ya establecido

    // Metodo para agregar datos al vector
    private static void agregarDatos() {
        for (int i = 0; i < N; i++) {
            vec[i] = Float.parseFloat(JOptionPane.showInputDialog("Cual es el valor de la nota: " + (i + 1)));
        }
    }

    // Metodo para reportar los datos presentes en el vector
    private static void ReporteNotas() {
        String output = "Notas pertenecientes al vector:";

        for (int i = 0; i < N; i++) {
            output += "\nPosición " + (i + 1) + " Nota " + vec[i];
        }

        JOptionPane.showMessageDialog(null, output);
    }

    // Metodo para buscar una nota en alguna posición del vector
    private static void BuscarNota() {
        int busqueda = Integer.parseInt(JOptionPane.showInputDialog("Cual es numero del vector de la nota a buscar: (1 a 10)"));
        JOptionPane.showMessageDialog(null, "El numero almacenado en el indice: " + busqueda + " es: " + vec[busqueda - 1]);
    }

    // Metodo para cambiar el valor de una nota
    private static void CambiarValor() {
        // Posición del vector
        int posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "Cual es la posición del vector a cambiar?: (1 a 10)"));
        JOptionPane.showMessageDialog(null, "El valor a cambiar es: " + vec[posicion - 1]);
        // Desea el usuario cambiar el valor
        int cambiar = JOptionPane.showConfirmDialog(
                null,
                "Desea sustituir el valor " + vec[posicion - 1] + " por un nuevo valor?",
                "Cambiar?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );
        // Cambiamos el valor
        if (cambiar == JOptionPane.YES_OPTION) {
            float cambio = Float.parseFloat(JOptionPane.showInputDialog(null, "Cual es el nuevo valor?: "));
            vec[posicion - 1] = cambio;
        } else { // No cambiamos el valor
            JOptionPane.showMessageDialog(null, "No se realizó el cambio");
        }
    }

    // Metodo para reportar las notas aprobadas del vector
    private static void ReportarAprobadas() {
        String output = "Notas Aprobadas:";
        for (int i = 0; i < N; i++) {
            if (vec[i] >= 70) {
                output += "\n Posición " + (i + 1) + " Nota: " + vec[i];
            }
        }

        JOptionPane.showMessageDialog(null, output);
    }

    // Metodo para reportar las notas aplazadas del vector
    private static void ReportarAplazadas() {
        String output = "Notas Aplazadas:";
        for (int i = 0; i < N; i++) {
            if (vec[i] < 70 && vec[i] >= 50) {
                output += "\n Posición " + (i + 1) + " Nota: " + vec[i];
            }
        }

        JOptionPane.showMessageDialog(null, output);
    }

    // Metodo para reportar las notas reprobadas del vector
    private static void ReportarReprobadas() {
        String output = "Notas Reprobadas:";
        for (int i = 0; i < N; i++) {
            if (vec[i] < 50) {
                output += "\n Posición " + (i + 1) + " Nota: " + vec[i];
            }
        }

        JOptionPane.showMessageDialog(null, output);
    }

    // Metodo para mostrar un rango de datos
    private static void RangoDatos() {
        Boolean continuar = true;
        String output;
        // Ingresar bien los rangos
        do {
            int menor = Integer.parseInt(JOptionPane.showInputDialog("Cual es el rango menor a buscar? ( 1 a 10)"));
            int mayor = Integer.parseInt(JOptionPane.showInputDialog("Cual es el rango mayor a buscar? (1 a 10"));

            output = "Datos en el rango " + menor + " a " + mayor + "\n";
            // Fue el rango correctamente ingresado?
            if (menor <= 10 && menor >= 1 && mayor <= 10 && mayor >= 1 && menor < mayor) {
                for (int i = (menor - 1); i <= (mayor - 1); i++) {
                    output += "Posición " + (i + 1) + " valor " + vec[i] + "\n";
                }
                continuar = false;
            } else {
                // Corregir al usuario
                JOptionPane.showMessageDialog(null, "Ingrese bien el rango de datos! Recuerde que solo puede estar dentro de 1 a 10");
            }
        } while (continuar);
        // Mostrar rango de datos
        JOptionPane.showMessageDialog(null, output);
    }

    // Metodo para mostrar un menu principal
    public static void MenuPrincipal() {
        int op;
        do {
            // Cual operación realizamos?
            op = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Que desea realizar: "
                            + "\n1. Agregar Notas al Vector."
                            + "\n2. Reportar todas las notas almacenadas en el Vector."
                            + "\n3. Consultar o Buscar una Nota en el Vector."
                            + "\n4. Modificar una Nota almacenada en el Vector."
                            + "\n5. Reportar Estadísticas."
                            + "\n6. Reportar las Notas Aprobadas almacenadas en el Vector."
                            + "\n7. Reportar las Notas Aplazadas almacenadas en el Vector."
                            + "\n8. Reportar las Notas Reprobadas almacenadas en el Vector."
                            + "\n9. Reportar todas las Notas que están entre un rango de Notas dado por el Usuario."
                            + "\n10. Salir."
                    )
            );

            // Procesos a realizar
            switch (op) {
                case 1:
                    agregarDatos();
                    break;
                case 2:
                    ReporteNotas();
                    break;
                case 3:
                    BuscarNota();
                    break;
                case 4:
                    CambiarValor();
                    break;
                case 5:
                    ProcesoEjercicioDos.ReportarNotas(vec, N);
                    break;
                case 6:
                    ReportarAprobadas();
                    break;
                case 7:
                    ReportarAplazadas();
                    break;
                case 8:
                    ReportarReprobadas();
                    break;
                case 9:
                    RangoDatos();
                    break;
                case 10:
                    JOptionPane.showMessageDialog(null, "Que tenga un lindo dia!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no está disponible");
                    break;
            }
            // Seguimos el programa?
        } while (op != 10);
    }
}
