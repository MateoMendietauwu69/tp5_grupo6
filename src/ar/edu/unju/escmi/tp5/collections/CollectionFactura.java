package ar.edu.unju.escmi.tp5.collections;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.escmi.tp5.dominio.Factura;

public class CollectionFactura {
    public static List<Factura> facturas = new ArrayList<>();
    private static int contadorFacturas = 1000;

    public static int getSiguienteNumero() {
        return ++contadorFacturas;
    }

    public static void agregarFactura(Factura factura) {
        facturas.add(factura);
    }

    public static Factura buscarFacturaPorNumero(int numero) {
        for (Factura f : facturas) {
            if (f.getNumeroFactura() == numero) {
                return f;
            }
        }
        return null;
    }

    public static void listarFacturas() {
        if (facturas.isEmpty()) {
            System.out.println("No hay facturas");
            return;
        }
        for (Factura f : facturas) {
            f.mostrarFactura();
        }
    }

    public static double calcularSumatoriaTotal() {
        double total = 0.0;
        for (Factura f : facturas) {
            total += f.getTotalFinal();
        }
        return total;
    }
}