package Figura.src;
import java.lang.Math;

public class Esfera extends Figura3D {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        // Área de la superficie de una esfera = 4 * π * r^2
        return 4 * Math.PI * Math.pow(radio, 2);
    }


    public double calcularVolumen() {
        // Volumen de la esfera = (4/3) * π * r^3
        return (4.0/3) * Math.PI * Math.pow(radio, 3);
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
    public  void mostrarinfo3D(){
        System.out.println("Tipo de Figura: " + "Esfera");
        System.out.println("Área: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    };

}