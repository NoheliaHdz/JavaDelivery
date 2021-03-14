package Classes;

import java.util.ArrayList;
import java.util.List;

public class JavaDelivery {

    //public Categorias categorias;
    public List<Categorias> categoria;

    public JavaDelivery() {
        //this.categorias = cat;
        this.categoria=new ArrayList<Categorias>();
        this.categoria.addAll(categoria);
    }
    public void BuscarCategoria(String comida) {
        Categorias categoriaEncontrada;
        categoriaEncontrada = null;
        for (int i = 0; i < categoria.size(); i++) {
            if (categoria.get(i).getTipoDeComida().equals(comida)) {
                categoriaEncontrada.setTipoDeComida(comida);
                System.out.println("la categoria existe");
                break;
            }else{
                System.out.println("La categoria no existe ");
            }
        }
    }
}
