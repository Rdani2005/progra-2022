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
import listas.Venta;

public class Second {

    // ------------------------- GLOBALES -----------------------------
    private Venta lista = null;

    // -------------------------- Funciones -----------------------------
    // Retornar promedio total de lo ganado en las ventas
    private float prom(Venta temp) {
        if (temp == null) {
            return 0;
        }
        int cont = 0;
        float acum = 0;
        // Recorrer la lista
        while (temp != null) {
            cont++;
            acum += temp.amount;
            temp = temp.next;
        }

        return cont == 0 ? 0 : acum / cont;
    }

    // Retornar promedio de lo ganado en ventas de tipo contado o de credito.
    private float promCont(Venta temp, int type) {
        // Retornar 0 si la lista está vacía
        if (temp == null) {
            return 0;
        }
        int cont = 0;
        float acum = 0;
        // Recorrer la lista
        while (temp != null) {
            // Comparar si es de contado o no
            if (temp.type == type) {
                cont++;
                acum += temp.amount;
            }
            temp = temp.next;
        }

        return cont == 0 ? 0 : acum / cont;
    }

    // retornar la ganancia Mayor de las ventas
    private float mayor(Venta temp) {
        // Está vacía la lista?
        if (temp == null) {
            return 0;
        }
        float num = temp.amount;
        // Recorrer la lista
        while (temp != null) {
            // Hay un numero mayor?
            if (num <= temp.amount) {
                num = temp.amount;
            }
            temp = temp.next;
        }
        return num;
    }

    // retornar la ganancia Menor de las ventas
    private float menor(Venta temp) {
        // Está vacía la lista?
        if (temp == null) {
            return 0;
        }
        float num = temp.amount;
        // Recorrer la lista
        while (temp != null) {
            // Hay un numero menor?
            if (num >= temp.amount) {
                num = temp.amount;
            }
            temp = temp.next;
        }
        return num;
    }

    // Venta repetida?
    private boolean Repetido(int id, Venta temp) {
        int count = 0;
        while (temp != null) {
            if (temp.number == id) {
                count++;
            }
            temp = temp.next;
        }
        return count != 0;
    }

    // ------------------------- Procedimientos -------------------------
    // Insertar datos a la pila
    private void Insertar(int number, int type, float amount, int zone) {
        // Agregar datos a un nuevo objeto de tipo empleado
        Venta nuevo = new Venta();
        nuevo.number = number;
        nuevo.type = type;
        nuevo.amount = amount;
        nuevo.zone = zone;
        nuevo.next = null;
        // Esta vacía la lista?
        if (lista == null) {
            lista = nuevo;
        } else {
            // Agregar datos a la lista ya creada
            Venta intento = lista;
            while (intento.next != null) {
                intento = intento.next;
            }

            intento.next = nuevo;
        }
    }

    // Pedir datos a los usuarios
    public void Datos() {
        String tipo[] = {"Contado", "Credito"};
        String zonas[] = {"Zona 1", "Zona 2", "Zona 3"};

        do {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Cual es el numero de venta?"));
            if (!Repetido(id, lista)) {
                // Ingresar datos a la lista
                Insertar(
                        id,
                        JOptionPane.showOptionDialog(
                                null,
                                "Cual es el tipo de venta?",
                                "Tipo",
                                JOptionPane.YES_NO_CANCEL_OPTION,
                                JOptionPane.INFORMATION_MESSAGE,
                                null,
                                tipo,
                                tipo[0]
                        ),
                        Float.parseFloat(JOptionPane.showInputDialog("Cual monto de la venta?")),
                        JOptionPane.showOptionDialog(
                                null,
                                "Cual es el departamento del empleado?",
                                "Departamento",
                                JOptionPane.YES_NO_CANCEL_OPTION,
                                JOptionPane.INFORMATION_MESSAGE,
                                null,
                                zonas,
                                zonas[0]
                        )
                );
            } else {
                // Ooops, id repetido!
                JOptionPane.showMessageDialog(null, "La venta ya fue previamente ingresada!");
            }

            // Ver que el usuario quiera agregar otro empleado a la lista    
        } while (JOptionPane.showConfirmDialog(
                null,
                "Desea agregar otra venta a la lista?",
                "Ingresar otro?",
                JOptionPane.YES_NO_OPTION
        ) == JOptionPane.YES_OPTION);
    }

    // Reportar todos los empleados de la lista
    public void ReporteVentas() {
        // Mensaje de salida
        String output = "Ventas Realizadas:";
        Venta temp = lista;
        if (temp != null) {
            while (temp != null) {
                output += "\n\tnumero de venta " + temp.number
                        + " Tipo de venta: " + ((temp.type == 0) ? " Contado " : " Crédito ")
                        + " Ganancia de la venta " + temp.amount
                        + " Zona de la venta: " + (temp.zone + 1);

                temp = temp.next;
            }
        } else {
            output += "No se ha registrado ninguna venta";
        }

        // Enseñar resultados finales
        JOptionPane.showMessageDialog(null, output);
        System.out.println(output);
    }

