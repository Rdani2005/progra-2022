/*
 Desarrolle un programa que lee en un procedimiento, 2 números enteros y un número de operación
 que corresponde al operador que se va a procesar con los números leídos, a saber: 1=Sumar, 2=Restar,
 3=Producto, 4=División, 5=Residuo, 6=Promedio, 7=Porcentaje, 8=Mayor, 9=Menor, 10=Sumar
 Cuadrados, 11=Sumar Cubos.
 Para cada una de las operaciones debe desarrollar una función, las cuales se van a llamar o invocar
 según la operación a procesar, las cuales se detallan a continuación:
 • La función Sumar recibe 2 números como parámetro y devuelve el resultado de sumar el número 1
 más el número 2.
 • La función Restar recibe 2 números como parámetro y devuelve el resultado de restar el número 1
 menos el número 2.
 • La función Producto recibe 2 números como parámetro y devuelve el resultado de multiplicar el
 número 1 por el número 2.
 • La función División recibe 2 números como parámetro y devuelve el resultado de dividir el número
 mayor entre el número menor.
 • La función Residuo recibe 2 números como parámetro y devuelve el resultado de dividir y retornar
 el residuo de dividir el número mayor entre el número menor.
 • La función Promedio recibe 2 números como parámetro y devuelve el resultado el promedio de los
 2 números que recibió como parámetro.
 • La función Porcentaje recibe 2 números como parámetro y devuelve el resultado de calcular el
 porcentaje que indica el segundo número al primer número, por ejemplo, si en el primer número se
 indica 50 y en el segundo número se indica 10, entonces quiere decir que se va a calcular el 10% a
 50, o sea el resultado sería 5.
 • La función Mayor recibe 2 números como parámetro y devuelve el número mayor de los 2 números
 que recibió como parámetro.
 • La función Menor recibe 2 números como parámetro y devuelve el número menor de los 2 números
 que recibió como parámetro.
 • La función Sumar Cuadrados recibe 2 números como parámetro y devuelve la suma del cuadrado
 del primer número más el cuadrado del segundo número.
 • La función Sumar Cubos recibe 2 números como parámetro y devuelve la suma del cubo del primer
 número más el cubo del segundo número.
 */
package cotidianotresdannysequeira;

import javax.swing.JOptionPane;

public class EjercicioCuatro {

    static String[] botons
            = {
                "Sumar",
                "Restar",
                "Producto",
                "División",
                "Residuo",
                "Promedio",
                "Porcentaje",
                "Mayor",
                "Menor",
                "sumar cuadrados",
                "sumar cubos"
            };

    private int suma(int num1, int num2) {
        return num1 + num2;
    }

    private int resta(int num1, int num2) {
        return num1 - num2;
    }

    private int producto(int num1, int num2) {
        return num1 * num2;
    }

    private int division(int num1, int num2) {
        return (num2 == 0) ? 0 : num1 / num2;
    }

    private int residuo(int num1, int num2) {
        return (num2 == 0) ? 0 : num1 % num2;
    }

    private int promedio(int num1, int num2) {
        return (num1 + num2) / 2;
    }

    private int porcentaje(int num1, int num2) {
        return (num2 * 100) / num1;
    }

    private int Mayor(int num1, int num2) {
        return (num1 == num2) ? 0 : ((num1 > num2) ? num1 : num2);
    }

    private int Menor(int num1, int num2) {
        return (num1 == num2) ? 0 : ((num1 < num2) ? num1 : num2);
    }

    private int Cuadrados(int num1, int num2) {
        return (num1 * num1) + (num1 * num1);
    }

    private int Cubos(int num1, int num2) {
        return (num1 * num1 * num1) + (num2 * num2 * num2);
    }

    private void showResult(int operacion) {
        JOptionPane.showMessageDialog(
                null,
                "El resultado de tu operacion es: " + operacion,
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    private int askData() {
        return Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese un numero!!")
        );
    }

    private int opciones() {
        return JOptionPane.showOptionDialog(
                null,
                "Que operación desea realizar",
                "Opciones",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                botons,
                botons[0]);
    }

    private void tomarDecisiones() {
        switch (opciones()) {
            case 0:
                showResult(suma(askData(), askData()));
                break;
            case 1:
                showResult(resta(askData(), askData()));
                break;
            case 2:
                showResult(producto(askData(), askData()));
                break;
            case 3:
                showResult(division(askData(), askData()));
                break;
            case 4:
                showResult(residuo(askData(), askData()));
                break;

            case 5:
                showResult(promedio(askData(), askData()));
                break;
            case 6:
                showResult(porcentaje(askData(), askData()));
                break;
            case 7:
                showResult(Mayor(askData(), askData()));
                break;
            case 8:
                showResult(Menor(askData(), askData()));
                break;
            case 9:
                showResult(Cuadrados(askData(), askData()));
                break;
            case 10:
                showResult(Cubos(askData(), askData()));
                break;
        }
    }
    
    public void RunProgram() {
        do {
            tomarDecisiones();
        } while (JOptionPane.showConfirmDialog(null, "Desea hacer otra operacion? (S/N)") == JOptionPane.OK_OPTION);
    }
}
