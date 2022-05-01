package parcial2progra;

import java.util.Scanner;

public class Parcial2Progra {

    public static void main(String[] args) {
        int opcion;
        System.out.println("***************Menu***************");
        System.out.println("Escoja el valor de su opción");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Cubo");
        Scanner escaner = new Scanner(System.in);
        opcion = escaner.nextInt();
        
        Cuadrado cuadrado = new Cuadrado();
        
        switch (opcion){
            case 1:
                double lado = 0;
                System.out.println("Ingrese el valor de a");
                lado = escaner.nextDouble();
                System.out.println("El area es: "+cuadrado.area(lado));
        }
        
    }
    
}
