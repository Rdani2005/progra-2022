package cotidianoseis.operaciones;

import javax.swing.JOptionPane;

public class OperacionesUno {

    // Retorna la opcion ingresada por el usuario
    public int operaciones() {
        return Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Que opción desea realizar? (solo los numeros indicados)\n"
                        + "1. Agregar datos a la matriz\n"
                        + "2. Reportar datos de la matriz\n"
                        + "3. Consultar un dato de la matriz\n"
                        + "4. Modificar un dato de la matriz\n"
                        + "5. Reportar numeros pares de la matriz\n"
                        + "6. Reportar datos impares de la matriz\n"
                        + "7. Reportar Estadisticas\n"
                        + "8. Reportar datos por numeros indicados por el usuario\n"
                        + "9. Copiar y reportar elementos pares de la matriz\n"
                        + "10. Copiar y reportar elementos impares de la matriz\n"
                        + "11. Salir"
                )
        );
    }

    // Retorna el promedio de los elementos de la matriz
    public int promedio(int m[][], int N) {
        int acum = 0;
        int cont = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                acum += m[i][j];
                cont++;
            }
        }
        return acum / cont;
    }

    // Retorna el promedio de numeros pares de la matriz
    public int promPar(int m[][], int N) {
        int acum = 0;
        int cont = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                acum += (m[i][j] % 2 == 0) ? m[i][j] : 0;
                cont += (m[i][j] % 2 == 0) ? 1 : 0;
            }
        }
        return (cont == 0) ? 0 : acum / cont;
    }

    // Retorna el promedio de numeros impares de la matriz
    public int promImpar(int m[][], int N) {
        int acum = 0;
        int cont = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                acum += (m[i][j] % 2 != 0) ? m[i][j] : 0;
                cont += (m[i][j] % 2 != 0) ? 1 : 0;
            }
        }
        return (cont == 0) ? 0 : acum / cont;
    }

    // Retorna el numero menor de la matriz
    public int min(int m[][], int N) {
        int menor = m[0][0];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                menor = (menor > m[i][j]) ? m[i][j] : menor;
            }
        }

        return menor;
    }

    // Retorna el numero mayor de la matriz
    public int max(int m[][], int N) {
        int mayor = m[0][0];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mayor = (mayor < m[i][j]) ? m[i][j] : mayor;
            }
        }

        return mayor;
    }

    // Retorna el promedio de la diagonal izquierda de la matriz
    public int promIzquierda(int m[][], int N) {
        int acum = 0;
        int cont = 0;
        for (int i = 0; i < N; i++) {
            cont++;
            acum += m[i][i];
        }
        
        return acum / cont;
    }
    
    // Retorna el promedio de la diagonal derecha de la matriz
    public int promDerecha(int m[][], int N) {
        int acum = 0;
        int cont = 0;
        int aux = N - 1;
        for (int i = 0; i < N; i++) {
            cont++;
            acum += m[i][aux];
            aux--;  
        }
        return acum / cont;
    }
    
}
