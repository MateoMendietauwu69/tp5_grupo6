package ar.edu.unju.escmi.tp5.dominio;

public class ClienteMenorista extends Cliente {
    private boolean Pami;

    public ClienteMenorista(){
        super();
    }

    public ClienteMenorista(String nombre, String apellido, int DNI, String dirección, boolean Pami){
        super(nombre, apellido, DNI, dirección);
        this.Pami = Pami;
    }

    public boolean getPami(){
        return Pami;
    }

    public void setPami(){
        this.Pami = Pami;
    }

    public double calcularDescuento(double total){
        if(Pami) return total*0.10;
        return 0;
    }
}
