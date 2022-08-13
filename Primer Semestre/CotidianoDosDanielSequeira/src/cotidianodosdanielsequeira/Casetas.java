/*
 *   Desarrolle un programa que procesa vehículos que circularían 
 *   en un peaje mientras el usuario lo desee. Para cada vehículo, 
 *   el programa debe leer: el tipo de vehículo(1,2,3,4), el número 
 *   de caseta (1, 2, ó 3) por donde circula el vehículo, y el monto 
 *   que paga el vehículo (este dato si gusta no lo lee y lo maneja 
 *   como una constante que guarda el monto que paga cada vehículo). 
 *   De acuerdo al tipo de vehículo leído y al monto leído, el programa 
 *   debe ir acumulando el total en colones de cada uno de los tipos de 
 *   vehículos. Los montos que paga cada uno de los vehículos están dado 
 *   por los siguientes datos, los cuales los debe manejar en constantes.
 *   MOTOS = ¢150
 *   LIVIANOS = ¢300
 *   PESADOS = ¢500
 *   MAS2TONELADAS = ¢600
 *   Utilizando la sentencia switch y de acuerdo al tipo de vehículo, debe 
 *   ir controlando y acumulando el total de cada uno de los tipos de 
 *   vehículos y también al finalizar la cantidad de vehículos debe
 *   reportar la cantidad de vehículos que circularon por cada una de 
 *   las casetas.
 */
package cotidianodosdanielsequeira;

import javax.swing.JOptionPane;

public class Casetas {

    // Constantes
    private final float precioMoto = 150, precioLiviano = 300,
            precioPesado = 500, precioToneladas = 600;
    // Contadores
    private int cont = 0, contCaceta1 = 0, contCaceta2 = 0, contCaceta3 = 0,
            contMoto = 0, contLiviano = 0, contPesado = 0, contTon = 0;
    // Ganancias, segun caceta, vehiculo y totales
    private float ganancia, gananciaMoto = 0, gananciaLiviano = 0, gananciaPesado = 0,
            gananciaTon = 0, ganancia1 = 0, ganancia2 = 0, ganancia3 = 0;
    // Aumentar la ganancia en cacetas
    private void Cacetas(int caceta, float ganancia) {
        switch (caceta) {
            case 1:
                ganancia1 += ganancia;
                contCaceta1++;
                break;
            case 2:
                ganancia2 += ganancia;
                contCaceta2++;
                break;
            case 3:
                ganancia3 += ganancia;
                contCaceta3++;
                break;
        }
    }
    // Aumentar ganancia en vehiculos
    private void Vehiculo(int vehiculo) {
        float ganancia = 0;
        switch (vehiculo) {
            case 1:
                ganancia = precioMoto;
                gananciaMoto += precioMoto;
                contMoto++;
                break;
            case 2:
                ganancia = precioLiviano;
                gananciaLiviano += precioLiviano;
                contLiviano++;
                break;
            case 3:
                ganancia = precioPesado;
                gananciaPesado += precioPesado;
                contPesado++;
                break;
            case 4:
                ganancia = precioToneladas;
                gananciaTon += precioToneladas;
                contTon++;
                break;
        }
        // LLamar metodo de cacetas
        Cacetas(
                Integer.parseInt(
                        JOptionPane.showInputDialog("Cual caceta va a usar? "
                                + "\n   1"
                                + "\n 2"
                                + "\n 3")
                ), ganancia);
    }
    // Enseñar resultados
    private void showResults() {
        // Obtener resultado final
        ganancia = ganancia1 + ganancia2 + ganancia3;
        JOptionPane.showMessageDialog(null,
                "El total de vehiculos pasados fue: " + cont
                + "\n El total de motos que pasaron fue: " + contMoto
                + "\n El total de livianos que pasaron fue: " + contLiviano
                + "\n El total de pesados que pasaron fue: " + contPesado
                + "\n El total de vehiculo por tonelada que pasaron fue: " + contTon
                + "\n El total de vehiculos que pasaron por la caceta 1 fue: " + contCaceta1
                + "\n El total de vehiculos que pasaron por la caceta 2 fue: " + contCaceta2
                + "\n El total de vehiculos que pasaron por la caceta 3 fue: " + contCaceta3
                + "\n El total de ganancias en la caceta uno fue: " + ganancia1
                + "\n El total de ganancias en la caceta Dos fue: " + ganancia2
                + "\n El total de ganancias en la caceta tres fue: " + ganancia3 
                + "\n El total de ganancias en motos fue: " + gananciaMoto 
                + "\n El total de ganancias en livianos fue: " + gananciaLiviano
                + "\n El total de ganancias en pesados fue: " + gananciaPesado
                + "\n El total de ganancias en toneladas fue: " + gananciaTon
                + "\n El total ganado fue: " + ganancia           
        );
    }
    // Metodo para correr el programa
    public void RunProgram() {
        do {
            cont++;
            int vehiculo = Integer.parseInt(
                    JOptionPane.showInputDialog("Que tipo de vehiculo va a ingresar?"
                            + "\n 1.    Moto" + precioMoto
                            + "\n 2.    Liviano" + precioLiviano
                            + "\n 3.    Pesado" + precioPesado
                            + "\n 4.    Toneladas " + precioToneladas)
            );
            Vehiculo(vehiculo);
        } while (JOptionPane.showConfirmDialog(null, "Desea ingresar otro dato? (S/N)")
                == JOptionPane.OK_OPTION);
        // Enseñar el resultado final
        showResults();
    }
}
