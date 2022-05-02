package parcial2progra;

public class Cuadrado extends FigurasGeometricas{
    double ladosIguales;
    double cuatroLados;
    String igual;
    public Cuadrado(double ladosIguales){
       this.ladosIguales = ladosIguales;
        
   }
    public Cuadrado(double ladosIguales, double cuatroLados){
       this.ladosIguales = ladosIguales;
        this.cuatroLados = cuatroLados;
   }
    
    public String ladosC(int numero){
        numero = 4;
        return "Un cuadro tiene: "+numero+" lados.";
    }
    
    public String ladosIgualesC(String igual){
        igual = "Todos los lados de un cuadro son iguales";
        this.igual = igual;
        return ""+igual;
    }

    @Override
    public double area(double lado, double eleva){
        eleva = 2;
        return Math.pow(lado, eleva);
    }
}

    
    
    

