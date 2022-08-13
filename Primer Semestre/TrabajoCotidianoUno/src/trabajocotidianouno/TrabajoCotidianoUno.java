package trabajocotidianouno;

import javax.swing.JOptionPane;

public class TrabajoCotidianoUno {
    // Creating objects about the classes from my personal files
    static PromediosParImpar parImpar = new PromediosParImpar();
    static WhilePromedios whileProms = new WhilePromedios();
    static Triangulo triangulo = new Triangulo();
    static NumerosEnteros numEnteros = new NumerosEnteros();
    // Using switch to use diferent methods from other clases
    private static void Options(int selection) {
        switch (selection) {
            case 1:
                numEnteros.StartNumEnteros();
                break;
            case 2:
                triangulo.VerTriangulo();
                break;
            case 3:
                parImpar.Contemos();
                break;
            case 4:
                whileProms.RunProgram();
                break;   
        }
    }

    /**
     * Main Method
     * @param args
     */
    public static void main(String[] args) {
        // Important condition
        boolean shouldContinue = true;
        // Dont stop until user wishes to!!!
        while (shouldContinue) {
            // Get the user program selection
            int programaEscojido = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Favor, selecciona uno de los siguientes programas: \n"
                            + "1.   Numeros enteros, mayor menor \n"
                            + "2.   tipo de triangulo \n"
                            + "3.   Promedio numeros par e impar \n"
                            + "4.   Promedios notas con while"
                    )
            );
            // Run other methods
            Options(programaEscojido);
            // Should we continue or not?
            int usuarioContinuar = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Desea Continuar con los programas: (solo introduce el numero deseado)\n"
                            + "1.   si \n"
                            + "2.   no \n"
                    )
            );

            if (usuarioContinuar != 1) {
                shouldContinue = false;
            }

        }
        
        System.exit(0);
    }

}
