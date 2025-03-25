package Figura1;


public class Main {
    public static void main(String[] args) {
        // Figura 2D: Círculo
        Circulo circulo = new Circulo(5); // radio = 5
        circulo.mostrarinfo2D();
        System.out.println();

        // Figura 2D: Rectángulo
        Rectangulo rectangulo = new Rectangulo(4, 6); // base = 4, altura = 6
        rectangulo.mostrarinfo2D();
        System.out.println();

        // Figura 3D: Esfera
        Esfera esfera = new Esfera(3); // radio = 3
        esfera.mostrarinfo3D();
        System.out.println();

        // Figura 3D: Pirámide Rectangular
        PiramideRectangular piramide = new PiramideRectangular(4, 6, 5); // base = 4, ancho = 6, altura = 5
        piramide.mostrarinfo3D();
    }
}