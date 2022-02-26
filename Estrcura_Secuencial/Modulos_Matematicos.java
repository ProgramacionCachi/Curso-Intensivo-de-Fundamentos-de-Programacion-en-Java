
package Estrcura_Secuencial;

import java.util.Scanner;

public class Modulos_Matematicos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //Modulos matemáticos: Raiz Cuadrara, Elevar a un Exponente, Seno, Coseno, Tangente.
        double numero;
        
        System.out.print("Ingresa un número: ");
        numero = entrada.nextDouble();
        
        double raiz, exponente, sen, cos, tan;
        
        raiz = Math.sqrt(numero); // Raíz Cuadrada.
        exponente = Math.pow(numero, 2);
        sen = Math.sin(numero);
        cos = Math.cos(numero);
        tan = Math.tan(numero);
        
        System.out.println("La Raíz Cuadrada es: " + raiz);
        System.out.println("El número Elevado al cuadrad es: " + exponente);
        System.out.println("El Seno es: " + sen);
        System.out.println("El Coseno es: " + cos);
        System.out.println("La Tangente es: " + tan);
        
        double Pi, Euler;
        
        Pi = Math.PI;
        Euler = Math.E;
        
        System.out.println("El Número PI es: " + Pi);
        System.out.println("El Número de Euler es: " + Euler);
    }
    
}
