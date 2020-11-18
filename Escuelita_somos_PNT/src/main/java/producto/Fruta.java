package producto;

import java.math.BigDecimal;

public class Fruta extends Producto {

    public Fruta (String nombre, BigDecimal precio, String unidadMedida){
        super(nombre, precio, unidadMedida);
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombre() + " /// Precio: $" + getPrecio() + " /// Unidad de venta: " + getUnidadMedida();
    }

    @Override
    public int compareTo(Producto producto){
        return this.getPrecio().compareTo(producto.getPrecio());
    }
}