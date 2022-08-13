package procedimientos;

import javax.swing.JOptionPane;
import listas.Notas;

public class ProEjercicioUno {

    private Notas notas = null;

    // ----------------------------- Funciones -------------------------------
    // Promedio de todas las notas
    private float prom(Notas temp) {
        if (temp == null) {
            return 0;
        }
        int cont = 0;
        float acum = 0;
        while (temp != null) {
            acum += temp.nota;
            cont++;
            temp = temp.next;
        }

        return (cont == 0) ? 0 : acum / cont;
    }

    // Promedio de todas las notas aprobadas
    private float promApro(Notas temp) {
        if (temp == null) {
            return 0;
        }
        int cont = 0;
        float acum = 0;
        while (temp != null) {
            if (temp.nota >= 70) {
                acum += temp.nota;
                cont++;
            }
            temp = temp.next;
        }

        return (cont == 0) ? 0 : acum / cont;
    }

    // Promedio de todas las notas aplazadas
    private float promApla(Notas temp) {
        if (temp == null) {
            return 0;
        }
        int cont = 0;
        float acum = 0;
        while (temp != null) {
            if (temp.nota < 70 && temp.nota >= 50) {
                acum += temp.nota;
                cont++;
            }
            temp = temp.next;
        }

        return (cont == 0) ? 0 : acum / cont;
    }

    // Promedio de todas las notas aplazadas
    private float promRepro(Notas temp) {
        if (temp == null) {
            return 0;
        }
        int cont = 0;
        float acum = 0;
        while (temp != null) {
            if (temp.nota < 50) {
                acum += temp.nota;
                cont++;
            }
            temp = temp.next;
        }

        return (cont == 0) ? 0 : acum / cont;
    }
    
    // Nota Mayor
    private float mayor(Notas temp) {
        if (temp == null) return 0;
        float nota = temp.nota;
        
        while (temp != null) {
            if (nota < temp.nota) nota = temp.nota;
            temp = temp.next;
        }
        
        return nota;
    }
    
        // Nota Menor
    private float menor(Notas temp) {
        if (temp == null) return 0;
        float nota = temp.nota;
        
        while (temp != null) {
            if (nota > temp.nota) nota = temp.nota;
            temp = temp.next;
        }
        
        return nota;
    }

