package Classes;

import java.util.ArrayList;
import java.util.List;

public class Categorias {
    public String tipoDeComida;
    public List<Categorias> categoria;

    public Categorias(String comida){
        this.tipoDeComida = comida;
        this.categoria = new ArrayList<Categorias>();
    }

    public String getTipoDeComida() {
        return tipoDeComida;
    }

    public void setTipoDeComida(String tipoDeComida) {
        this.tipoDeComida = tipoDeComida;
    }

    public void agregar_categoria(Categorias ca){
        this.categoria.add(ca);
    }
    public void quitar_categoria(Categorias cat){
        this.categoria.remove(cat);
    }


}
