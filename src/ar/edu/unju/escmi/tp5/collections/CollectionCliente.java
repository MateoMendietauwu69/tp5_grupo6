package ar.edu.unju.escmi.tp5.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.tp5.dominio.Cliente;
import ar.edu.unju.escmi.tp5.dominio.ClienteMayorista;
import ar.edu.unju.escmi.tp5.dominio.ClienteMenorista;

public class CollectionCliente {
    public static List<Cliente> clientes = new ArrayList<>();

    public static void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public static Cliente buscarCliente(int DNI){
        for(Cliente cliente : clientes){
            if(cliente.getDNI().equals(DNI)) return cliente;
        }
        return null;
    }

    public static void precargaClientes(){
        ClienteMayorista mayorista = new ClienteMayorista("Juan", "Perez", 30111222, "Belgrano 123", 1001);
        ClienteMenorista menorista = new ClienteMenorista("María", "Gomez", 35222333, "Alvear 456", true);
        clientes.add(mayorista);
        clientes.add(menorista);
    }
}