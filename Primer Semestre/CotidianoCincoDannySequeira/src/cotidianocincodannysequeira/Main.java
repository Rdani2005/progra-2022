package cotidianocincodannysequeira;

import javax.swing.JOptionPane;

public class Main {
    // Enseñar un menu principal
    public static void MenuPrincipal() {
        int op;
        do {
            // Cual operación realizamos?
            op = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Que desea realizar: "
                            + "\n1. Ver ejercicio Uno."
                            + "\n2. Ver ejercicio Dos"
                            + "\n3. Salir"
                    )
            );
            // Procesos a realizar
            switch (op) {
                case 1:
                    EjercicioUno.Principal();
                    break;
                case 2:
                    EjercicioDos.MenuPrincipal();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Que tenga un lindo dia!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no está disponible");
                    break;
            }
            // Seguimos el programa?
        } while (op != 3);
    }
    // Metodo main
    public static void main(String[] args) {
        MenuPrincipal();
    }
}
