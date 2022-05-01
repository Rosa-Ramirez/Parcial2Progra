package parcial2progra;
public class FigurasGeometricas {
    double altura;
    boolean is3D;
    
    public FigurasGeometricas(double altura){
        this.altura = altura;
    }
    
    public FigurasGeometricas(double base, boolean is3D){
        this.altura = base;
        this.is3D = is3D;
    }
    
    public double area(double lado){
        if (this.is3D == true) {
            System.out.println("Es una figura en 3D");
            return 0;
        }
        double resultadoArea = lado * lado;
        return resultadoArea; 
    }
    
    public double area(double base, double altura){
        if (this.is3D == true) {
            System.out.println("Es una figura en 3D");
            return 0;
        }
        double resultadoArea = base * altura;
        return resultadoArea;
    }
    
    public double perimetro(double longitudLado){
        double resultadoPerimetro = 4 * longitudLado;
        return resultadoPerimetro;
    }
}

