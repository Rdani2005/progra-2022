package cotidianocuatrodannysequeira.ejerciciodos;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
/**
 * @ Cuarto Trabajo Cotidiano
 * @ EjercicioDos
 * @Date: 4/4/2022
 * @Copyright: 2022 Danny Sequeira All rights reserved.
 */
public class EjercicioDos {
    // ------------------------------ Variables ----------------------------
    // Constantes
    private final float PRECIO_MOTOS = 200;
    private final float PRECIO_LIVIANOS = 600;
    private final float PRECIO_MEDIANOS = 900;
    private final float PRECIO_PESADOS = 1200;
    // Contadores
    private int contMoto = 0, contLiv = 0, contMed = 0, contPes = 0, contCas1 = 0, contCas2 = 0, contCas3 = 0;
    // acumuladores
    private float acumMoto = 0, acumLiv = 0, acumMed = 0, acumPes = 0, acum1 = 0, acum2 = 0, acum3 = 0;
    // Declaracion lista de objetos de tipo clase vehiculo
    List<Vehiculo> listaVehiculos = new ArrayList<>();
    // Booleanos
    boolean shouldContinue = true;
    // --------------------- Funciones --------------------------------------------------
    // Retorna la caceta usada
    private int Caseta() {
        String[] buttons = {"caseta 1", "caseta 2", "caseta 3"};
        return JOptionPane.showOptionDialog(
                null,
                "Cual es la caseta?",
                "Nivel",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                buttons,
                buttons[0]);

    }
    // Retorna el tipo de vehiculo
    private int tipo() {
        String[] buttons = {"moto", "liviano", "mediano", "pesado (+2 toneladas)"};
        int tipoVehiculo = JOptionPane.showOptionDialog(
                null,
                "Cual el tipo de vehiculo?",
                "Nivel",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                buttons,
                buttons[0]);
        float total;
        if (tipoVehiculo == 0) {
            total = PRECIO_MOTOS;
        } else if (tipoVehiculo == 1) {
            total = PRECIO_LIVIANOS;
        } else if (tipoVehiculo == 2) {
            total = PRECIO_MEDIANOS;
        } else {
            total = PRECIO_PESADOS;
        }

        JOptionPane.showMessageDialog(null, "Total a pagar: " + total);
        float pago = Float.parseFloat(JOptionPane.showInputDialog("Digite el monto pagado"));
        JOptionPane.showMessageDialog(null, "El vuelto a entregar: " + (pago - total));

        return tipoVehiculo;
    }

    // Obtener el monto pagado por vehiculo
    private float ObtenerVehiculo(Vehiculo vehiculo) {
        return (vehiculo.getTipo() == 0) ? PRECIO_MOTOS : ((vehiculo.getTipo() == 1) ? PRECIO_LIVIANOS : ((vehiculo.getTipo() == 2) ? PRECIO_MEDIANOS : PRECIO_PESADOS));
    }
    // ---------------------- Metodos --------------------------------------------
    // Sumar objetos a la lista de vehiculos
    private void AgregarVehiculos() {
        do {
            listaVehiculos.add(new Vehiculo(tipo(), Caseta()));
        } while (JOptionPane.showConfirmDialog(null, "Desea ver insertar otro vehiculo? (S/N)") == JOptionPane.OK_OPTION);
    }
    // Reportar datos sobre los distintos tipos de vehiculos
    private void ReporteTotalVehiculos() {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getTipo() == 0) {
                contMoto++;
                acumMoto += PRECIO_MOTOS;
            } else if (vehiculo.getTipo() == 1) {
                contLiv++;
                acumLiv += PRECIO_LIVIANOS;
            } else if (vehiculo.getTipo() == 2) {
                contMed++;
                acumMed += PRECIO_MEDIANOS;
            } else {
                contPes++;
                acumPes += PRECIO_PESADOS;
            }
        }
        float total = acumLiv + acumMoto + acumMed + acumPes;
        JOptionPane.showMessageDialog(
                null,
                "Motos ingresadas: " + contMoto +
                        "\nvehiculos livianos ingresados: " + contLiv +
                        "\nvehiculos medianos ingresados: " + contMed +
                        "\nvehiculos pesados ingresados: " + contPes +
                        "\n\n\nTotal ganado: " + total +
                        "\nTotal ganado por motos: " + acumMoto +
                        "\nTotal ganado por vehiculos livianos: " + acumLiv +
                        "\nTotal ganado por vehiculos medianos: " + acumMed +
                        "\nTotal ganado por vehiculos pesados: " + acumPes

        );
    }

    // Reporte de datos de las cacetas
    private void ReporteTotalCacetas() {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getCaseta() == 0) {
                contCas1++;
                acum1 += ObtenerVehiculo(vehiculo);
            } else if (vehiculo.getCaseta() == 1) {
                contCas2++;
                acum2 += ObtenerVehiculo(vehiculo);
            } else {
                contCas3++;
                acum3 = ObtenerVehiculo(vehiculo);
            }


        }
        JOptionPane.showMessageDialog(
                null,
                "Vehiculos ingresados en caseta 1: " + contCas1 +
                        "\nvehiculos ingresados en caseta 2: " + contCas2 +
                        "\nvehiculos ingresados en caseta 3: " + contCas3 +
                        "\n\n\n\nTotal ganado en caseta 1: " + acum1 +
                        "\nTotal ganado en caseta 2: " + acum2 +
                        "\nTotal ganado en caseta 3: " + acum3

        );

    }
    // Que operacion realizamos?
    private void Desiciones(int op) {
        switch (op) {
            case 1:
                AgregarVehiculos();
                break;
            case 2:
                ReporteTotalVehiculos();
                break;
            case 3:
                ReporteTotalCacetas();
                break;
            case 4:
                shouldContinue = false;
                break;
        }
    }
    // Que operacion desea realizar el usuario?
    public void Principal() {
        do {
            int op = Integer.parseInt(
                    JOptionPane.showInputDialog("Que operacion va a realizar:" +
                            "\n1.   Leer vehiculos" +
                            "\n2.   Reportar datos de los vehiculos" +
                            "\n3.   Reportar datos de las cacetas" +
                            "\n4.   Salir")
            );

            Desiciones(op);
        } while (shouldContinue);
    }
}
