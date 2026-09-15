package ar.edu.unju.escmi.tp5.dominio;

public class Producto {
    private int codigo;         
    private String descripcion;  
    private double precioUnitario;
    private int descuento;       

    // Constructor
    public Producto() {
    }

    // Constructor (parametrizado)
    public Producto(int codigo, String descripcion, double precioUnitario, int descuento) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.descuento = descuento;
    }

    // Getters y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Producto [Código=" + codigo + ", Descripción=" + descripcion 
             + ", Precio Unitario=$" + precioUnitario + ", Descuento=" + descuento + "%]";
    }
}