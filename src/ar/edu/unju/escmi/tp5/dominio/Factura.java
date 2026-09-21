package ar.edu.unju.escmi.tp5.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private int numeroFactura;
    private LocalDate fecha;
    private Cliente cliente;
    private List<DetalleFactura> detalles;
    private double totalFinal;

    public Factura() {
        this.detalles = new ArrayList<>();
        this.totalFinal = 0.0;
    }

    public Factura(int numeroFactura, LocalDate fecha, Cliente cliente) {
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.cliente = cliente;
        this.detalles = new ArrayList<>();
        this.totalFinal = 0.0;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<DetalleFactura> getDetalles() {
        return detalles;
    }

    public double getTotalFinal() {
        return totalFinal;
    }

    public void agregarDetalle(DetalleFactura detalle) {
        detalles.add(detalle);
        this.totalFinal += detalle.getImporte();
    }

    public void mostrarFactura() {
        System.out.println("==================================================");
        System.out.println("Factura N°: " + numeroFactura + " | Fecha: " + fecha);
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido() + " (DNI: " + cliente.getDni() + ")");
        System.out.println("--------------------------------------------------");
        for (DetalleFactura d : detalles) {
            System.out.println(d);
        }
        System.out.println("--------------------------------------------------");
        System.out.printf("Total: $%.2f\n", totalFinal);
        System.out.println("==================================================");
    }
}