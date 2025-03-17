package Figura.src;

public class Esfera extends Figura3D {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        // Área de la superficie de una esfera = 4 * π * r^2
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularVolumen() {
        // Volumen de la esfera = (4/3) * π * r^3
        return (4.0/3) * Math.PI * Math.pow(radio, 3);
    }
    
    public void mostrarInformacion() {
        return;
    }
}