package Figura.src;
import Figura.src.Rectangulo;
import Figura.src.PiramideRectangular;

public class Main {
    public static void main(String[] args) {
        // Figura 2D: Círculo
        Circulo circulo = new Circulo(5); // radio = 5
        circulo.mostrarInformacion();
        System.out.println();

        // Figura 2D: Rectángulo
        Rectangulo rectangulo = new Rectangulo(4, 6); // base = 4, altura = 6
        rectangulo.mostrarInformacion();
        System.out.println();

        // Figura 3D: Esfera
        Esfera esfera = new Esfera(3); // radio = 3
        esfera.mostrarInformacion();
        System.out.println();

        // Figura 3D: Pirámide Rectangular
        PiramideRectangular piramide = new PiramideRectangular(4, 6, 5); // base = 4, ancho = 6, altura = 5
        piramide.mostrarInformacion();
    }
}