/*
* Desarrolle un programa que procesa por medio del ciclo while 
* las notas de los N estudiantes en una materia. Para cada estudiante, 
* el programa debe leer la nota y el programa tiene que reportar la condición
* del estudiante de acuerdo a la nota leída.
*   •Si la nota es mayor o igual a 70 la condición es aprobado.
*   •Si la nota es mayor o igual a 60 y menor que 70 la condición es aplazado.
*   •Si la nota es menor que 60 la condición es reprobado.
* Al finalizar el procesamiento de los 8 estudiantes, el programa tiene 
* que calcular y reportar el promedio final de todos los estudiantes, 
* así también el promedio de notas aprobadas, promedio de notas aplazadas y 
* promedio de notas reprobadas.
 */
package trabajocotidianouno;

import javax.swing.JOptionPane;

public class WhilePromedios {
// Metodo para enseñar distintos mensajes finales
    private void showFinalMessage(int types, int notes, float prom) {
        switch (types) {
            // Total de notas
            case 1:
                JOptionPane.showMessageDialog(null, ""
                        + "El total de notas ingresadas es: " + notes + "\n"
                        + "El promedio total entre las notas es: " + prom);
                break;
                // Notas aplazadas
            case 2:
                JOptionPane.showMessageDialog(
                        null,
                        "El total de notas aprobadas es: " + notes + "\n"
                        + "El promedio final de las notas aprobadas es: " + prom
                );
                break;
                // Notas Reprobadas
            case 3: 
                JOptionPane.showMessageDialog(
                        null,
                        "El total de notas aplazadas es: " + notes + "\n"
                        + "El promedio final de las notas aplazadas es: " + prom
                );
                break;
                // Notas reprobadas
            default:
                JOptionPane.showMessageDialog(
                        null,
                        "El total de notas reprobadas es: " + notes + "\n"
                        + "El promedio final de las notas reprobadas es: " + prom
                );
                break;
        }
    }
    // Metodo para obtener promedios
    private float proms(int contador, float acumulador) {
        // Caso contador sea cero
        if (contador != 0) {
            return acumulador / contador;
        } else {
            return 0;
        }

    }
    // Metodo principal de la clase
    public void RunProgram() {
        // Variables
        int cantNotas = Integer.parseInt(
                JOptionPane.showInputDialog(
                        null,
                        "Ingrese la cantidad de notas a ingresar"
                )
        );
        // Acumuladors, contadores y auxiliar while
        float acum = 0, acumApro = 0, acumRepro = 0, acumApla = 0,
                prom, promApro, promRepro, promApla;
        int i = 1, contApro = 0, contRepro = 0, contApla = 0;
        // While que corra el programa
        while (i <= cantNotas) {
            // Obtener nota
            int notes = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            null,
                            "Ingrese una nota: "
                    ));
            // Comparar notas
            if (notes >= 70) {
                acumApro += notes;
                contApro++;
            } else if (notes < 70 && notes >= 60) {
                acumApla += notes;
                contApla++;
            } else {
                contRepro++;
                acumRepro +=notes;
            }
            acum += notes;

            i++;
        }
        // Averiguar promedios
        prom = proms(cantNotas, acum);
        promApla = proms(contApla, acumApla);
        promApro = proms(contApro, acumApro);
        promRepro = proms(contRepro, acumRepro);
        // Mensajes finales, mostrar resultados.
        showFinalMessage(1, cantNotas, prom);
        showFinalMessage(2, contApro, promApro);
        showFinalMessage(3, contApla, contApla);
        showFinalMessage(4, contRepro, promRepro);
        
    }
}
