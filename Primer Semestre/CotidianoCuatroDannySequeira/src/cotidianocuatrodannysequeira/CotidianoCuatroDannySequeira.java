package cotidianocuatrodannysequeira;

import cotidianocuatrodannysequeira.ejerciciodos.EjercicioDos;
import cotidianocuatrodannysequeira.ejerciciouno.EjercicioUno;
import cotidianocuatrodannysequeira.ejerciciotres.EjercicioTres;

import javax.swing.JOptionPane;
/**
 * @ Cuarto Trabajo Cotidiano
 * @ CotidianoCuatroDannySequeira
 * @Date: 4/4/2022
 * @Copyright: 2022 Danny Sequeira All rights reserved.
 */
public class CotidianoCuatroDannySequeira {
    // Calling every class from every exercise
    static EjercicioUno uno = new EjercicioUno();
    static EjercicioDos dos = new EjercicioDos();
    static EjercicioTres tres = new EjercicioTres();
    // Boolean variable
    static boolean shouldContinue = true;
    // What should we do?
    private static void Desiciones(int op) {
        switch (op) {
            case 1:
                uno.Principal();
                break;
            case 2:
                dos.Principal();
                break;
            case 3:
                tres.Principal();
                break;
            case 4:
                shouldContinue = false;
                break;
        }
    }
    // What does the user want us to do?
    public static void Principal() {
        do {
            int op = Integer.parseInt(
                    JOptionPane.showInputDialog("Que operacion va a realizar:" +
                            "\n1.   Correr ejercicio de Estudiantes" +
                            "\n2.   Correr ejercicio de Cacetas" +
                            "\n3.   Correr ejercicio de empleados" +
                            "\n4.   Salir")
            );

            Desiciones(op);
        } while (shouldContinue);
    }
    // IMPORTANT!!!! Main method
    public static void main(String[] args) {
        Principal();
        System.exit(0);
    }
}
