
package parcial2progra;

public class Rectangulo extends FigurasGeometricas{
   //double ancho;
   // double lado;
   // double area;
    //public Rectangulo(double ancho){
       // this.ancho = ancho;
   // }
    //public Rectangulo(double ancho, double lado){
      //  this.lado = lado;
        
   // }
    @Override
    public double perimetro(double lado, double ancho) {
        double resultadoPerimetro = 2 * (lado + ancho);
        return resultadoPerimetro;
    }
    public double getArea(double altura, double base) {
       double area = altura * base;
        return area;
    }
    //public void setArea(double area) {
    //    this.area = area;
   // }   
}
