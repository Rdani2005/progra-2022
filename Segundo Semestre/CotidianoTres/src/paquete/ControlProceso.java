package paquete;

public class ControlProceso {

    // Retornar Factorial
    public int Factorial(int n) {
        return (n == 1) ? 1 : n * Factorial(n - 1);
    }
    
    // Par o Impar
    public int Par(int n) {
        return (n % 2 == 0) ? 0 : 1;
    }

    // Primo o no
    public int Primo(int n) {
        int counter = 0;

        for (int i = 1; i <= n; i++) {
            counter = (n % i == 0) ? counter + 1 : counter;
        }

        return (counter <= 2) ? 0 : 1;
    }
}