    // ------------------------- Procedimientos -----------------------------
    // metodos Privados
    // Procedimiento para agregar datos a la lista notas
    private void agregarDatos() {
        Notas nuevo = new Notas();

        nuevo.nota = Float.parseFloat(
                JOptionPane.showInputDialog("Ingrese la nota")
        );
        // Comparar notas, y enseñar su condicion
        if (nuevo.nota >= 70) { // Nota aprobada
            JOptionPane.showMessageDialog(null, "Nota aprobada");
        } else if (nuevo.nota < 70 && nuevo.nota >= 50) { // Nota reprobada
            JOptionPane.showMessageDialog(null, "Nota Aplazada");
        } else { // Nota reprobada 
            JOptionPane.showMessageDialog(null, "Nota reprobada");
        }
        // Agregar notas a la lista, dependiendo de si esta vacía o no
        if (notas == null) {
            nuevo.next = null;
            notas = nuevo;
        } else {
            nuevo.next = notas;
            notas = nuevo;
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

    // Enseñar datos de la lista
    public void EnseñarLista() {
        Notas temp = notas;
        String output = "Notas de la lista:";
        int counter = 1;
        // Está la lista vacia?
        if (temp == null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacía!");
            System.out.println("Error!!! Lista Vacía");
        } else {
            // Recorrer la lista para mostrar sus datos
            while (temp != null) {
                output += "\nValor de la nota " + counter + ": " + temp.nota;
                temp = temp.next;
                counter++;
            }
            // Mostrar info
            JOptionPane.showMessageDialog(null, output);
            System.out.println(output);
        }
    }

    // Metodo para consultar la presencia de una nota
    public void ConsultarNota() {
        // Cual es el dato a buscar?
        float buscar = Float.parseFloat(
                JOptionPane.showInputDialog("Cual es el numero a buscar?")
        );
        // Variables interesantes
        int cont = 1;
        int encontrado = 0;
        Notas temp = notas;

        if (temp == null) {
            JOptionPane.showMessageDialog(null, "Lista vacía");
        }
        // Recorremos la lista?
        while (temp != null) {
            if (temp.nota == buscar) {
                encontrado++;
                break;
            }
            cont++;
        }
        // Ha sido encontrada la nota?
        if (encontrado != 0) {
            JOptionPane.showMessageDialog(null, "Nota encontrada en la posición: " + cont);
        } else {
            JOptionPane.showMessageDialog(null, "Nota no encontrada");
        }
    }

    // Metodo para modificar una nota ingresada por el usuario
    public void ModificarNota() {
        Notas temp = notas;
        int encontrado = 0;
        if (temp == null) {
            JOptionPane.showMessageDialog(null, "Lista vacía");
        } else {
            float buscar = Float.parseFloat(
                    JOptionPane.showInputDialog("Cual es la nota a modificar?")
            );

            while (temp != null) {
                // Hemos encontrado la nota?
                if (buscar == temp.nota) {
                    encontrado++;
                    JOptionPane.showMessageDialog(null, "Nota encontrada");
                    float dato = Float.parseFloat(
                            JOptionPane.showInputDialog("Cual es la nueva nota?")
                    );
                    // El usuario desea cambiar la nota?
                    if (JOptionPane.showConfirmDialog(
                            null,
                            "Desea cambiar el valor de: " + temp.nota + " por " + dato,
                            "Cambiamos?",
                            JOptionPane.YES_NO_OPTION
                    )
                            == JOptionPane.YES_OPTION) {
                        temp.nota = dato;

                    } else {
                        JOptionPane.showMessageDialog(null, "No se cambió el dato!");
                    }
                    break; // Rompemos el ciclo
                }

                temp = temp.next;
            }
            // No se encontró el dato
            if (encontrado == 0) {
                JOptionPane.showMessageDialog(null, "Dato no encontrado");
            }
        }
    }

    // Metodo para reportar estadisticas
    public void Estadisticas() {
        // TODO: Code logic from this method
        JOptionPane.showMessageDialog(
                null, 
                "Estadisticas:"
                        + "\nPromedio de las notas: " + prom(notas) +
                        "\nPromedio de notas aprobadas: " + promApro(notas) +
                        "\nPromedio de notas Aplazadas: " + promApla(notas) +
                        "\nPromedio de notas Reprobadas: " + promRepro(notas) +
                        "\nNota Mayor: " + mayor(notas) +
                        "\nNota Menor: " + menor(notas)
        );
    }

    // Metodo para enseñar los datos dentro del rango de datos rindados por el usuario
    public void ReporteRango() {
        Notas temp = notas;
        int cont = 0;
        int encontrado = 0;
        String output = "Rango de Notas";

        if (temp == null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacía");
        } else {
            float mayor = Float.parseFloat(
                    JOptionPane.showInputDialog("Cual es el numero mayor del rango?")
            );

            float menor = Float.parseFloat(
                    JOptionPane.showInputDialog("Cual es el numero menor del rango?")
            );

            while (temp != null) {
                cont++;
                if (mayor >= temp.nota && menor < temp.nota) {
                    output += "\nPosición " + cont + " nota: " + temp.nota;
                    encontrado++;
                }

                temp = temp.next;
            }
            if (encontrado == 0) {
                JOptionPane.showMessageDialog(null, "No se encontró ningun dato dentro del rango brindado");
            } else {
                JOptionPane.showMessageDialog(null, output);
            }

        }
    }

    // Metodo para enseñar las notas aprobadas
    public void Aprobadas() {
        Notas temp = notas;
        String output = "Notas Aprobadas:\n";
        int cont = 0;
        int encontrado = 0;
        if (temp == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else {
            while (temp != null) {
                cont++;
                if (temp.nota >= 70) {
                    output += "\nPosición: " + cont + "Nota: " + temp.nota;
                    encontrado++;
                }
                temp = temp.next;
            }

            if (encontrado == 0) {
                JOptionPane.showMessageDialog(null, "No hay notas aprobadas!");
            } else {
                JOptionPane.showMessageDialog(null, output);
            }
        }
    }

    // Metodo para enseñar las notas aplazadas
    public void Aplazadas() {
        Notas temp = notas;
        String output = "Notas Aplazadas:\n";
        int cont = 0;
        int encontrado = 0;
        if (temp == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else {
            while (temp != null) {
                cont++;
                if (temp.nota < 70 && temp.nota >= 50) {
                    output += "\nPosición: " + cont + "Nota: " + temp.nota;
                    encontrado++;
                }
                temp = temp.next;
            }

            if (encontrado == 0) {
                JOptionPane.showMessageDialog(null, "No hay notas aplazadas!");
            } else {
                JOptionPane.showMessageDialog(null, output);
            }
        }
    }

    // Metodo para enseñar las notas reprobadas
    public void Reprobadas() {
        Notas temp = notas;
        String output = "Notas Reprobadas:\n";
        int cont = 0;
        int encontrado = 0;
        if (temp == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else {
            while (temp != null) {
                cont++;
                if (temp.nota < 50) {
                    output += "\nPosición: " + cont + " Nota: " + temp.nota;
                    encontrado++;
                }
                temp = temp.next;
            }

            if (encontrado == 0) {
                JOptionPane.showMessageDialog(null, "No hay notas Reprobadas!");
            } else {
                JOptionPane.showMessageDialog(null, output);
            }
        }
    }

}
