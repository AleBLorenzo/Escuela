package Figura.src;
import java.lang.Math;

public class PiramideRectangular extends Figura3D {
    private double base;    // longitud de la base
    private double ancho;   // ancho de la base
    private double altura;  // altura de la pirámide

    public PiramideRectangular(double base, double ancho, double altura) {
        this.base = base;
        this.ancho = ancho;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double calcularArea() {
        // Para la pirámide rectangular se calcula:
        // Área base = base * ancho
        // Para los cuatro triángulos laterales, se requieren dos slant heights:
        //   l1 para los lados que miden "ancho": l1 = sqrt((base/2)^2 + altura^2)
        //   l2 para los lados que miden "base": l2 = sqrt((ancho/2)^2 + altura^2)
        // Área lateral total = (base * l2 + ancho * l1)
        double l1 = Math.sqrt(Math.pow(base / 2.0, 2) + Math.pow(altura, 2));
        double l2 = Math.sqrt(Math.pow(ancho / 2.0, 2) + Math.pow(altura, 2));
        double areaBase = base * ancho;
        double areaLateral = (base * l2 + ancho * l1);
        return areaBase + areaLateral;
    }

  
    public double calcularVolumen() {
        // Volumen de una pirámide = (base * ancho * altura) / 3
        return (base * ancho * altura) / 3.0;
    }
    public  void mostrarinfo3D(){
        System.out.println("Tipo de Figura: " + "PiramideRectangular");
        System.out.println("Área: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    };

}
