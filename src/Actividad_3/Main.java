package Actividad_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Curso> mapacursos = new HashMap<>();

        Curso c1 = new Curso("Sistemas Operativos", "Roco");
        Curso c2 = new Curso("Html principiantes", "Chirino");
        Curso c3 = new Curso("Java", "Rigoni");
        Curso c4 = new Curso("Base de Datos", "Alberto");

        mapacursos.put("A1",c1);
        mapacursos.put("A2",c2);
        mapacursos.put("A3",c3);
        mapacursos.put("A4",c4);

        System.out.println(mapacursos.get("A1"));
        System.out.println(mapacursos.get("A2"));
        System.out.println(mapacursos.get("A3"));
        System.out.println(mapacursos.get("A4"));

        for (Map.Entry<String, Curso> entry : mapacursos.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }
}