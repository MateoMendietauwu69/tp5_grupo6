package ar.edu.unju.escmi.tp5.dominio;

public class DetalleFactura {
    private int cantidad;
    private Producto producto;
    private double precioUnitario;
    private double importe;

    public DetalleFactura() {
    }

    public DetalleFactura(int cantidad, Producto producto, double precioUnitario) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.precioUnitario = precioUnitario;
        this.importe = cantidad * precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.importe = this.cantidad * this.precioUnitario;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
        this.importe = this.cantidad * this.precioUnitario;
    }

    public double getImporte() {
        return importe;
    }

    @Override
    public String toString() {
        return String.format("%-20s | Cant: %3d | P.Unit: $%8.2f | Subtotal: $%8.2f",
                producto.getDescripcion(), cantidad, precioUnitario, importe);
    }
}