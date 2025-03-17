package Figura.src;


public abstract class Figura2D extends Figura {
    public abstract double calcularPerimetro();

    public void monstrarinfo  (){
        System.out.println("Tipo de Figura: " + getClass().getSimpleName());
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