    // Buscar un dato ingresado por el usuario 
    public void Buscar() {
        String output = "Datos de la venta:\n";
        Venta temp = lista;
        // Esta vacía la lista?
        if (temp == null) {
            output = "No hay ventas en la lista!!!";
        } else {
            // Lectura de datos
            int dato = Integer.parseInt(JOptionPane.showInputDialog("Cual es el id a buscar?"));
            int counter = 0;
            // Recorrer la lista
            while (temp != null) {
                if (temp.number == dato) {
                    // Datos de la venta
                    output += "Numero de venta: " + temp.number
                            + " Tipo de venta: " + ((temp.type == 0) ? " Contado " : " Crédito ")
                            + " Ganancia: " + temp.amount
                            + " Zona de la venta: " + (temp.zone + 1);
                    counter++;
                    // Hemos encontrado la venta!!!!
                    break;
                }
                temp = temp.next;
            }
            // Se encontró la venta en la lista?
            if (counter == 0) {
                output = "No se ha encontrado ninguna venta con el numero indicado";
            }

        }
        // Imprimir mensajes de salida
        System.out.println(output);
        JOptionPane.showMessageDialog(null, output);
    }

    // Eliminar ultimo dato
    public void EliminarDato() {
        // No nos sirve la lista vacía
        if (lista == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else {
            lista = lista.next;
            JOptionPane.showMessageDialog(null, "Dato eliminado correctamente!");
            if (lista == null) {
                JOptionPane.showMessageDialog(null, "La lista ha quedado vacía");
            } else if (lista.next == null) {
                JOptionPane.showMessageDialog(null, "Solo queda un dato en la lista!");
            }

        }
    }

    // Reporte de estadisticas de las ventas
    public void Estadisticas() {
        String output = "Estadisticas de ventas: "
                + "\nPromedio total de las ventas: " + prom(lista)
                + "\nPromedio total de las ventas de tipo contado: " + promCont(lista, 0)
                + "\nPromedio total de las ventas de tipo crédito: " + promCont(lista, 1)
                + "\nVenta Mayor " + mayor(lista)
                + "\nVenta Menor " + menor(lista);
        System.out.println(output);
        JOptionPane.showMessageDialog(null, output);
    }

    // Rango de salarios
    public void Rangos() {
        Venta temp = lista;
        if (temp == null) { // Lista vacía
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else {
            // Obtener datos del usuario
            float min = Float.parseFloat(JOptionPane.showInputDialog("Cual es la ganancia minima?"));
            float max = Float.parseFloat(JOptionPane.showInputDialog("Cual es la ganancia maxima?"));
            String output = "Ventas encontradas dentro del rango:";
            while (temp != null) {
                // Está el numero dentro del rango?
                if (temp.amount >= min && temp.amount <= max) {
                    output += "\nNumero de venta: " + temp.number
                            + " Tipo de venta: " + ((temp.type == 0) ? " Contado " : " Crédito ")
                            + " Ganancia: " + temp.amount
                            + " Zona: " + (temp.zone + 1);
                }
                temp = temp.next;
            }
            // Salida de reportes
            System.out.println(output);
            JOptionPane.showMessageDialog(null, output);
        }
    }

    // Buscar ventas por su tipo
    public void TipoVenta() {
        Venta temp = lista;
        // Lista vacía
        if (temp == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else {
            String botones[] = {"Contado", "Crédito"};
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

            String output = "Ventas realizadas de tipo" + (departamento == 0 ? " Contado: " : " Crédito:");
            // Recorrer la lista
            while (temp != null) {
                // Es del departamento?
                if (temp.type == departamento) {
                    output += "\nNumero de venta: " + temp.number
                            + " Ganancia: " + temp.amount
                            + " Zona: " + temp.zone;
                }
                temp = temp.next;
            }

            System.out.println(output);
            JOptionPane.showMessageDialog(null, output);
        }

    }

    // Buscar ventas por su tipo
    public void Zona() {
        Venta temp = lista;
        // Lista vacía
        if (temp == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else {
            String botones[] = {"Zona 1", "Zona 2", "Zona 3"};
            // Solicitar el departamento del empleado
            int departamento
                    = JOptionPane.showOptionDialog(
                            null,
                            "Cual es la zona de la venta?",
                            "Zona",
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.INFORMATION_MESSAGE,
                            null,
                            botones,
                            botones[0]
                    );

            String output = "Ventas realizadas En la zona " + (departamento + 1) + ": ";
            // Recorrer la lista
            while (temp != null) {
                // Es del departamento?
                if (temp.type == departamento) {
                    output += "\nID: " + temp.number
                            + " Ganancia: " + temp.amount
                            + " Tipo " + (temp.type == 0 ? " CONTADO " : " CRÉDITO");
                }
                temp = temp.next;
            }

            System.out.println(output);
            JOptionPane.showMessageDialog(null, output);
        }

    }
}
