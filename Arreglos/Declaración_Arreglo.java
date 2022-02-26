package Arreglos;

import java.util.Scanner;

public class Declaración_Arreglo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*Array: Es una Estructura de Datos que nos permite 
        Almacenar Datos de Mismo Tipo (Int, Doble, Char, String, etc).*/
        
        int cantidad;
        
        System.out.print("Ingresa la Cantidad de Números a Almacenar: ");
        cantidad = entrada.nextInt();
        
        int [] numeros = new int [cantidad]; // Declaración de Arrelogs.
        
        for (int i = 0; i < cantidad ; i++) { //Bucle para la Entrada de Datos.
            System.out.print((i+1) + ". Ingresa los Números: ");
            numeros [i] = entrada.nextInt();
        }
        
        System.out.println("\n Los Números del Arrlog son: "); 
        for (int i = 0; i < cantidad; i++) { //Bucle para la Salida de Datos.
            System.out.print(numeros [i] + ", ");
        }
    }
}
