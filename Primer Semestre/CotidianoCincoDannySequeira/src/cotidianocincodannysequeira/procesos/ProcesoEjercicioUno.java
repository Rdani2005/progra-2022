package cotidianocincodannysequeira.procesos;

import javax.swing.JOptionPane;

public class ProcesoEjercicioUno {
    // Buscar promedios generales
    private static int proms(int vec[], int tamano) {
        int acum = 0;
        for (int i = 0; i < tamano; i++) {
            acum += vec[i];
        }

        return acum / tamano;
    }
    // Buscar promedio de numeros pares
    private static int promsPar(int vec[], int tamano) {
        int acum = 0;
        int cont = 0;
        for (int i = 0; i < tamano; i++) {
            if (vec[i] % 2 == 0) {
                acum += vec[i];
                cont++;
            }
        }
        return (cont == 0) ? 0 : acum / cont;
    }
    // Buscar promedio de numeros impares
    private static int promsImpar(int vec[], int tamano) {
        int acum = 0;
        int cont = 0;
        for (int i = 0; i < tamano; i++) {
            if (!(vec[i] % 2 == 0)) {
                acum += vec[i];
                cont++;
            }
        }
        return (cont == 0) ? 0 : acum / cont;
    }
    // Buscar dato menor
    private static int mayor(int vec[], int tamano) {
        int mayor = 0;
        for (int i = 0; i < tamano; i++) {
            if (vec[i] > mayor) {
                mayor = vec[i];
            }
        }
        return mayor;
    }
    // Buscar dato menor
    private static int menor(int vec[], int tamano) {
        int menor = vec[0];
        for (int i = 0; i < tamano; i++) {
            if (vec[i] < menor) {
                menor = vec[i];
            }
        }
        return menor;
    }
    // Buscar promedio de numeros primos
    private static int promPrimos(int vec[], int tamano) {
        int acum = 0;
        int cont = 0;

        for (int i = 0; i < tamano; i++) {
            int contPrimo = 0;
            for (int j = 1; j <= vec[i]; j++) {
                if (vec[i] % j == 0) {
                    contPrimo++;
                }
            }

            if (contPrimo == 2) {
                cont++;
                acum += vec[i];
                System.out.println(vec[i] + " es primo");
            }
        }

        return (cont == 0) ? 0 : acum / cont;
    }
    // Buscar el promedio de numeros compuestos
    private static int promCompuestos(int vec[], int tamano) {
        int acum = 0;
        int cont = 0;

        for (int i = 0; i < tamano; i++) {
            int contPrimo = 0;
            for (int j = 1; j <= vec[i]; j++) {
                if (vec[i] % j == 0) {
                    contPrimo++;
                }
            }

            if (!(contPrimo == 2)) {
                cont++;
                acum += vec[i];
                System.out.println(vec[i] + " es compuesto");
            }
        }

        return (cont == 0) ? 0 : acum / cont;
    }
    // Enseñar las estadisticas
    public static void Estadisticas(int vec[], int tamano) {
        JOptionPane.showMessageDialog(
                null,
                "Estadisticas\n"
                + "Promedio de los elementos del vector: " + proms(vec, tamano)
                + "\n Promedio de los elementos pares del vector: " + promsPar(vec, tamano)
                + "\n Promedio de los elementos impares del vector: " + promsImpar(vec, tamano)
                + "\n Elemento menor del vector: " + menor(vec, tamano)
                + "\n Elemento mayor del vector: " + mayor(vec, tamano)
                + "\n Promedio numeros primos del vector: " + promPrimos(vec, tamano)
                + "\n Promedio numeros compuestos del vector: " + promCompuestos(vec, tamano)
        );
    }

}
