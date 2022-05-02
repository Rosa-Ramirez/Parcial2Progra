package parcial2progra;

import java.util.Scanner;

public class Parcial2Progra {

    public static void main(String[] args) {
        double lado;
        int opcion;
        System.out.println("***************Menu***************");
        System.out.println("Escoja el valor de su opción");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Cubo");
        System.out.println("0. Salir");
        Scanner escaner = new Scanner(System.in);
        opcion = escaner.nextInt();
        double a = 0;
        
        Cuadrado cuadrado = new Cuadrado(a);
        Rectangulo rectangulo = new Rectangulo(a);
        Cubo cubo = new Cubo();
        
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el valor de a");
                    lado = escaner.nextDouble();
                    System.out.println("El area es: "+cuadrado.area(lado));
                    System.out.println("El perimetro es: "+cuadrado.perimetro(lado));
                    break;

                case 2:
                    System.out.println("Ingrese el valor de la altura");
                    double altura = escaner.nextDouble();
                    System.out.println("Ingrese el valor del ancho");
                    double ancho = escaner.nextDouble();
                    System.out.println("El area es: "+rectangulo.area(altura, ancho));
                    System.out.println("El perimetro es: "+rectangulo.perimetro(altura, ancho));
                    break;

                case 3:
                    System.out.println("Ingrese el valor de la longitud un lado");
                    double longitud = escaner.nextDouble();
                    System.out.println("El volumen del cubo es: "+cubo.area(longitud));
                    break;    
        }
        
        
        
    }
    
}
