package ar.edu.unju.escmi.tp5.dominio;

public class ClienteMayorista extends Cliente {
    private int codigoCliente;

    public ClienteMayorista(){
        super();
    }

    public ClienteMayorista(String nombre, String apellido, int DNI, String dirección, int codigoCliente){
        super(nombre, apellido, DNI, dirección);
        this.codigoCliente = codigoCliente;
    }

    public getcodigoCliente(){
        return codigoCliente;
    }

    public setCodigoCliente(int codigoCliente){
        this.codigoCliente = codigoCliente;
    }

    public int calcularUnidades(int cantidad){
        return cantidad*10;
    }

    public double PrecioMayorista(double precioUnitario){
        return precioUnitario*0.5;
    }
}
