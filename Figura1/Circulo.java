package Figura1;
import java.lang.Math;


public  class Circulo extends Figura2D {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }


    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }


    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }


    /**
     * @return double return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void mostrarinfo2D () {
        System.out.println("Tipo de Figura: " + getClass().getSimpleName());
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    } ;
}