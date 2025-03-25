package Figura.src;
import java.lang.Math;

public  class Rectangulo extends Figura2D {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

 
    public double calcularArea() {
        return base * altura;
    }

  
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
    public void mostrarinfo2D () {
        System.out.println("Tipo de Figura: " + "Rectangulo");
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    } ;

}