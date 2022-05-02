
package parcial2progra;
public class Cubo extends FigurasGeometricas {
    boolean is3D;
    double base;
    double numeroLados = 6;
    
    public Cubo(double numeroLados){
        this.numeroLados = numeroLados;
    }
    
    public Cubo(double base, boolean is3D){
        this.base = base;
        this.is3D = is3D;
    }
    public double figura(boolean is3D){
       if (this.is3D == true) {
            System.out.println("Es una figura en 3D");        
        }
       return 0;
    }
    public String ladosCubo(int lados){
        this.numeroLados = lados;
        lados = 6;
        return "un cubo tiene: "+lados+" lados.";
    }
    
    @Override
    public double area(double lado) {
        return Math.pow(lado, 3);
    }
}
