package ar.edu.unju.escmi.tp5.dominio;

public abstract class Cliente {
    private String nombre;
    private String apellido;
    private int DNI;
    private String dirección;

    public Cliente(){

    }

    public Cliente(String nombre, String apellido, int DNI, String dirección){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.dirección = dirección;
    }

    public String getnombre(){
        return nombre;
    }

    public String getapellido(){
        return apellido;
    }

    public int getDNI(){
        return DNI;
    }

    public String getdirección(){
        return dirección;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public void setapellido(String apellido){
        this.apellido = apellido;
    }

    public void setDNI(int DNI){
        this.DNI = DNI;
    }

    public void setdirección(String dirección){
        this.dirección = dirección;
    }
}
