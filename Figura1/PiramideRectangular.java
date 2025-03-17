package Figura1;

public class PiramideRectangular extends Figura3D {
    private double base;    // longitud de la base
    private double ancho;   // ancho de la base
    private double altura;  // altura de la pirámide

    public PiramideRectangular(double base, double ancho, double altura) {
        this.base = base;
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
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

    @Override
    public double calcularVolumen() {
        // Volumen de una pirámide = (base * ancho * altura) / 3
        return (base * ancho * altura) / 3.0;
    }

    public void mostrarInformacion() {
        return;
    }
   
}
