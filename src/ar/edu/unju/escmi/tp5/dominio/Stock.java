package ar.edu.unju.escmi.tp5.dominio;

public class Stock {
    private Producto producto;
    private int cantidad;

    // Constructor 
    public Stock() {
    }

    // Constructor (parametrizado)
    public Stock(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // Getters y Setters
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void actualizarStock(int cantidadVendida) {
        this.cantidad -= cantidadVendida;
    }

    @Override
    public String toString() {
        return "Stock [" + producto.getDescripcion() + " | Disponibles: " + cantidad + " unidades]";
    }
}