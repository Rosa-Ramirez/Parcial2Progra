package parcial2progra;

public class Cuadrado extends FigurasGeometricas{
    double ladosIguales;
    double cuatroLados;
    public Cuadrado(double ladosIguales){
       this.ladosIguales = ladosIguales;
        
   }
    //public Cuadrado(double ladosIguales, double cuatroLados){
     //   this.ladosIguales = ladosIguales;
    //    this.cuatroLados = cuatroLados;
   //}

    @Override
    public double area(double lado, double eleva){
        eleva = 2;
        return Math.pow(lado, eleva);
    }
}
