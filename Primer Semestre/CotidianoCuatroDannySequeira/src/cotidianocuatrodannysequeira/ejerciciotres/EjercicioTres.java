package cotidianocuatrodannysequeira.ejerciciotres;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
/**
 * @ Cuarto Trabajo Cotidiano
 * @ EjercicioTres
 * @Date: 4/4/2022
 * @Copyright: 2022 Danny Sequeira All rights reserved.
 */
public class EjercicioTres {
    // ----------------- Global variables -------------------------------------------
    // Counters
    int maleCount = 0, femaleCount = 0, generalCount = 0, workSheetCount = 0, humanCount = 0;
    // accumulators
    float maleAccum = 0, femaleAccum = 0, generalAccum = 0, workSheetAccum = 0, humanAccum = 0;
    // Boolean variables
    boolean shouldContinue = true;
    // Lists
    List<Empleado> employeeList = new ArrayList<>();
    // ------------------------ Functions ------------------------------------------------------------
    // Return the name of the employee
    private String AddName() {
        return JOptionPane.showInputDialog("Ingrese el nombre del empleado");
    }
    // Return the ID of the employee
    private int AddId() {
        return Integer.parseInt(JOptionPane.showInputDialog("Ingrese la identificacion del empleado"));
    }
    // Return the salary of the employee
    private float AddSalary() {
        return Float.parseFloat(JOptionPane.showInputDialog("Ingrese el salario del empleado"));
    }
    // Return the gender of the employee
    private int AddGender() {
        String[] buttons = {"Masculino", "Femenino"};
        return JOptionPane.showOptionDialog(
                null,
                "Cual es el genero del empleado?",
                "genero",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                buttons,
                buttons[0]);
    }
    // Return the employee's department
    private int AddDepartment() {
        String[] buttons = {"Generales", "Planillas", "Recursos Humanos"};
        return JOptionPane.showOptionDialog(
                null,
                "Cual es el departamento del empleado?",
                "departamento",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                buttons,
                buttons[0]);
    }
    // Return the prom of the nums
    private float GetProms(float acum, int cont) {
        return (cont <= 0) ? 0 : acum / cont;
    }
    // ---------------------------- Methods ----------------------------------------------
    // Add a new object to the Employee List
    private void AddEmployee() {
        do {
            employeeList.add(new Empleado(AddId(), AddName(), AddSalary(), AddGender(), AddDepartment()));
        } while(JOptionPane.showConfirmDialog(null, "Desea ver procesar otro empleado? (S/N)") == JOptionPane.OK_OPTION);
    }
    // Report gender prom salary
    private void ReportGenderSalary() {
        for (Empleado employee : employeeList) {
            if (employee.getGender() == 0) {
                maleCount++;
                maleAccum += employee.getSalary();
            } else {
                femaleAccum += employee.getSalary();
                femaleCount++;
            }
        }
        JOptionPane.showMessageDialog(
                null,
                "Total de salarios procesados: " + employeeList.size() +
                        "\nTotal de paga en todos los salarios" + (femaleAccum + maleAccum) +
                        "\nTotal de paga en salarios masculinos: " + maleAccum +
                        "\nTotal de paga en salarios femeninos: " + femaleAccum +
                        "\nPromedio total de salarios masculinos: " + GetProms(maleAccum, maleCount) +
                        "\nPromedio total de salarios femeninos: " + GetProms(femaleAccum, femaleCount)
        );
    }
    // Report departments salary
    private void ReportDepartmentSalary() {
        for (Empleado employee : employeeList) {
            if (employee.getDepartment() == 0) {
                generalCount++;
                generalAccum += employee.getSalary();
            } else if (employee.getDepartment() == 1){
                workSheetAccum += employee.getSalary();
                workSheetCount++;
            } else {
                humanAccum += employee.getSalary();
                humanCount++;
            }
        }
        JOptionPane.showMessageDialog(
                null,
                "Total de salarios procesados: " + employeeList.size() +
                        "\nPromedio total de todos los salarios" + GetProms(generalAccum + workSheetAccum + humanAccum, generalCount + workSheetCount + humanCount) +
                        "\nTotal de paga en salarios del departamento de Generales: " + generalAccum +
                        "\nTotal de paga en salarios del departamento de Planillas: " + workSheetAccum +
                        "\nTotal de paga en salarios del departamento de Recursos Humanos: " + humanAccum +
                        "\nPromedio total de salarios del departamento de Generales: " + GetProms(generalAccum, generalCount) +
                        "\nPromedio total de salarios del departamento de Planillas: " + GetProms(workSheetAccum, workSheetCount)
        );
    }
    // What should we do?
    private void Desiciones(int op) {
        switch (op) {
            case 1:
                AddEmployee();
                break;
            case 2:
                ReportGenderSalary();
                break;
            case 3:
                ReportDepartmentSalary();
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
                            "\n1.   insertar salarios" +
                            "\n2.   Reportar datos de los salarios por genero" +
                            "\n3.   Reportar datos de los salarios por departamento" +
                            "\n4.   Salir")
            );

            Desiciones(op);
        } while (shouldContinue);
    }
}
