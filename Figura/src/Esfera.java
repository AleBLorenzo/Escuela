package Figura.src;
import java.lang.Math;


public class Esfera extends Figura3D {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
      
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularVolumen() {
     
        return (4.0/3) * Math.PI * Math.pow(radio, 3);
    }

  
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public  void mostrarinfo3D(){
        System.out.println("Tipo de Figura: " + getClass().getSimpleName());
        System.out.println("Área: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    };

}