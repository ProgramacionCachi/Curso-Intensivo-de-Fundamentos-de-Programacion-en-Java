package Introduccion_Java;

public class Operadores {

    public static void main(String[] args) {
        // Operadores: Artimeticos y Condicionales.
        final int a = 10;
        final int b = 5;
        
        int suma, resta, producto, division, modulo;
        
        suma = a + b;
        resta = a - b;
        producto = a * b;
        division = a / b;
        modulo = a % b;
        
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(producto);
        System.out.println(division);
        System.out.println(modulo);
        
        
        boolean igual, distinto, menor, mayor, menor_igual, mayor_igual;
        
        igual = a == b;
        distinto = a != b;
        menor = a < b;
        mayor = a > b;
        menor_igual = a <= b;
        mayor_igual = a >= b;
        
        System.out.println(igual);
        System.out.println(distinto);
        System.out.println(menor);
        System.out.println(mayor);
        System.out.println(menor_igual);
        System.out.println(mayor_igual);
    }

}
