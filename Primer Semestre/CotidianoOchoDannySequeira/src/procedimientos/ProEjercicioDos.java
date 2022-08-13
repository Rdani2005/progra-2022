package procedimientos;
// @author: Danny Sequeira

import javax.swing.JOptionPane;
import listas.Ventas;

public class ProEjercicioDos {

    Ventas ventas = null;

    // -------------------------- Funciones -------------------------------
    // Averiguar promedio general
    private float prom(Ventas temp) {
        if (temp == null) {
            return 0;
        }
        int cont = 0;
        float acum = 0;
        while (temp != null) {
            cont++;
            acum += temp.monto;
            temp = temp.next;
        }

        return cont == 0 ? 0 : acum / cont;
    }

    // Averiguar promedio de tipo contado
    private float promCont(Ventas temp) {
        if (temp == null) {
            return 0;
        }
        int cont = 0;
        float acum = 0;
        while (temp != null) {
            if (temp.tipo == 1) {
                cont++;
                acum += temp.monto;
            }
            temp = temp.next;
        }

        return cont == 0 ? 0 : acum / cont;
    }

    // Averiguar promedio de tipo credito
    private float promCredi(Ventas temp) {
        if (temp == null) {
            return 0;
        }
        int cont = 0;
        float acum = 0;
        while (temp != null) {
            if (temp.tipo != 1) {
                cont++;
                acum += temp.monto;
            }
            temp = temp.next;
        }

        return cont == 0 ? 0 : acum / cont;
    }
    
    // Averiguar promedio de tipo credito
    private float mayor(Ventas temp) {
        if (temp == null) {
            return 0;
        }
        float num = temp.monto;
        while (temp != null) {
            if (temp.monto > num) {
                num = temp.monto;
            }
            temp = temp.next;
        }

        return num;
    }
    
    // Averiguar promedio de tipo credito
    private float menor(Ventas temp) {
        if (temp == null) {
            return 0;
        }
        float num = temp.monto;
        while (temp != null) {
            if (temp.monto <= num) {
                num = temp.monto;
            }
            temp = temp.next;
        }
        return num;
    }

    // Está el dato repetido o no?
    private boolean repetido(Ventas temp, int id) {
        int cont = 0;
        if (temp == null) {
            return true;
        }
        while (temp != null) {
            if (temp.numeroVenta == id) {
                cont++;
            }
            temp = temp.next;
        }

        return cont == 0;
    }

