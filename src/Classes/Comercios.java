package Classes;

import java.util.ArrayList;
import java.util.List;

public class Comercios {
    public String negocio;
    public List<Productos> menu;
    public Categorias categoria;
    public List<Comercios> comercio;
    public Comercios(String negocio, Categorias categoria){
        this.categoria = categoria;
        this.negocio = negocio;
        this.menu = new ArrayList<Productos>();
        this.comercio = new ArrayList<Comercios>();

    }

    public void agregar_comercio(Comercios co){
        this.comercio.add(co);
    }

    public void quitar_comercio(Comercios c){
        this.comercio.remove(c);
    }

    public void agregar_producto(Productos pd){
        this.menu.add(pd);
    }

    public void quitar_productos(Productos pds){
        this.menu.remove(pds);
    }

    public void imprimir_menu(){
        System.out.println("COMERCIO: "+ this.negocio + "CATEGORIA: "+this.categoria);
        System.out.println("\t\t\t\t\t MENU");
        System.out.println("NOMBRE \t\t\t\t DESCRIPCION \t\t\t\t PRECIO");
        for(Productos pro:this.menu){
            pro.imprimir_me();
        }
        System.out.println("\n");
    }

    public void imprimir_orden(){
        System.out.println("NOMBRE \t\t\t\t DESCRIPCION \t\t\t\t CANTIDAD \t\t\t\t PRECIO \t\t\t\t TOTAL");
        for(Productos p: this.menu){
            p.imprimir();
        }
    }

}
