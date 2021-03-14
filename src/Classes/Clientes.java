package Classes;

import java.util.ArrayList;
import java.util.List;

public class Clientes {
    public String nombre;
    public int id;
    public String telefono;
    public String direccion;
    public List<Comercios> compra;
    public List<Productos> consumo;

    public Clientes(String nombre, String telefono, String direccion){
        this.nombre = nombre;
        this.id =  (int)(Math.random() * (5000 - 1000 + 1) + 1000);
        this.direccion = direccion;
        this.telefono = telefono;
        this.compra = new ArrayList<Comercios>();
        this.consumo = new ArrayList<Productos>();
    }
    public void agregar_producto(Comercios c, Productos po){
        this.compra.add(c);
    }

    public void quitar_producto(Comercios co,Productos p){
        this.compra.remove(co);
    }

    public void cancelar_compra(){
        this.compra.removeAll(this.compra);
    }

    public void imprimir_compra(){
        System.out.println("NOMBRE DEL CLIENTE: "+this.nombre+"\n"+"DIRECCION: "+this.direccion+"\n"+"ID CLIENTE: "+String.valueOf(this.id));
        for(Comercios c:this.compra){
            c.imprimir_orden();
        }
        int comerci = this.compra.size();
        int cargo = 70*comerci;
        System.out.println("EL CARGO POR UTILIZAR JAVADELIVERY ES: "+ cargo);
        System.out.println("\n");

    }


}
