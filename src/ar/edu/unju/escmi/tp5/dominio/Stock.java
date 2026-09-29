package ar.edu.unju.escmi.tp5.dominio;

public class Stock {
    private Producto producto;
    private int cantidad;

    public Stock() {
    }

    public Stock(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
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