package Estrucutras_Repeticion;

import java.util.Scanner;

public class Estructura_Hacer_Mientras {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor = 0;
        do {
            System.out.println("1. Suscribete a Programación con Cachi.");
            System.out.println("2. Da Me Gusta a Este Vídeo.");
            System.out.print("Ingresa una Opción: (La Opción Cero Sale del Programa.)");
            valor = entrada.nextInt();
            switch (valor) {
                case 1:
                    System.out.println("----------------------------------------");
                    System.out.println("Suscribete a Programación con Cachi");
                    System.out.println("----------------------------------------");
                    break;

                case 2:
                    System.out.println("----------------------------------------");
                    System.out.println("Dar Me Gusta a Este Vídeo.");
                    System.out.println("----------------------------------------");
                    break;
                default:
                    System.out.println("----------------------------------------");
                    System.out.println("Esta Opción No Se Encuentra.");
                    System.out.println("----------------------------------------");
                    break;

            }
        } while (valor != 0);
        System.out.println("Se Termianr el Ciclo");
    }
}
