/*
 *   Desarrolle un programa en Java que lee tres 
 *   numeros enteros, la lectura de los numeros los 
 *   debe hacer en un procedimiento. En el programa, 
 *   debe desarrollar una función de tipo entero, que 
 *   recibe como parametro tres numeros enteros que 
 *   representan los lados de un triangulo. La funcion 
 *   retorna o devuelve lo siguiente: 
 *       1. Devuelve 1 si los lados son iguales. 
 *       2. Devuelve 2, si los lados son diferentes. 
 *       3. Devuelve tres, si dos de sus lados son iguales
 *    
 *   En el programa debe desarrollar otra funcion de 
 *   tipo entero que recibe tres numeros enteros, y 
 *   devuelve el promedio de los tres numeros.
 *   Una vez desarrolladas las funciones, deben ser llamadas 
 *   y de acuerdo a lo que retornan. deben reportar en un 
 *   procedimiento el tipo de triangulo, teniendo que, si es 1, 
 *   el triangulo es equilatero, si devuelve 2, es escaleno, 
 *   y 3 es isosceles
 */
package cotidianotresdannysequeira;

import javax.swing.JOptionPane;

public class EjercicioUno {

    private int LeerDato() {
        return Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
    }
    
   private int promedio(int num1, int num2, int num3) {
       return (num1 + num2 + num3) / 3;
   }
   
   private int triangulo(int lado1, int lado2, int lado3) {
       if (lado1 == lado2 && lado1 == lado3) {
           JOptionPane.showMessageDialog(null, "El triangulo es equilatero");
           return 1;
       } else if (lado1 != lado2 && lado1 != lado3) {
           JOptionPane.showMessageDialog(null, "El triangulo es escaleno");
           return 2;
       } else {
           JOptionPane.showMessageDialog(null, "El triangulo es isoceles");
       }
       return 3;
   }
   
   private void reportar() {
       JOptionPane.showMessageDialog(null, "Primero veamos el triangulo!!");
       triangulo(LeerDato(), LeerDato(), LeerDato());
       
       JOptionPane.showMessageDialog(null, "Ahora veamos el promedio");
       JOptionPane.showMessageDialog(null, "El promedio de los numeros ingresados es: "
               + promedio(LeerDato(), LeerDato(), LeerDato()));    
   }
   
   public void RunProgram() {
       do {
           reportar();
       } while (JOptionPane.showConfirmDialog(null, "Desea procesar mas datos? (S/N)") == JOptionPane.OK_OPTION);
   }
}
