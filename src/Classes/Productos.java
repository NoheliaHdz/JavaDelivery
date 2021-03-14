package Classes;

import java.util.List;

public class Productos {
    public String nombre;
    public String descripcion;
    public double precio;
    public int cantidad;

    public Productos(String nombre, String descripcion, double precio, int cantidad){
        this.descripcion = descripcion;
        this.precio = precio;
        this.nombre = nombre;
        this.cantidad = cantidad;


    }


    public void imprimir_me(){
        System.out.println(this.nombre + "\t\t\t\t" + this.descripcion+"\t\t\t\t"+String.valueOf(this.precio));
    }
    public void imprimir(){
        System.out.println(this.nombre + "\t\t\t\t" + this.descripcion + "\t\t\t\t" +String.valueOf(this.cantidad)+"\t\t\t\t"+String.valueOf(this.precio)+"\t\t\t\t"+String.valueOf(this.cantidad*this.precio));
    }


}
