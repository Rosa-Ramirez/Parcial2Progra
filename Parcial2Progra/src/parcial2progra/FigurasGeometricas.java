package parcial2progra;
public class FigurasGeometricas {
    int ancho;
    int lado;
    
    public double area(double lado){
        double resultadoArea = lado * lado;
        return resultadoArea; 
    }
    
    public double area(double base, double altura){
        
        double resultadoArea = base * altura;
        return resultadoArea;
    }
    
    public double perimetro(double longitudLado){
        return 4*longitudLado;
    }
    public double perimetro(double longitudLado, double numero){
        numero = 4;
        double resultadoPerimetro = numero * longitudLado;
        return resultadoPerimetro;
    }
    
    
}

