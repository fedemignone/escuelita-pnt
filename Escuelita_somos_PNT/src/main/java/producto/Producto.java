package producto;

import java.math.BigDecimal;

public abstract class Producto implements Comparable<Producto> {

    private String nombre;
    private BigDecimal precio;
    private String unidadMedida;

    public Producto(String nombre, BigDecimal precio, String unidadMedida) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidadMedida = unidadMedida;
    }

    public String getNombre() {
        return nombre;
    }


    public String getUnidadMedida() {
        return unidadMedida;
    }


    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }


}
