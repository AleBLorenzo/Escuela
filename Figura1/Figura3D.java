package Figura1;

public abstract class  Figura3D extends Figura {

    public abstract double calcularVolumen();

    
    public void monstrarinfo  (){
        System.out.println("Tipo de Figura: " + getClass().getSimpleName());
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularVolumen());
    }
}
