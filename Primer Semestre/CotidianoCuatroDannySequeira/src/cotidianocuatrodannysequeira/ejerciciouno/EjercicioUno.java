package cotidianocuatrodannysequeira.ejerciciouno;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
/**
 * @ Cuarto Trabajo Cotidiano
 * @ EjercicioUno
 * @Date: 4/4/2022
 * @Copyright: 2022 Danny Sequeira All rights reserved.
 */
public class EjercicioUno {
    // ------------------------- Global variables --------------------------------------
    // Booleans
    boolean shouldContinue = true;
    // Counters
    int contDeci = 0, contUnde = 0, contDuo = 0,
    contApro = 0, contApla = 0, contRepro = 0;
    // accumulators
    float acumDeci = 0, acumUnde = 0, acumDuo = 0,
            acumApro = 0, acumApla = 0, acumRepro = 0;
    // Lista de objetos clase estudiantes
    List<Estudiante> studentList = new ArrayList<>();
    // -------------------------- Functions -------------------------------------------------------
    // Return the name of the student
    private String AddName() {
        return JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
    }
    // Return the ID of the student
    private int AddId() {
        return Integer.parseInt(JOptionPane.showInputDialog("Ingrese la identificacion del estudiante"));
    }
    // Return the note of the student
    private float AddNote() {
        return Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del estudiante"));
    }
    // Return the student level
    private int AddLevel() {
        String[] buttons = {"Decimo", "Undecimo", "Duodecimo"};
        return JOptionPane.showOptionDialog(
                null,
                "Cual es el nivel de su estudiante",
                "Nivel",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                buttons,
                buttons[0]);
    }
    // Return a prom
    private float ObtenerPromedio(float acum, int cont) {
        return (cont == 0) ? 0 : acum / cont;
    }
    // --------------------- Methods -------------------------------------------------------------
    // Add students to the list
    private void AgregarEstudiante() {
        do {
            Estudiante student = new Estudiante(AddName(), AddId(), AddNote(), AddLevel());
            student.Aprobado();
            studentList.add(student);
        } while (JOptionPane.showConfirmDialog(null, "Desea ver procesar otra nota? (S/N)") == JOptionPane.OK_OPTION);
    }
    // Method that reports the proms from different sections
    private void ReportarPromediosSecciones() {
        for (Estudiante student : studentList) {
            if (student.getNivel() == 0) {
                contDeci++;
                acumDeci += student.getNote();
            } else if (student.getNivel() == 1) {
                contUnde++;
                acumUnde += student.getNote();
            } else {
                contDuo++;
                acumDuo += student.getNote();
            }
        }

        JOptionPane.showMessageDialog(
                null,
                "El promedio de los estudiantes es este: " +
                        "\nEstudiantes en general " + ObtenerPromedio(acumDeci + acumUnde + acumDuo, contDeci + contUnde + contDuo) +
                        "\nEstudiantes de decimo " + ObtenerPromedio(acumDeci, contDeci) +
                        "\nEstudiantes de undecimo " + ObtenerPromedio(acumUnde, contUnde) +
                        "\nEstudiantes de Duodecimo " + ObtenerPromedio(acumDuo, contDuo)
        );
    }
    // Method that reports the proms according to its condition
    private void ReportarPromediosNotas() {
        for (Estudiante estudiante : studentList) {
            if (estudiante.getNote() >= 70) {
                contApro++;
                acumApro += estudiante.getNote();
            } else if (estudiante.getNote() < 70 && estudiante.getNote() >= 50) {
                contApla++;
                acumApla += estudiante.getNote();
            } else {
                contRepro++;
                acumRepro += estudiante.getNote();
            }
        }

        JOptionPane.showMessageDialog(
                null,
                "El promedio de los estudiantes es este: " +
                        "\nEstudiantes Aprobados " + ObtenerPromedio(acumApro, contApro) +
                        "\nEstudiantes Aplazados " + ObtenerPromedio(acumApla, contApla) +
                        "\nEstudiantes Reprobados " + ObtenerPromedio(acumRepro, contRepro)
        );
    }
    // What should we do?
    private void Desiciones(int op) {
        switch (op) {
            case 1:
                AgregarEstudiante();
                break;
            case 2:
                ReportarPromediosSecciones();
                break;
            case 3:
                ReportarPromediosNotas();
                break;
            case 4:
                shouldContinue = false;
                break;
        }
    }
    // What does the user want us to do?
    public void Principal() {
        do {
            int op = Integer.parseInt(
                    JOptionPane.showInputDialog("Que operacion va a realizar:" +
                            "\n1.   Leer numeros" +
                            "\n2.   Reportar promedios por nivel" +
                            "\n3.   Reportar promedios de aplazados, reprobados y aprobados" +
                            "\n4.   Salir")
            );

            Desiciones(op);
        } while (shouldContinue);

    }
}
