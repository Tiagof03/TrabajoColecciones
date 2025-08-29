package Actividad_2;

import java.util.Objects;

public class Producto {

   private int Codigo;
   private String Descripcion;

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public Producto(String descripcion, int codigo) {
        Descripcion = descripcion;
        Codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Codigo == producto.Codigo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "Codigo=" + Codigo +
                ", Descripcion='" + Descripcion + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Codigo);
    }
}