    // ------------------------- Procedimientos -----------------------------
    // metodos Privados
    // Procedimiento para agregar datos a la lista notas
    private void agregarDatos() {
        Ventas nuevo = new Ventas();

        int id = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el numero de venta")
        );
        // Están los datos repetidos?
        if (repetido(ventas, id)) {
            nuevo.numeroVenta = id;
            nuevo.monto = Float.parseFloat(
                    JOptionPane.showInputDialog(
                            "Ingrese el monto de la nota:"
                    )
            );
            nuevo.tipo = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Cual es el tipo de venta?:\n"
                            + "1. Contado\n"
                            + "2. Crédito"
                    )
            );

            // Agregar notas a la lista, dependiendo de si esta vacía o no
            if (ventas == null) {
                nuevo.next = null;
                ventas = nuevo;
            } else {
                nuevo.next = ventas;
                ventas = nuevo;
            }
        } else {
            JOptionPane.showMessageDialog(null, "El numero de venta ya fue ingresado!");
        }

    }

    // metodos publicos
    // Metodo para pedir datos constantemente hasta que el usuario diga no
    public void datosUsuario() {
        do {
            agregarDatos();
        } while (JOptionPane.showConfirmDialog(
                null,
                "Desea Ingresar otro Dato?",
                "Otro?",
                JOptionPane.YES_NO_OPTION
        ) == JOptionPane.YES_OPTION);
    }

    // Reportar lista completa
    public void ReportarLista() {
        if (ventas == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía!");
        } else {
            String output = "Ventas Realizadas: \n";
            Ventas temp = ventas;
            // Recorrer la lista
            while (temp != null) {
                output += "\nNumero de venta: " + temp.numeroVenta
                        + " Tipo de venta: " + ((temp.tipo == 1) ? " Contado " : " Crédito ")
                        + " Monto de venta: " + temp.monto;
                temp = temp.next;
            }

            JOptionPane.showMessageDialog(null, output);
            System.out.println(output);
        }
    }

    // Consultar por numero de venta
    public void consultarNum() {
        if (ventas == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else {
            Ventas temp = ventas;
            int id = Integer.parseInt(
                    JOptionPane.showInputDialog("Cual es el numero de venta a consultar?")
            );

            boolean encontrado = false;
            // Buscar el dato en la lista!!
            while (temp != null) {
                // Es el dato correcto?
                if (temp.numeroVenta == id) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Numero de venta " + temp.numeroVenta
                            + "\nTipo de venta: " + ((temp.tipo == 1) ? " Contado " : " crédito ")
                            + "\nMonto: " + temp.monto
                    );
                    encontrado = true;
                    break;
                }

                temp = temp.next;
            }
            // Se ha encontrado el dato?
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Dato no encontrado!");
            }
        }
    }

    // Eliminar ultima venta que se ha ingresado
    public void EliminarUltimo() {
        if (ventas == null) {
            JOptionPane.showMessageDialog(null, "ERROR!!!\n La lista de ventas está vacía");
        } else {
            ventas = ventas.next;
            JOptionPane.showMessageDialog(null, "Se ha eliminado la ultima venta");
            if (ventas == null) {
                JOptionPane.showMessageDialog(null, "La lista ha sido vaciada");
            }
        }
    }

    // Menu de estadisticas
    public void Estadisticas() {
        JOptionPane.showMessageDialog(
                null, 
                "Menu de Estadisticas:"
                        + "\nPromedio General de montos: " + prom(ventas) +
                        "\nPromedio de ventas de contado: " + promCont(ventas) +
                        "\nPromedio de ventas de crédito: " + promCredi(ventas) +
                        "\nMonto mayor: " + mayor(ventas) +
                        "\nMonto menor: " + menor(ventas)
        );
    }

    // Mostrar ventas en un rango indicado por el usuario
    public void Rango() {
        String output = "Datos";
        Ventas temp = ventas;
        // Esta vacía la lista?
        if (temp == null) {
            JOptionPane.showMessageDialog(null, "No se ha ingresado ninguna venta!");
        } else {
            boolean datos = false;
            float min = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor minimo"));
            float max = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor maximo"));
            // Recorrer la lista
            while (temp != null) {
                if (temp.monto >= min && temp.monto <= max) {
                    output += "\nNumero de venta " + temp.numeroVenta
                            + " Tipo de venta " + ((temp.numeroVenta == 1) ? " contado " : " crédito")
                            + " Monto ingresado: " + temp.monto;
                    datos = true;
                }

                temp = temp.next;
            }

            if (!datos) {
                JOptionPane.showMessageDialog(null, "No se encontraron niguna venta dentro del rango ingresado");
                System.out.println("No hay ventas dentro del rango!");
            } else {
                JOptionPane.showMessageDialog(null, output);
                System.out.println(output);
            }
        }
    }

    // Reporte de ventas de contado
    public void Contado() {
        Ventas temp = ventas;
        // Esta llena la lista?
        if (temp == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else {
            String output = "Ventas de Contado:\n";
            int cont = 0;
            // Recorremos la lista
            while (temp != null) {
                if (temp.tipo == 1) {
                    output += "\nVenta " + temp.numeroVenta + " Monto: " + temp.monto;
                    cont++;
                }
                temp = temp.next;
            }
            // Hay ventas de contado?
            if (cont == 0) {
                JOptionPane.showMessageDialog(null, "No se registraron ventas de tipo contado");
            } else {
                JOptionPane.showMessageDialog(null, output);
            }
        }

    }

    // Reporte de ventas de contado
    public void Credito() {
        Ventas temp = ventas;
        // Esta llena la lista?
        if (temp == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else {
            String output = "Ventas de Tipo Crédito:\n";
            int cont = 0;
            // Recorremos la lista
            while (temp != null) {
                if (temp.tipo != 1) {
                    output += "\nVenta " + temp.numeroVenta + " Monto: " + temp.monto;
                    cont++;
                }
                temp = temp.next;
            }
            // Hay ventas de contado?
            if (cont == 0) {
                JOptionPane.showMessageDialog(null, "No se registraron ventas de tipo credito");
            } else {
                JOptionPane.showMessageDialog(null, output);
            }
        }

    }

}
