package parcial2progra;

public class Rectangulo extends FigurasGeometricas{
   double ancho;
   double lado;
   double area;
   int numeroLadosR;
   
   public Rectangulo(double ancho){
       this.ancho = ancho;
    }
   
    public Rectangulo(double ancho, double lado){
        this.lado = lado;
    }
    
    public String ladosR(int ladosR){
        ladosR = 4;
        return "Un rectangulo tiene: "+ladosR+" lados.";
    }
    
    @Override
    public double perimetro(double lado, double ancho) {
        double resultadoPerimetro = 2 * (lado + ancho);
        return resultadoPerimetro;
    }
    
    public double getArea(double altura, double base) {
       area = altura * base;
        return area;
    } 
}
