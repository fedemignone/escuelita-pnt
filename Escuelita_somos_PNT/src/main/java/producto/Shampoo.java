package producto;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Shampoo extends Producto {

    private Long cantidad;
    private BigDecimal precio;

    public Shampoo(String nombre, BigDecimal precio, String unidadMedida, Long cantidad){
        super(nombre, precio, unidadMedida);
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("###");
        return ("Nombre: " + getNombre() + " /// Contenido: " + df.format(getCantidad()) + getUnidadMedida() + " /// Precio: $" + getPrecio());
    }

    @Override
    public int compareTo(Producto producto){
        return this.getPrecio().compareTo(producto.getPrecio());
    }

}


