package cotidianocincodannysequeira.procesos;

import javax.swing.JOptionPane;

public class ProcesoEjercicioDos {

    // Sacar promedio de todos los datos del vector recibido por parametro
    private static float Prom(float vec[], int N) {
        int acum = 0;
        for (int i = 0; i < N; i++) {
            acum += vec[i];
        }

        return acum / N;
    }

    // Sacar promedio de las notas aprobadas del vector
    private static float promAprobados(float vec[], int N) {
        int cont = 0;
        int acum = 0;
        for (int i = 0; i < N; i++) {
            if (vec[i] >= 70) {
                cont++;
                acum += vec[i];
            }
        }
        return (cont == 0) ? 0 : acum / cont;
    }

    // Sacar promedio de notas aplazadas del vector
    private static float promAplazados(float vec[], int N) {
        int cont = 0;
        int acum = 0;
        for (int i = 0; i < N; i++) {
            if (vec[i] < 70 && vec[i] >= 50) {
                cont++;
                acum += vec[i];
            }
        }
        return (cont == 0) ? 0 : acum / cont;
    }

    // Sacar promedio de notas reprobadas del vector
    private static float promReprobados(float vec[], int N) {
        int cont = 0;
        int acum = 0;
        for (int i = 0; i < N; i++) {
            if (vec[i] < 50) {
                cont++;
                acum += vec[i];
            }
        }
        return (cont == 0) ? 0 : acum / cont;
    }

    // Sacar el dato mayor del vector
    private static float Mayor(float vec[], int N) {

        float mayor = 0;

        for (int i = 0; i < N; i++) {
            if (mayor < vec[i]) {
                mayor = vec[i];
            }
        }

        return mayor;
    }

    // Sacar el dato menor del vector recibido como parametro
    private static float Menor(float vec[], int N) {

        float menor = vec[0];

        for (int i = 0; i < N; i++) {
            if (menor > vec[i]) {
                menor = vec[i];
            }
        }

        return menor;
    }

    // Enseñar los datos del vector recibido por parametro
    public static void ReportarNotas(float vec[], int N) {
        JOptionPane.showMessageDialog(
                null,
                "El promedio total de las notas es: " + Prom(vec, N)
                + "\nEl promedio de las notas aprobadas es: " + promAprobados(vec, N)
                + "\nEl promedio de las notas aplazadas es: " + promAplazados(vec, N)
                + "\nEl promedio de las notas reprobadas es: " + promReprobados(vec, N)
                + "\nLa nota mayor es: " + Mayor(vec, N)
                + "\nLa nota menor es: " + Menor(vec, N)
        );
    }
}
