
package Estrcura_Secuencial;

import java.util.Scanner;

public class Estrucutra_Secuencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //Estructuras Secuenciales.
        String nombre;
        double n1, n2, promedio;
        
        System.out.print("Ingresa el nombre del estudiante: ");
        nombre = entrada.nextLine();
        System.out.print("Ingresa la Primer Nota: ");
        n1 = entrada.nextDouble();
        System.out.print("Ingresa la Segunda Nota: ");
        n2 = entrada.nextDouble();
        
        promedio = (n1 + n2)/2;
        
        System.out.println("-------------------------------------------------------");
        System.out.println("Nombre del Alumno: " + nombre);
        System.out.println("La Calificación del Primer Parcial Fue: " + n1);
        System.out.println("La Calificación del Segundo Parcial Fue: " + n2);
        System.out.println("La Calificación Final Fue" + promedio);
    }
    
}
