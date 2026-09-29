package ar.edu.unju.escmi.tp5.collections;

import java.util.HashMap;
import java.util.Map;
import ar.edu.unju.escmi.tp5.dominio.Producto;
import ar.edu.unju.escmi.tp5.dominio.Stock;

public class CollectionProducto {
    public static Map<Integer, Producto> productos = new HashMap<>();
    public static Map<Producto, Stock> stocks = new HashMap<>();
    public static void guardarProducto(Producto producto) {
        productos.put(producto.getCodigoProducto(), producto);
    }

    public static Producto buscarProducto(int codigoProducto) {
        return productos.get(codigoProducto);
    }

    public static void precargarProducto() {
        productos.put(1001, new Producto(1001, "Fideos Knorr 500gr", 1200.0, 0));
        productos.put(1002, new Producto(1002, "Arroz Gallo Oro 1kg", 950.0, 25));
        productos.put(1003, new Producto(1003, "Aceite Cocinero 1.5lt", 3500.0, 30));
        productos.put(1004, new Producto(1004, "Yerba Taragui 1kg", 2100.0, 0));
        productos.put(1005, new Producto(1005, "Azúcar Ledesma 1kg", 1400.0, 0));
        productos.put(1006, new Producto(1006, "Celusal 1/2Kg", 600.0, 0));
        // El producto consta de: codigo, descripcion, precio, descuento, stock
    }

    public static void precargarStock() {
        for (Producto producto : productos.values()) {
            stocks.put(producto, new Stock(producto, 5000));
        }
    }

    public static void mostrarStock() {
        if (productos.isEmpty()) System.out.println("No hay productos en stock.");
        else {
            System.out.println("===== PRODUCTOS Y STOCK =====");
            for (Producto producto : productos.values()) {
                System.out.println(
                    "Código: " + producto.getCodigoProducto()
                    + " | Producto: " + producto.getDescripcion()
                    + " | Precio: $" + producto.getPrecio()
                    + " | Descuento: " + producto.getDescuento() + "%"
                    + " | Stock: " + stocks.get(producto).getCantidad() + " unidades"
                );
            }
        }
    }   
}
