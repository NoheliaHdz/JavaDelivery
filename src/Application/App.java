package Application;

import Classes.*;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class App {
    public static void main(String[] args) {
        //Creacion de JavaDelivery
        Categorias con = new Categorias("Entrega de comida");
        Comercios co0 = new Comercios("Java Delivery", con);


        // Creacion de categorias y negocios
        Categorias c1 = new Categorias("Comidas Rapidas");
        Categorias c2 = new Categorias("Cafes");
        Categorias c3 = new Categorias("Comidas Bufet");
        Categorias c4 = new Categorias("Comida Vegana");
        Categorias c5 = new Categorias("Comida China");

        Comercios co1 = new Comercios("Pizzas Mia", c1);
        Comercios co2 = new Comercios("Espresso Americano", c2);
        Comercios co3 = new Comercios("Comedor Olga", c3);
        Comercios co4 = new Comercios("La Fruteria", c4);
        Comercios co5 = new Comercios("Wendy's", c1);
        Comercios co6 = new Comercios("El Dicho", c2);
        Comercios co7 = new Comercios("Comerdor Wonk", c5);
        Comercios co8 = new Comercios("El Bufed", c3);
        Comercios co9 = new Comercios("La Verdulera", c4);
        Comercios co10 = new Comercios("Restaurante Wang", c5);
        //Categorias
        c1.agregar_categoria(c1);
        c2.agregar_categoria(c2);
        c3.agregar_categoria(c3);
        c4.agregar_categoria(c4);
        c5.agregar_categoria(c5);
        //Comercios
        co1.agregar_comercio(co1);
        co2.agregar_comercio(co2);
        co3.agregar_comercio(co3);
        co4.agregar_comercio(co4);
        co5.agregar_comercio(co5);
        co6.agregar_comercio(co6);
        co7.agregar_comercio(co7);
        co8.agregar_comercio(co8);
        co9.agregar_comercio(co9);
        co10.agregar_comercio(co10);


        //Productos y registro en negocios
        Productos p1 = new Productos("Desayuno Tradicional","Contiene Huevos, frijosles, platano y queso",45.00,1);
        Productos p2 = new Productos("Hamburguesa", "Hamburgesa con papas y refresco",60.00,1);
        Productos p3 = new Productos("Carne Azada","Carne, frijoles, arroz, chimol",70.00,1);
        Productos p4 = new Productos("Cafe Americano", "Cafe negro",25.50,1);
        Productos p5 = new Productos("Latte","Cafe negro con leche", 35.40,1);
        Productos p6 = new Productos("Pizza Familiar","Pizza de 12 pedazos",199.99,1);
        Productos p7 = new Productos("Ensalada de frutas","Ensalada que contiene solo frutas",90.30,1);
        Productos p8 = new Productos("Ensalada de verduras", "Ensala de lechuga, tomates y aderezos",125.50,1);
        Productos p9 = new Productos("Arroz chino","Arroz con vegetales y carnes o mariscos",250.00,1);
        Productos p10 = new Productos("Chapsui","Fideos con vegetales y carne o mariscos",250.00,1);
        //Registro
        co1.agregar_producto(p6);
        co5.agregar_producto(p2);
        co2.agregar_producto(p4);
        co3.agregar_producto(p1);
        co4.agregar_producto(p7);
        co6.agregar_producto(p5);
        co7.agregar_producto(p9);
        co8.agregar_producto(p3);
        co9.agregar_producto(p8);
        co10.agregar_producto(p10);

        //Creacion del cliente A
        Clientes A = new Clientes("Fernando", "675553698","Colonia Suyapa");

        A.agregar_producto(co1,p2);
        A.imprimir_compra();

        //Creacion del cliente B
        Clientes B = new Clientes("Carolina","783640928","Colonia Cerro Grande");
        B.agregar_producto(co1,p6);
        B.agregar_producto(co5,p2);
        B.imprimir_compra();

        // Busqueda con la categoria que existe
        JavaDelivery ja = new JavaDelivery();
        ja.BuscarCategoria("Comidas Rapidas");

        // Busqueda con la categoria que no existe
        JavaDelivery je = new JavaDelivery();
        je.BuscarCategoria("Comida gurmet");
    }
}
