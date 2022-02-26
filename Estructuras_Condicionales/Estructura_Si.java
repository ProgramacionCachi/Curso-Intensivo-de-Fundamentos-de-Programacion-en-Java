package Estructuras_Condicionales;

import java.util.Scanner;

public class Estructura_Si {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String Usuario;
        int Matricula;
        
        System.out.print("Ingresa el Nombre del Usaraio: ");
        Usuario = entrada.nextLine();
        System.out.print("Ingresa la Matricula: ");
        Matricula = entrada.nextInt();
        
        if (Matricula == 17090515 && Usuario.equals("Mauricio")) {
            System.out.println("Inisiaste Sesion");
        }else{
            System.out.println("Contraseña o Usuario Incorrecto");
        }
    }

}
