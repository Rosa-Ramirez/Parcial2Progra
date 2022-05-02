package parcial2progra;

import java.util.Scanner;

public class Parcial2Progra {

    public static void main(String[] args) {
        double lado;
        int opcion;
        int numero = 0;
        System.out.println("***************Menu***************");
        System.out.println("Escoja el valor de su opción");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Cubo");
        Scanner escaner = new Scanner(System.in);
        opcion = escaner.nextInt();
        double a = 0;
        
        Cuadrado cuadrado = new Cuadrado(a);
        Rectangulo rectangulo = new Rectangulo(a);
        Cubo cubo = new Cubo(a);
        
            switch (opcion){
                case 1:
                    String igual = "";
                    System.out.println("Ingrese el valor de a");
                    lado = escaner.nextDouble();
                    System.out.println("El area es: "+cuadrado.area(lado));
                    System.out.println("El perimetro es: "+cuadrado.perimetro(lado));
                    System.out.println("Nota: "+cuadrado.ladosC(numero));
                    System.out.println("Nota 2: "+cuadrado.ladosIgualesC(igual));
                    break;

                case 2:
                    System.out.println("Ingrese el valor de la altura");
                    double altura = escaner.nextDouble();
                    System.out.println("Ingrese el valor del ancho");
                    double ancho = escaner.nextDouble();
                    System.out.println("El area es: "+rectangulo.area(altura, ancho));
                    System.out.println("El perimetro es: "+rectangulo.perimetro(altura, ancho));
                    System.out.println("Nota:"+rectangulo.ladosR(numero));
                    break;

                case 3:
                    System.out.println("Ingrese el valor de la longitud un lado");
                    double longitud = escaner.nextDouble();
                    System.out.println("El volumen del cubo es: "+cubo.area(longitud));
                    System.out.println("Nota: "+cubo.ladosCubo(numero));
                    break;    
        }
        
        
        
    }
    
}
