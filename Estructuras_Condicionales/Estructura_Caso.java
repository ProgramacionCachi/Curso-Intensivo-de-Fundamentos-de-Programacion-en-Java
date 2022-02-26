package Estructuras_Condicionales;

import java.util.Scanner;

public class Estructura_Caso {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        char opcion;
        
        System.out.println("A. Suscribete a Programación con Cachi.");
        System.out.println("B. Dar Me Gusta al Curso de Fundamentos de Java.");
        System.out.print("¿Quúe Opción desea ingresar el Usuario?");
        opcion = entrada.next().charAt(0);
        
        switch (opcion){
            case 'A':
                System.out.println("Suscribete a Programación con Cachi.");
                break;
            case 'B':
                System.out.println("Dar Me Gusta al Curso de Fundamentos de Java.");
                break;
            default:
                System.out.println("Esta Opcion no se encuentra dentro del menu.");
                break;
        }
        
    }

}
