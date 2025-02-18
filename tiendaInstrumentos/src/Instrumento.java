package tiendaInstrumentos.src;

import java.time.LocalDate;


/**
 * Clase abstracta que representa un instrumento musical.
 */
public abstract class Instrumento {
    private double precio;
    private String marca;
    private String modelo;
    private String dniComprador;
    private String nombreComprador;
    private LocalDate fechaCompra;
    private LocalDate fechaFabricacion;
    private static int stock = 0;

    /**
     * Constructor por defecto.
     */
    public Instrumento() {
        this.precio = 100.0;
        this.marca = "Yamaha";
        this.modelo = "Modelo Básico";
        this.fechaFabricacion = LocalDate.now().minusYears(1);
        stock++;
    }

    /**
     * Constructor con todos los atributos.
     */
    public Instrumento(double precio, String marca, String modelo, String dniComprador, 
                       String nombreComprador, LocalDate fechaCompra, LocalDate fechaFabricacion) {
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
        this.dniComprador = dniComprador;
        this.nombreComprador = nombreComprador;
        this.fechaCompra = fechaCompra;
        this.fechaFabricacion = fechaFabricacion;
        stock++;
    }

    /**
     * Constructor sin datos de compra.
     */
    public Instrumento(double precio, String marca, String modelo, LocalDate fechaFabricacion) {
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
        stock++;
    }

    /**
     * Devuelve los detalles del instrumento.
     */
    public String getInfo() {
    
       System.out.println("Precio: " + precio);
       System.out.println("Marca: " + marca);
       System.out.println("Modelo: " + modelo);
       System.out.println("DNI del comprador: " + dniComprador);
       System.out.println("Nombre del comprador: " + nombreComprador);
       System.out.println("Fecha de compra: " + fechaCompra);
       System.out.println("Fecha de fabricación: " + fechaFabricacion);
       System.out.println("Stock: " + stock);
       return "";
    }

    
    /**
     * Calcula los años que tiene el instrumento.
     */
    public int getAnyos() {
        int anos = LocalDate.now().getYear() - fechaFabricacion.getYear()  ;
        return anos;
    }

    /**
     * Comprueba si el instrumento está disponible.
     */
    public boolean estaDisponible() {
        return fechaCompra == null;
    }

    /**
     * Valida un DNI español.
     */
    public static boolean esDniValido(String dni) {
        if (dni == null || dni.length() != 9) {
            return false;
        }
        
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        String numeros = dni.substring(0, 8);
        char letraProporcionada = Character.toUpperCase(dni.charAt(8));
        
        try {
            int numero = Integer.parseInt(numeros);
            char letraCalculada = letras.charAt(numero % 23);
            return letraProporcionada == letraCalculada;
        } catch (NumberFormatException e) {
            return false;
        }
        }

    /**
     * Realiza la compra del instrumento.
     */
    public void comprar(String dni, String nombre, LocalDate fechaCompra) {
        if (esDniValido(dni)) {
            this.dniComprador = dni;
            this.nombreComprador = nombre;
            this.fechaCompra = fechaCompra;
            System.out.println("Compra realizada con éxito.");
        } else {
            System.out.println("DNI inválido. No se pudo realizar la compra.");
        }
    }

    /**
     * Método abstracto para simular el sonido del instrumento.
     */
    public abstract void sonar();

  
    public static int getStock() {
        return stock;
    }


    /**
     * @return double return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return Marca return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return String return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return String return the dniComprador
     */
    public String getDniComprador() {
        return dniComprador;
    }

    /**
     * @param dniComprador the dniComprador to set
     */
    public void setDniComprador(String dniComprador) {
        this.dniComprador = dniComprador;
    }

    /**
     * @return String return the nombreComprador
     */
    public String getNombreComprador() {
        return nombreComprador;
    }

    /**
     * @param nombreComprador the nombreComprador to set
     */
    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    /**
     * @return LocalDate return the fechaCompra
     */
    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    /**
     * @param fechaCompra the fechaCompra to set
     */
    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    /**
     * @return LocalDate return the fechaFabricacion
     */
    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    /**
     * @param fechaFabricacion the fechaFabricacion to set
     */
    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }
   
}