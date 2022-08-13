package cotidianodosdanielsequeira;

import javax.swing.JOptionPane;

public class CotidianoDosDanielSequeira {
    // LLamar distintas clases
    static PrimosONo clasePrimo = new PrimosONo();
    static Notas claseNota = new Notas();
    static Factoriales claseFactorial = new Factoriales();
    static SalarioEmpleados claseSalarios = new SalarioEmpleados();
    static Casetas claseCasetas = new Casetas();
  
    // Metodo para correr el programa
    private static void RunDiferentPrograms(int programa) {
        switch(programa) {
            case 1:
                clasePrimo.RunProgram();
                break;
            case 2:
                claseFactorial.RunProgram();
                break;
            case 3:
                claseSalarios.RunProgram();
                break;
            case 4: 
                claseNota.RunProgram();
                break;
            case 5:
                claseCasetas.RunProgram();
                break;
        }
    }
    // Metodo principal
    public static void main(String[] args) {
        // Correr los programas
        do {
            RunDiferentPrograms(
                    // Preguntar cual programa desea correr
                    Integer.parseInt(JOptionPane.showInputDialog(
                    "Cual programa desea correr? "
                            + "\n 1.    Numeros Primos"
                            + "\n 2.    Factoriales"
                            + "\n 3.    Salarios"
                            + "\n 4.    Notas"
                            + "\n 5.    Casetas"
                    ))
            ); // Deseara correr otro programa
        } while (JOptionPane.showConfirmDialog(null, "Desea correr otro programa? (S/N)")
                == JOptionPane.OK_OPTION);
        System.exit(0);
    }
    
}
