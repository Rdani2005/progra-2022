/*
 * Copyright (C) 2022 Rdani2005
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package procesos;

import datos.Estudiante;
import javax.swing.JOptionPane;

public class EjercicioDos {

    // ------------------ Declaración de variables Globales -----------------
    private Estudiante StudentsList = null;

    // ----------------------- Funciones -------------------------------------
    // Ver si no se encuentra repetida el id del estudiante
    private boolean Repetido(int id, Estudiante temp) {
        if (temp == null) {
            return false;
        }
        int counter = 0;
        // Recorrer la lista
        while (temp != null) {
            if (temp.getId() == id) {
                counter++;
            }
            temp = temp.next;
        }
        // Comparar cuantas veces se ha repetido el dato
        return counter != 0;
    }

    // Reporte de notas
    private String ReporteNotas(String title, float min, float max, Estudiante temp) {
        if (temp == null) {
            return "Lista vacía";
        }
        String output = title + "\n";
        while (temp != null) {
            if (min < temp.getNote() && max > temp.getNote()) {
                output += "Id del estudiante: "
                        + temp.getId()
                        + " Nivel del Estudiante: "
                        + temp.getLevel()
                        + " Nota del estudiante: "
                        + temp.getNote() + "\n";
            }

            temp = temp.next;

        }

        return output;
    }

    // Reporte de nota mayor
    private float Mayor(Estudiante temp) {

        if (temp == null) {
            return 0;
        }

        float num = temp.getNote();

        while (temp != null) {
            num = (temp.getNote() >= num) ? temp.getNote() : num;
            temp = temp.next;
        }

        return num;
    }

    // Reporte de nota menor
    private float menor(Estudiante temp) {
        if (temp == null) {
            return 0;
        }

        float num = temp.getNote();

        while (temp != null) {
            num = (temp.getNote() <= num) ? temp.getNote() : num;
            temp = temp.next;
        }

        return num;
    }

    // Cantidad de datos en la lista
    private int contar(Estudiante temp) {
        if (temp == null) {
            return 0;
        }
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Reporte de promedio general
    private float prom(Estudiante temp) {
        if (temp == null) {
            return 0;
        }

        int cont = 0;
        float acum = 0;

        while (temp != null) {
            cont++;
            acum += temp.getNote();
            temp = temp.next;
        }

        return (cont == 0) ? 0 : acum / cont;
    }

    // Reporte de promedios por nivel, ingresado por parametro
    private float promNivel(Estudiante temp, int nivel) {
        if (temp == null) {
            return 0;
        }
        int cont = 0;
        float acum = 0;

        while (temp != null) {
            if (temp.getLevel() == nivel) {
                cont++;
                acum += temp.getNote();
            }
            temp = temp.next;
        }

        return (cont == 0) ? 0 : acum / cont;

    }

    // Averiguar el promedio de notas por nivel, y por condicion. Recibe como
    // parametro la lista de estudiantes, el nivel de los estudiantes, nota minima
    // y nota maxima
    private float promCondicion(
            Estudiante temp,
            int nivel,
            float min,
            float max
    ) {
        if (temp == null) {
            return 0;
        }

        float acum = 0;
        int cont = 0;

        while (temp != null) {
            // Comparar
            if (nivel == temp.getLevel()
                    && temp.getNote() >= min
                    && temp.getNote() <= max) {
                acum += temp.getNote();
                cont++;
            }
            temp = temp.next;
        }

        return (cont == 0) ? 0 : acum / cont;
    }

    // Reporte de datos indicado por nota del usuario
    private String ReporteNota(float note, Estudiante temp) {
        if (temp == null) {
            return "Lista vacía";
        }
        String output = "Reporte por Indicada por el usuario\n";
        while (temp != null) {
            if (note == temp.getNote()) {
                output += "Id del estudiante: "
                        + temp.getId()
                        + " Nivel del estudiante "
                        + ((temp.getLevel() == 0)
                                ? "Decimo" : (temp.getLevel() == 1) ? "Undecimo" : "Duodecimo")
                        + " Nota del estudiante: " + temp.getNote();
            }
            temp = temp.next;
        }
        return output;
    }

    // ------------------------- Procesos ------------------------------------
    // Privados
    // Insertar datos en la lista de tipo pila
    private void Pila(int id, float note, int level) {

        Estudiante nuevo = new Estudiante(id, note, level);
        nuevo.anterior = null;
        nuevo.next = null;

        if (StudentsList == null) {
            StudentsList = nuevo;
        } else {
            StudentsList.anterior = nuevo;
            nuevo.next = StudentsList;
            StudentsList = nuevo;
        }
    }

    // Insertar datos en la lista de forma de cola
    private void Cola(int id, float note, int level) {
        Estudiante nuevo = new Estudiante(id, note, level);
        nuevo.anterior = null;
        nuevo.next = null;

        Estudiante temp = StudentsList;

        while (temp.next != null) {
            temp = temp.next;
        }
        // Conectar los nodos
        temp.next = nuevo;
        nuevo.anterior = temp;

    }

    // Publicos
    // Insertar datos a la lista, ya sea de tipo cola o tipo pila
    // cuando se utiliza este metodo, se le pasa por parametro el tipo de 
    // inserción  que se desea realizar
    public void Insertar(int tipo) {
        String levels[] = {"Decimo", "Undecimo", "Duodecimo"};
        do {
            // pedir un Id, y ver que no esté repetido
            int id;
            do {
                id = Integer.parseInt(JOptionPane.showInputDialog("Cual es el id del estudiante?"));
            } while (Repetido(id, StudentsList));
            float note = Float.parseFloat(JOptionPane.showInputDialog("Cual es la nota del estudiante?"));
            int level = JOptionPane.showOptionDialog(null,
                    "Cual es el nivel del estudiante?",
                    "Nivel",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null,
                    levels,
                    levels[0]
            );
            if (tipo == 1) {
                Pila(id, note, level);
            } else {
                Cola(id, note, level);
            }

        } while (JOptionPane.showConfirmDialog(
                null,
                "Desea Ingresar otro Dato?",
                "Otro?",
                JOptionPane.YES_NO_OPTION
        ) == JOptionPane.YES_OPTION);
    }

    // Consultar datos de la lista
    public void Consultar() {
        Estudiante temp = StudentsList;

        int id = Integer.parseInt(
                JOptionPane.showInputDialog("Cual es el ID del estudiante a buscar?")
        );

        int counter = 0;
        boolean found = false;
        while (temp != null) {
            counter++;
            if (temp.getId() == id) {
                JOptionPane.showMessageDialog(
                        null,
                        "Estudiante encontrado en la posición " + temp.getId()
                        + "\nNivel del estudiante: "
                        + ((temp.getLevel() == 0)
                                ? "Decimo" : (temp.getLevel() == 1) ? "Undecimo" : "Duodecimo")
                        + "\nNota final del estudiante: " + temp.getNote()
                );
                found = true;
                break;
            }

            temp = temp.next;
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "El estudiante no se ha encontrado...");
        }
    }

    // Modificar un dato de la lista
    public void Modificar() {
        Estudiante temp = StudentsList;

        int id = Integer.parseInt(
                JOptionPane.showInputDialog("Cual es el ID del estudiante a buscar?")
        );

        int counter = 0;
        boolean found = false;
        while (temp != null) {
            counter++;
            // Se encontró al estudiante?
            if (temp.getId() == id) {
                JOptionPane.showMessageDialog(
                        null,
                        "Estudiante encontrado en la posición " + counter
                        + "\nNivel del estudiante: "
                        + ((temp.getLevel() == 0)
                                ? "Decimo" : (temp.getLevel() == 1) ? "Undecimo" : "Duodecimo")
                        + "\nNota final del estudiante: " + temp.getNote()
                );
                found = true;
                // QUe querrá modificar el usuario?
                String levels[] = {"Nivel", "Nota"};
                int modificar = JOptionPane.showOptionDialog(null,
                        "Cual es el nivel del estudiante?",
                        "Nivel",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.WARNING_MESSAGE,
                        null,
                        levels,
                        levels[0]
                );
                // Modificar la nota
                // Odio este monton de if
                if (modificar == 0) {
                    temp.setLevel();
                } else {
                    temp.setNote();
                }
                // Terminar el ciclo
                break;
            }

            temp = temp.next;
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "El estudiante no se ha encontrado...");
        }
    }

    // Eliminar primer dato presente en la lista
    public void Eliminar() {
        if (StudentsList == null) {
            JOptionPane.showMessageDialog(null, "No hay ningun dato en la lista");
        } else {
            JOptionPane.showMessageDialog(null, "Dato eliminado");
            StudentsList = StudentsList.next;

            if (StudentsList == null) {
                JOptionPane.showMessageDialog(null, "La lista está vacía");
            } else {
                StudentsList.anterior = null;
                if (StudentsList.next == null) {
                    JOptionPane.showMessageDialog(null, "Solo queda un dato en la lista");
                }
            }

        }

    }

    // Reporte de estadisticas
    public void Estadisticas() {
        JOptionPane.showMessageDialog(
                null,
                "Estadisticas\n"
                + "Nota mayor almacenada en la lista " + Mayor(StudentsList)
                + "\nNota menor almacenada en la lista " + menor(StudentsList)
                + "\nCantidad de datos en la lista " + contar(StudentsList)
                + "\nPromedio de todas las notas " + prom(StudentsList)
                + "\nPromedio de notas de decimo " + promNivel(StudentsList, 0)
                + "\nPromedio de notas de undecimo " + promNivel(StudentsList, 1)
                + "\nPromedio de notas de duodecimo " + promNivel(StudentsList, 2)
                + "\nPromedio de notas aprobadas de decimo " + promCondicion(StudentsList, 0, 70, 100)
                + "\nPromedio de notas aplazadas de decimo " + promCondicion(StudentsList, 0, 50, 69)
                + "\nPromedio de notas reprobadas de decimo " + promCondicion(StudentsList, 0, 0, 49)
                + "\nPromedio de notas aprobadas de undecimo " + promCondicion(StudentsList, 1, 70, 100)
                + "\nPromedio de notas aplazadas de undecimo " + promCondicion(StudentsList, 1, 50, 69)
                + "\nPromedio de notas reprobadas de undecimo " + promCondicion(StudentsList, 1, 0, 49)
                + "\nPromedio de notas aprobadas de duodecimo " + promCondicion(StudentsList, 2, 70, 100)
                + "\nPromedio de notas aplazadas de duodecimo " + promCondicion(StudentsList, 2, 50, 69)
                + "\nPromedio de notas reprobadas de duodecimo " + promCondicion(StudentsList, 2, 0, 49)
        );
    }

    // Reportes de datos
    public void Reporte() {
        // Solicitarle al usuario lo que desea visualizar
        int op = Integer.parseInt(
                JOptionPane.showInputDialog(
                        null,
                        "Cual reporte desea ver?\n"
                        + "1. Todos los estudiantes de la lista\n"
                        + "2. Todos los estudiantes con nota aprobada\n"
                        + "3. Todos los estudiantes con nota aplazada\n"
                        + "4. Todos los estudiantes con nota reprobada\n"
                        + "5. Estudiantes con nota final indicada por el usuario\n"
                        + "6. Estudiantes por Rango indicado por el usuario"
                )
        );
        // Visualizacion dependiendo de la opcion del usuario
        switch (op) {
            case 1:
                JOptionPane.showMessageDialog(
                        null,
                        ReporteNotas("NOTAS EN TOTAL", -1, 101, StudentsList));
                break;
            case 2:
                JOptionPane.showMessageDialog(
                        null,
                        ReporteNotas("NOTAS APROBADAS", 69, 101, StudentsList));
                break;
            case 3:
                JOptionPane.showMessageDialog(
                        null,
                        ReporteNotas("NOTAS APLAZADAS", 49, 70, StudentsList));
                break;
            case 4:
                JOptionPane.showMessageDialog(
                        null,
                        ReporteNotas("NOTAS REPROBADAS", -1, 50, StudentsList));
                break;
            case 5:
                JOptionPane.showMessageDialog(null, ReporteNota(
                        Float.parseFloat(JOptionPane.showInputDialog("Cual es la nota a consultar?")),
                        StudentsList));
                break;
            case 6:
                float min = Float.parseFloat(JOptionPane.showInputDialog("Cual es la nota minima?"));
                float max = Float.parseFloat(JOptionPane.showInputDialog("Cual es la nota maxima"));
                JOptionPane.showMessageDialog(null, ReporteNotas("RANGO INDICADO POR EL USUARIO", (min - 1), (max + 1), StudentsList));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no disponible");
                break;
        }
    }

}
