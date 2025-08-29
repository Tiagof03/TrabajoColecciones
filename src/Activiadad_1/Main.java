package Activiadad_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alumnos> alumnos = new ArrayList<>();

        Alumnos a1 = new Alumnos("Alberto", 5.6);
        Alumnos a2 = new Alumnos("Maria", 7.0);
        Alumnos a3 = new Alumnos("Juan", 8.5);
        Alumnos a4 = new Alumnos("Pepe", 6.8);
        Alumnos a5 = new Alumnos("Jose", 9.0);

        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);
        alumnos.add(a5);

        for (Alumnos a : alumnos) {
            System.out.println(a);
        }

    }
}