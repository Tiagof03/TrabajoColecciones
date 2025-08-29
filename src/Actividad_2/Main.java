package Actividad_2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("Prueba el nuevo i10", 1234);
        Producto p2 = new Producto("Prueba el nuevo Ryzen", 2345);
        Producto p3 = new Producto("Lo nuevo en tecnologia", 3456);
        Producto p4 = new Producto("Lo nuevo en carga", 4567);
        Producto p5 = new Producto("Producto dup", 1234);
        Set<Producto> setProductos = new HashSet<>();
        System.out.println("Productos al hashset...");
        setProductos.add(p1);
        setProductos.add(p2);
        setProductos.add(p3);
        setProductos.add(p4);
        setProductos.add(p5);
        for (Producto p : setProductos){
            System.out.println(p);
        }
    }
}
