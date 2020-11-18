import producto.Fruta;
import producto.Gaseosa;
import producto.Producto;
import producto.Shampoo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static javafx.scene.input.KeyCode.L;
import static oracle.jrockit.jfr.events.Bits.longValue;

public class Main {

    public static void main(String [] args) {

        List<Producto> productos = new ArrayList<Producto>();
        cargarProductos(productos);
        imprimirProductos(productos);
        System.out.println("=============================");
        imprimirProductoMasCaro(productos);
        imprimirProductoMasBarato(productos);

    }

    public static void cargarProductos(List<Producto> productos){

        Producto cocaColaZero = new Gaseosa("Coca-Cola Zero", BigDecimal.valueOf(20), longValue(1.5), "Litros");
        Producto cocaCola = new Gaseosa("Coca-Cola", BigDecimal.valueOf(18), longValue(1.5), "Litros");
        Producto shampooSedal = new Shampoo("Shampoo Sedal", BigDecimal.valueOf(19), "ml", longValue(500));
        Producto frutillas = new Fruta("Frutillas", BigDecimal.valueOf(64), "kilo");

        productos.add(cocaColaZero);
        productos.add(cocaCola);
        productos.add(shampooSedal);
        productos.add(frutillas);
    }

    public static void imprimirProductos(List<Producto> listaProductos){

         listaProductos.forEach(producto -> System.out.println(producto.toString()));
    }

    public static void imprimirProductoMasCaro(List<Producto> listaProductos){
        String nombre = "";
        for (int i = 0; i < listaProductos.size()-1; i++) {

            int resultadoComparacion = listaProductos.get(i).compareTo(listaProductos.get(i+1));

            if(resultadoComparacion > 0){
                nombre = listaProductos.get(i).getNombre();
            } else if (resultadoComparacion < 0){
                nombre = listaProductos.get(i+1).getNombre();
            } else {
                nombre = listaProductos.get(i).getNombre();
            }
        }
        System.out.println("Producto más caro: " + nombre);
    }

    public static void imprimirProductoMasBarato(List<Producto> listaProductos){
        String nombre = "";

        for (int i = 0; i < listaProductos.size()-1; i++) {
            int resultadoComparacion = listaProductos.get(i).compareTo(listaProductos.get(i+1));

            if(resultadoComparacion > 0){
                nombre = listaProductos.get(i+1).getNombre();
            } else if (resultadoComparacion < 0){
                nombre = listaProductos.get(i).getNombre();
            } else {
                nombre = listaProductos.get(i).getNombre();
            }
        }
        System.out.println("Producto más barato: " + nombre);
    }
}
