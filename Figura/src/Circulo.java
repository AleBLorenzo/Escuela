package Figura.src;
import java.lang.Math;



public  class Circulo extends Figura2D {
    public double radio;

    public  Circulo (double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public void mostrarinfo2D () {
        System.out.println("Tipo de Figura: " + getClass().getSimpleName());
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    } ;
}