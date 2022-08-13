package cotidianoseis.operaciones;

import javax.swing.JOptionPane;

public class OperacionesDos {

    // Operaciones a Realizar
    public int Operaciones() {
        return Integer.parseInt(JOptionPane.showInputDialog(
                "Que operación desea realizar: \n"
                + "1. Agregar Notas\n"
                + "2. Agregar notas aleatorias\n"
                + "3. Reportar Notas\n"
                + "4. Consultar notas\n"
                + "5. Modificar Notas\n"
                + "6. Reportar Estadisticas\n"
                + "7. Reportar notas en rango dado por el usuario\n"
                + "8. Reportar notas en diagonal izquierda de la matriz\n"
                + "9. Reportar notas en diagonal derecha de la matriz\n"
                + "10. Copiar y reportar matriz con notas aprobadas\n"
                + "11. Copiar y reportar matriz con notas aplazadas\n"
                + "12. Copiar y reportar matriz con notas reprobadas\n"
                + "13. Salir"
        ));
    }

    // Datos Aleatorios
    public boolean Aleatorios(float mat[][], int N, float numBus) {
        int cont = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                cont += (mat[i][j] == numBus) ? 1 : 0;
            }
        }
        return (cont != 0);
    }

    // Promedio de notas
    public float prom(float m[][], int n) {
        float acum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                acum += m[i][j];
            }
        }
        return acum / (n * n);
    }

    // Promedio de notas aprobadas
    public float promApro(float m[][], int n) {
        float acum = 0;
        int cont = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (m[i][j] >= 70) {
                    acum += m[i][j];
                    cont++;
                }
            }
        }
        return (cont == 0) ? 0 : acum / cont;
    }

    // Promedio notas Aplazadas
    public float promApla(float m[][], int n) {
        float acum = 0;
        int cont = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (m[i][j] < 70 && m[i][j] >= 50) {
                    acum += m[i][j];
                    cont++;
                }
            }
        }
        return (cont == 0) ? 0 : acum / cont;
    }

    // Promedio Notas Reprobadas
    public float promRepro(float m[][], int n) {
        float acum = 0;
        int cont = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (m[i][j] < 50) {
                    acum += m[i][j];
                    cont++;
                }
            }
        }
        return (cont == 0) ? 0 : acum / cont;
    }

    // Nota Mayor
    public float mayor(float m[][], int n) {
        float num = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                num = (num < m[i][j]) ? m[i][j] : num;
            }
        }
        return num;
    }

    // Nota Menor
    public float menor(float m[][], int n) {
        float num = m[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                num = (num > m[i][j]) ? m[i][j] : num;
            }
        }
        return num;
    }
    
    // Promedio diagonal izquierda
    public float promIzquierda(float m[][], int n) {
        float acum = 0;
        int cont = 0;
        for (int i = 0; i < n; i++) {
            acum += m[i][i];
            cont ++;
        }
        
        return (cont == 0) ? 0 : acum / cont;
    }
    
    
    // Promedio diagonal derecha
    public float promDerecha(float m[][], int n) {
        float acum = 0;
        int cont = 0;
        int aux = n - 1;
        for (int i = 0; i < n; i++) {
            acum += m[i][aux];
            cont ++;
            aux--;
        }
        
        return (cont == 0) ? 0 : acum / cont;
    }
    
}
