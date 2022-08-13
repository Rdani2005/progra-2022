/*
 *   Desarrolle un programa en Java que lee y procesa N salarios 
 *    de los empleados que trabajan en una empresa X cualesquiera. 
 *    Para cada empleado, el programa debe leer el salario y el 
 *    género del empleado (1=Masculino, 2=Femenino) y al finalizar 
 *    el procesamiento de los N empleados, el programa tiene que calcular 
 *    y reportar el total de todos los salarios procesados, el total de 
 *    salarios de empleados Masculinos, el total de salarios de empleados 
 *    Femeninos y el promedio de todos los salarios procesados.
 */
package cotidianodosdanielsequeira;

import javax.swing.JOptionPane;

public class SalarioEmpleados {
    // Contadores
    int contadorFemenino = 0, contadorMasculino = 0, contador = 0;
    // Salarios
    float salarioMasculino = 0, salarioFemenino = 0,
            acumSalarioFem = 0, acumSalarioMascu = 0,
            acumSalario = 0, promSalario, promSalarioMascu, promSalarioFemi;
    // Acumular variables dependiendo del caso
    private void UsarAcumuladores(int femeninoMaculino, float salario) {
        switch (femeninoMaculino) {
            case 2:
                acumSalarioFem += salario;
                contadorFemenino++;
                break;
            case 1:
                acumSalarioMascu += salario;
                contadorMasculino++;
                break;
        }
    }
    // Obtener genero del usuario
    private int femeninoMasculino() {
        return Integer.parseInt(
                JOptionPane.showInputDialog("El usuario es \n 1. Masculino \n 2. Femenino")
        );
    }
    // Obtener salario del usuario
    private float obtenerSalario() {
        return Float.parseFloat(
                JOptionPane.showInputDialog("Cual es el salario del usuario?")
        );
    }
    // Enseñar resultados
    private void showResults(
            int contador,
            float salario,
            float salarioMasculino,
            float salarioFemenino,
            float promSalario,
            float promSalarioFemi,
            float promSalarioMascu) {
        JOptionPane.showMessageDialog(
                null,
                "El total de salarios ingresados fue de: " + contador +
                        "\n El total de salario entregado es de: " + salario +
                        "\n El total de salarios masculinos es de: " + salarioMasculino +
                        "\n El total de salarios femeninos es de: "+ salarioFemenino +
                        "\n El promedio de salarios es de: " + promSalario +
                        "\n el promedio de salarios masculinos es: " + promSalarioMascu +
                        "\n el promedio de salarios femeninos es: " + promSalarioFemi
        );
    }
    // Correr el programa
    public void RunProgram() {
        do {
            UsarAcumuladores(femeninoMasculino(), obtenerSalario());
        } while (JOptionPane.showConfirmDialog(null, "Desea ingresar otro dato? (S/N)")
                == JOptionPane.OK_OPTION);

        contador = contadorFemenino + contadorMasculino;
        acumSalario = acumSalarioFem + acumSalarioMascu;
        promSalario = acumSalario / contador;
        promSalarioFemi = acumSalarioFem / contadorFemenino;
        promSalarioMascu = acumSalarioMascu / contadorMasculino;
        
        showResults(
                contador, 
                acumSalario, 
                acumSalarioMascu, 
                acumSalarioFem, 
                promSalario, 
                promSalarioFemi, 
                promSalarioMascu);

    }
}
