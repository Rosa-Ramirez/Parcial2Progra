
package parcial2progra;

public class Rectangulo extends FigurasGeometricas{
    double ancho;
    
    public Rectangulo(double ancho){
        this.ancho = ancho;
    }
    
    public double perimetro(double lado, double ancho){
        double resultadoPerimetro = 2*(lado + ancho);
        return resultadoPerimetro;
    }
    
}
