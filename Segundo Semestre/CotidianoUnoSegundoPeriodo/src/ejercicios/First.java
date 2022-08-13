/*
 * Copyright (C) 2022 Daniel Ricardo Sequeira Campos
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

package ejercicios;

import javax.swing.JOptionPane;
import listas.Empleado;

public class First {

    // -------------------- Variables Globales ------------------------
    private Empleado listaEmpleados = null;

    // ------------------------- Funciones ----------------------------
    // Promedio de los salarios de los empleados
    private float prom(Empleado temp) {
        // Retornar 0 en caso de lista vacía
        if (temp == null) {
            return 0;
        }
        // Contadores y acumuladores
        int cont = 0;
        float acum = 0;
        // Recorrer la lista temp
        while (temp != null) {
            cont++;
            acum += temp.salary;
            temp = temp.next;
        }
        // Comparar si el contador vale 0, entonces retorna 0, sino, 
        // devuelve el promedio de lo acumulado entre la cantidad de objetos de la lista
        return cont == 0 ? 0 : acum / cont;
    }

    // Promedio de los departamentos brindados por los empleados
    private float promDep(Empleado temp, int dep) {
        // Retornar 0 en caso de lista vacía
        if (temp == null) {
            return 0;
        }
        // Contadores y acumuladores
        int cont = 0;
        float acum = 0;
        // Recorrer la lista temp
        while (temp != null) {
            if (dep == temp.department) {
                cont++;
                acum += temp.salary;
            }
            temp = temp.next;
        }
        // Comparar si el contador vale 0, entonces retorna 0, sino, 
        // devuelve el promedio de lo acumulado entre la cantidad de objetos de la lista
        return cont == 0 ? 0 : acum / cont;
    }

    // Devolver el salario menor de la lista de empleados
    private float min(Empleado temp) {
        float menor = temp.salary;
        // Recorrer la lista
        while (temp != null) {
            if (menor >= temp.salary) {
                menor = temp.salary;
            }
            temp = temp.next;
        }
        return menor;
    }

    // Devolver el salario mayor de la lista de empleados
    private float max(Empleado temp) {
        float mayor = temp.salary;
        // Recorrer la lista
        while (temp != null) {
            if (mayor <= temp.salary) {
                mayor = temp.salary;
            }
            temp = temp.next;
        }
        return mayor;
    }

    // El id está repetido?
    private boolean Repetido(int id, Empleado temp) {
        int count = 0;
        while (temp != null) {
            if (temp.id == id) {
                count++;
            }
            temp = temp.next;
        }
        return count != 0;
    }

    // --------------------------- Procedimientos ---------------------------
    // Agregar datos a la lista, de tipo cola. 
    // Se ingresan los datos por medio de parametros
    private void ingresar(int id, int depa, float salary) {
        // Agregar datos a un nuevo objeto de tipo empleado
        Empleado nuevo = new Empleado();
        nuevo.id = id;
        nuevo.department = depa;
        nuevo.salary = salary;
        nuevo.next = null;
        if (listaEmpleados == null) {
            listaEmpleados = nuevo;
        } else {
            Empleado intento = listaEmpleados;
            while (intento.next != null) {
                intento = intento.next;
            }

            intento.next = nuevo;
        }
    }

    // Pedir datos a los usuarios
    public void Datos() {
        String botones[] = {"Departamento 1", "Departamento 2", "Departamento 3"};
        do {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Cual es la identificaión del empleado?"));
            if (!Repetido(id, listaEmpleados)) {
                // Ingresar datos a la lista
                ingresar(
                        id,
                        JOptionPane.showOptionDialog(
                                null,
                                "Cual es el departamento del empleado?",
                                "Departamento",
                                JOptionPane.YES_NO_CANCEL_OPTION,
                                JOptionPane.INFORMATION_MESSAGE,
                                null,
                                botones,
                                botones[0]
                        ),
                        Float.parseFloat(JOptionPane.showInputDialog("Cual es el Salario?")));
            } else {
                // Ooops, id repetido!
                JOptionPane.showMessageDialog(null, "El id ya fue previamente ingresado!");
            }

            // Ver que el usuario quiera agregar otro empleado a la lista    
        } while (JOptionPane.showConfirmDialog(
                null,
                "Desea agregar otro empleado?",
                "Ingresar otro?",
                JOptionPane.YES_NO_OPTION
        ) == JOptionPane.YES_OPTION);
    }

    // Reportar todos los empleados de la lista
    public void ReporteEmpleados() {
        // Mensaje de salida
        String output = "Empleados de la lista:";
        Empleado temp = listaEmpleados;
        if (temp != null) {
            while (temp != null) {
                output += "\n\tId de empleado " + temp.id + " Departamento: " + (temp.department + 1) + " Salario " + temp.salary;
                temp = temp.next;
            }
        } else {
            output += "No hay ningún empleado en la lista";
        }

        // Enseñar resultados finales
        JOptionPane.showMessageDialog(null, output);
        System.out.println(output);
    }

    // Buscar dato ingresado por el usuario
    public void Buscar() {
        String output = "Datos del empleado:\n";
        Empleado temp = listaEmpleados;
        // Esta vacía la lista?
        if (temp == null) {
            output = "No hay empleados en la lista!!!";
        } else {
            // Lectura de datos
            int dato = Integer.parseInt(JOptionPane.showInputDialog("Cual es el id a buscar?"));
            int counter = 0;
            // Recorrer la lista
            while (temp != null) {
                if (temp.id == dato) {
                    output += "Id: " + temp.id + " Departamento: " + (temp.department + 1) + " Salario: " + temp.salary;
                    counter++;
                    // Hemos encontrado al empleado!!!!
                    break;
                }
                temp = temp.next;
            }
            // Se encontró el empleado en la lista?
            if (counter == 0) {
                output = "No se ha encontrado el empleado con dicho ID";
            }

        }
        // Imprimir mensajes de salida
        System.out.println(output);
        JOptionPane.showMessageDialog(null, output);
    }

    // Eliminar ultimo dato
    public void EliminarDato() {
        // No nos sirve la lista vacía
        if (listaEmpleados == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else {
            listaEmpleados = listaEmpleados.next;
            JOptionPane.showMessageDialog(null, "Dato eliminado correctamente!");
            if (listaEmpleados == null) {
                JOptionPane.showMessageDialog(null, "La lista ha quedado vacía");
            } else if (listaEmpleados.next == null) {
                JOptionPane.showMessageDialog(null, "Solo queda un dato en la lista!");
            }

        }
    }

    // Reporte de estadisticas
    public void Estadisticas() {
        JOptionPane.showMessageDialog(
                null,
                "Estadisticas De la Lista Ingresada: "
                + "\n Promedio de todos los salarios de los empleados: " + prom(listaEmpleados)
                + "\n Promedio de todos los salarios de los empleados del departamento 1: " + promDep(listaEmpleados, 0)
                + "\n Promedio de todos los salarios de los empleados del departamento 2: " + promDep(listaEmpleados, 1)
                + "\n Promedio de todos los salarios de los empleados del departamento 3: " + promDep(listaEmpleados, 2)
                + "\n El salario mayor de todos los empleados: " + max(listaEmpleados)
                + "\n El salario menor de todos los empleados: " + min(listaEmpleados)
        );
    }

    // Rango de salarios
    public void Rangos() {
        Empleado temp = listaEmpleados;
        if (temp == null) { // Lista vacía
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else {
            // Obtener datos del usuario
            float min = Float.parseFloat(JOptionPane.showInputDialog("Cual es el salario minimo?"));
            float max = Float.parseFloat(JOptionPane.showInputDialog("Cual es el salario maximo?"));
            String output = "Empleados encontrados dentro del rango:";
            while (temp != null) {
                // Está el numero dentro del rango?
                if (temp.salary >= min && temp.salary <= max) {
                    output += "\nId del empleado: " + temp.id + " Departamento: " + (temp.department + 1) + " Salario: " + temp.salary;
                }
                temp = temp.next;
            }
            // Salida de reportes
            System.out.println(output);
            JOptionPane.showMessageDialog(null, output);
        }
    }

    // Buscar empleados del mismo departamento
    public void Departamentos() {
        Empleado temp = listaEmpleados;
        // Lista vacía
        if (temp == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else {
            String botones[] = {"Departamento 1", "Departamento 2", "Departamento 3"};
            // Solicitar el departamento del empleado
            int departamento
                    = JOptionPane.showOptionDialog(
                            null,
                            "Cual es el departamento a buscar?",
                            "Departamento",
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.INFORMATION_MESSAGE,
                            null,
                            botones,
                            botones[0]
                    );

            String output = "Empleados del departamento: ";
            // Recorrer la lista
            while (temp != null) {
                // Es del departamento?
                if (temp.department == departamento) {
                    output += "\nID: " + temp.id + " Departamento: " + (temp.department + 1) + " Salario: " + temp.salary;
                }
                temp = temp.next;
            }

            System.out.println(output);
            JOptionPane.showMessageDialog(null, output);
        }

    }

}
