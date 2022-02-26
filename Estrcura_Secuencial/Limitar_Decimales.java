package Estrcura_Secuencial;

import java.util.Scanner;

public class Limitar_Decimales {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Limitar Decimales. Método String Format.
        double Pi, Euler;
        Pi = Math.PI;
        Euler = Math.E;

        System.out.println("El Número PI es: " + String.format("%.4f", Pi));
        System.out.println("El Número de Euler es: " + String.format("%.2f", Euler));
    }

}
