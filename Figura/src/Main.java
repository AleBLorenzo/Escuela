package Figura.src;


public class Main {
    public static void main (String[] args) {
      
        Circulo circulo1 = new Circulo(5.3); 
        circulo1.mostrarinfo2D();
        System.out.println();

        Rectangulo rectangulo1 = new Rectangulo(4, 6);
        rectangulo1.mostrarinfo2D();
        System.out.println();

        Esfera esfera1 = new Esfera(3);
        esfera1.mostrarinfo3D();
        System.out.println();

        PiramideRectangular piramide1 = new PiramideRectangular(4, 6, 5);
        piramide1.mostrarinfo3D();
        System.out.println();
 
    }
}