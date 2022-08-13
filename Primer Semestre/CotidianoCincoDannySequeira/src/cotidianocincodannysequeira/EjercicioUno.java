package cotidianocincodannysequeira;

import cotidianocincodannysequeira.procesos.ProcesoEjercicioUno;
import javax.swing.JOptionPane;

public class EjercicioUno {

    private static final int TamañoVector = 10;
    private static final int vec[] = new int[TamañoVector];

    // Agregar datos al vector
    private static void AgregarDatos() {
        for (int i = 0; i < TamañoVector; i++) {
            vec[i] = Integer.parseInt(
                    JOptionPane.showInputDialog("Cual es el numero a agregar en la posición " + (i + 1))
            );
        }
    }

    // Consultar datos del vector
    private static void datosVec() {
        String output = "Datos del vector:\n";
        for (int i = 0; i < TamañoVector; i++) {
            output += "pocision " + (i + 1) + " valor " + vec[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, output);
    }

    // Consultar algún dato del vector
    private static void ConsultarDato() {
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Cual es el dato a consultar en el vector? (de 1 a 10)"));
        JOptionPane.showMessageDialog(null, "El valor del dato solicitado en la posición: " + dato + " es: " + vec[dato - 1]);
    }

    // Modificar algun dato del vector
    private static void ModificarDato() {
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Cual es el dato a modificar en el vector? (de 1 a 10)"));

        // Desea el usuario cambiar el valor
        int cambiar = JOptionPane.showConfirmDialog(
                null,
                "Desea sustituir el valor " + vec[dato - 1] + " por un nuevo valor?",
                "Cambiar?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );

        if (cambiar == JOptionPane.YES_OPTION) { // Cambiamos el dato
            vec[dato - 1] = Integer.parseInt(JOptionPane.showInputDialog("Cual es el nuevo valor?"));
            JOptionPane.showMessageDialog(null, "El dato ha sido modificado!");
        } else { // No cambiamos el dato
            JOptionPane.showMessageDialog(null, "No se realizó el cambio");
        }

    }

    // Buscar datos pares del vector
    private static void DatosPares() {
        String output = "Datos pares del vector:\n";

        for (int i = 0; i < TamañoVector; i++) {
            if (vec[i] % 2 == 0) {
                output += "posición: " + (i + 1) + " dato: " + vec[i] + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, output);

    }

    // Buscar datos impares del vector
    private static void DatosImpares() {
        String output = "Datos impares del vector:\n";

        for (int i = 0; i < TamañoVector; i++) {
            if (!(vec[i] % 2 == 0)) {
                output += "posición: " + (i + 1) + " dato: " + vec[i] + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, output);

    }

    // Buscar datos en un rango especifico del vector
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

    public static void Principal() {
        int op;
        do {
            // Cual operación realizamos?
            op = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Que desea realizar: "
                            + "\n1. Agregar datos al Vector."
                            + "\n2. Consultar datos del Vector"
                            + "\n3. Consultar un dato del Vector"
                            + "\n4. Modificar un dato del Vector"
                            + "\n5. Reportar los números pares del vector"
                            + "\n6. Reportar los números impares del vector"
                            + "\n7. Reportar Estadísticas"
                            + "\n8. Reportar los datos del Vector en un rango dado por el usuario"
                            + "\n9. Salir"
                    )
            );

            // Procesos a realizar
            switch (op) {
                case 1:
                    AgregarDatos();
                    break;
                case 2:
                    datosVec();
                    break;
                case 3:
                    ConsultarDato();
                    break;
                case 4:
                    ModificarDato();
                    break;
                case 5:
                    DatosPares();
                    break;
                case 6:
                    DatosImpares();
                    break;
                case 7:
                    // Reporte de estadisticas llamando archivo externo
                    ProcesoEjercicioUno.Estadisticas(vec, TamañoVector);
                    break;
                case 8:
                    RangoDatos();
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Que tenga un lindo dia!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no está disponible");
                    break;
            }
            // Seguimos el programa?
        } while (op != 9);
    }
}
