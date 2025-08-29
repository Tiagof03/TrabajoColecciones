package Activiadad_1;
import java.util.Objects;

public class Alumnos {
    private String nombre;
    private double nota;

    public Alumnos(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                ", nota=" + nota +
                "nombre='" + nombre + '\'' +
                '}';
    }
}