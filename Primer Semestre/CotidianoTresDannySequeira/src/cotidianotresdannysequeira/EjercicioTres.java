package cotidianotresdannysequeira;
/*
 Desarrolle un programa en Java que lee y procesa números enteros. 
 La lectura de los números lo debe hacer en un procedimiento denominado 
 lecturadatos() y debe leer N números. 

 En el programa desarrolle una función de tipo entero que recibe un 
 número entero como parámetro y devuelve o retorna 1, si el número que 
 recibió la función como parámetro es primo y devuelve 2 si el número 
 que recibió la función como parámetro no es primo. 

 En el programa desarrolle una función de tipo entero que recibe un 
 número entero como parámetro y devuelve o retorna 0, si el número que 
 recibió la función como parámetro es par y devuelve 1 si el número que recibió 
 la función como parámetro es impar.

 En el programa desarrolle una función de tipo entero que recibe un número entero como parámetro
 y devuelve o retorna él factorial del número que recibe como parámetro. Teniendo, por ejemplo,
 que él factorial del número 0 o 1 es 1 y el factorial de 3! = 1 x 2 x 3 = 6.

 Cada vez que se lee y procesa cada número, el programa debe reportar de acuerdo a los datos que
 devuelven o retornan las funciones, en un procedimiento reportardatos que luego debe llamar en el
 main(), si el número procesado es PAR, IMPAR, PRIMO, NO PRIMO y el resultado del factorial de lo que
 retorna la función que calcula el factorial, así también debe reportar el promedio de números pares,
 promedio de números impares, promedio de números primos y promedio de números no primos
 procesados.


 */

import javax.swing.JOptionPane;

public class EjercicioTres {

    // Contadores
    int contadorPar = 0, contadorImpar = 0, contadorPrimos = 0, contadorCompuestos = 0;
    int acumPar = 0, acumImpar = 0, acumPrimos = 0, acumCompuestos = 0;

    // Par o Impar
    private void Par(int num) {
        if (num % 2 == 0) {
            acumPar += num;
            contadorPar++;
            JOptionPane.showMessageDialog(null, "El numero es par");

        } else {
            acumImpar += num;
            contadorImpar++;
            JOptionPane.showMessageDialog(null, "El numero es impar");
        }
    }

    // Obtener factorial
    private int factorial(int num) {
        return (num == 0) ? 1 : num * factorial(num - 1);
    }

    // Pedir Numeros
    private int askNum() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a procesar"));
    }

    // Obtener numero primo
    private int primo(int num) {
        int contador = 0;
        for (int i = 1; i <= num; i++) {
            contador = (num % 1 == 0) ? contador + 1 : contador;
        }
        if (contador <= 2) {
            contadorPrimos++;
            acumPrimos += num;
        } else {
            contadorCompuestos++;
            acumCompuestos += num;
        }
        return (contador <= 2) ? 0 : 1;
    }

    // Enseñar resultados
    private void enseñarFactorialResultado() {
        int num = askNum();
        JOptionPane.showMessageDialog(
                null,
                "El factorial del numero ingresado es: " + factorial(num));
        Par(num);
        if (primo(num) == 0) {
            JOptionPane.showMessageDialog(null, "El numero es primo");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es compuesto");
        }
    }

    // Sacar promedios
    private float sacarPromedios(int acum, int cont) {
        return (cont <= 0) ? 0 : acum / cont;
    }

    // Correr programas
    public void RunProgram() {
        do {
            enseñarFactorialResultado();
        } while (JOptionPane.showConfirmDialog(null, "Desea procesar otro dato? (S/N)") == JOptionPane.OK_OPTION);

        float promedioPar = sacarPromedios(acumPar, contadorPar);
        float promedioImpar = sacarPromedios(acumImpar, contadorImpar);
        float promedioPrimos = sacarPromedios(acumPrimos, contadorPrimos);
        float promedioCompuestos = sacarPromedios(acumCompuestos, contadorCompuestos);

        JOptionPane.showMessageDialog(null, "El promedio de los numeros es el siguiente: \n"
                + "1. Numeros Pares: " + promedioPar 
                + "\n2. Numeros Impares: " + promedioImpar
                + "\n3. Numeros Primos: " + promedioPrimos
                + "\n4. Numeros Compuestos. " + promedioCompuestos);
    }
}
