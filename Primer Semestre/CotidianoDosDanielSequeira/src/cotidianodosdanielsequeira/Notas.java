/*
*   Desarrolle un programa en Java que procesa las notas de 
*   los estudiantes en una materia X cualesquiera mientras 
*   grupo en el que está el estudiante que puede ser 1, 2 ó 3.
*   el usuario lo desee. Para cada estudiante, el programa debe 
*   leer la nota y el Al finalizar el procesamiento de todos los 
*   estudiantes, el programa tiene que calcular y reportar el
*   promedio de notas de todos los estudiantes, así también debe 
*   calcular y reportar el promedio de notas de los estudiantes 
*   del grupo 1, promedio de notas de los estudiantes del grupo 2 
*   y el promedio de notas de los estudiantes del grupo 3.
 */
package cotidianodosdanielsequeira;

import javax.swing.JOptionPane;

public class Notas {
    // Contadores
    private int contUno = 0, contDos = 0, contTres = 0;
    // Acumuladores
    private float acum = 0, acumUno = 0, acumDos = 0, acumTres = 0,
            prom, promUno, promDos, promTres;    
    // Actualizar los contadores
    private void UsarAcumuladores(int grupo, float nota) {
        switch(grupo) {
            case 1:
                contUno++;
                acumUno += nota;
                break;
            case 2: 
                contDos++;
                acumDos += nota;
                break;
            case 3:
                contTres++;
                acumTres += nota;
                break;
        }
    }
    // Obtener el grupo al que pertenece el estudiante
    private int Grupo() {
        return Integer.parseInt(
                JOptionPane.showInputDialog("Cual es el grupo del usuario")
        );
    }
    // Obtener el promedio del estudiante
    private float ObtenerPromedio() {
        return Float.parseFloat(
                JOptionPane.showInputDialog("Cual es la nota del usuario?")
        );
    }
    // Sacar los promedios, tomando en cuenta los valores
    private float SacarPromedios(float acumulador, int contador) {
        if (contador <= 0) {
            return 0;
        } else
            return acumulador / contador;
    }
    // Enseñar resultados
    private void showResults() {
        // Sacar promedios
        acum = acumUno + acumDos + acumTres;
        int total = contUno + contDos + contTres;
        prom = SacarPromedios(acum, total);
        promUno = SacarPromedios(acumUno, contUno);
        promDos = SacarPromedios(acumDos, contDos);
        promTres = SacarPromedios(acumTres, contTres);
        // Mostrar
        JOptionPane.showMessageDialog(null, 
                    "El promedio de las notas finales es: " + prom +
                            "\n El promedio del grupo uno es: " + promUno +
                            "\n El promedio del grupo dos es: " + promDos +
                            "\n El promedio del grupo tres es: " + promTres
                );
    }
    // Metodo principal del programa
    public void RunProgram() {
        do {
            UsarAcumuladores(Grupo(), ObtenerPromedio());
        } while (JOptionPane.showConfirmDialog(null, "Desea ingresar otro dato? (S/N)")
                == JOptionPane.OK_OPTION);
        
        showResults();
    }    
}