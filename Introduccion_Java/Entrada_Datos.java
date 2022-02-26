package Introduccion_Java;

import java.util.Scanner;

public class Entrada_Datos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        String palabra;
        char caracter;
        
        int numero;
        double decimal;
        float flotante;
        
        System.out.print("Ingresa un Nombre: ");
        palabra = entrada.nextLine();
        System.out.print("Ingresa una Letra: ");
        caracter = entrada.next().charAt(0);
        
        System.out.print("Ingresa un Número Entero: ");
        numero = entrada.nextInt();
        System.out.print("Ingresa un número con decimales: ");
        decimal = entrada.nextDouble();
        System.out.print("Ingresa un número Flotante: ");
        flotante = entrada.nextFloat();
        
        System.out.println("----------------------------------------------------");
        System.out.println("El Nobre es: " + palabra);
        System.out.println("La Letra es: " +  caracter);
        System.out.println("El Número Entero es: " +numero);
        System.out.println("El Número Decimal es: " + decimal);
        System.out.println("El Número Flotantes es: " + flotante);
    }
}
