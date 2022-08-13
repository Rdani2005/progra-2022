package cotidianotresdannysequeira;

import javax.swing.JOptionPane;

public class CotidianoTresDannySequeira {

    static String[] botons = 
    {
        "Triangulos y Promedios", 
        "Potencias", 
        "Primos, Pares y Factoriales",
        "operaciones varias"
    };

    static EjercicioUno Uno = new EjercicioUno();
    static EjercicioDos Dos = new EjercicioDos();
    static EjercicioTres Tres = new EjercicioTres();
    static EjercicioCuatro Cuatro = new EjercicioCuatro();
    private static void TomarDecision() {
        int decision = 
                JOptionPane.showOptionDialog(
                    null,
                    "Que operación desea realizar",
                    "Opciones",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null,
                    botons,
                    botons[0]);

        switch (decision) {
            case 0:
                Uno.RunProgram();
                break;
            case 1:
                Dos.RunProgram();
                break;
            case 2:
                Tres.RunProgram();
                break;
            case 3:
                Cuatro.RunProgram();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Dato incorrecto, vuelva a intentarlo");
                break;
        }

    }

    private static void MainProgram() {
        do {
            TomarDecision();
        } while (JOptionPane.showConfirmDialog(null, "Desea correr otro programa? (S/N)") == JOptionPane.OK_OPTION);
    }

    public static void main(String[] args) {
        MainProgram();
        System.exit(0);
    }

}
