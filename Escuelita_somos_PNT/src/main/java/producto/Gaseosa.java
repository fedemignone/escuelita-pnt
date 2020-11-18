package producto;

import java.math.BigDecimal;

public class Gaseosa extends Producto {

    public Long litros;

    public Gaseosa (String nombre, BigDecimal precio, Long litros, String unidadMedida){
        super(nombre, precio, unidadMedida);
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(Long litros) {
        this.litros = litros;
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombre() + " /// Litros: " + getLitros() + " /// Precio: $" + getPrecio();
    }

    @Override
    public int compareTo(Producto producto){
        return this.getPrecio().compareTo(producto.getPrecio());
    }

}


