package org.example;


   import java.util.ArrayList;
import java.util.List;

    public class ListaEstructuraDatos {
        public static void main(String[] args) {
            // Creamos una nueva lista utilizando la interfaz List y la implementación ArrayList
            List<String> lista = new ArrayList<>();

            // Agregar elementos a la lista
            lista.add("Elemento 1"); // Agregamos el elemento "Elemento 1" a la lista
            lista.add("Elemento 2"); // Agregamos el elemento "Elemento 2" a la lista
            lista.add("Elemento 3"); // Agregamos el elemento "Elemento 3" a la lista

            // Imprimir la lista
            System.out.println("Elementos en la lista:");
            // Iteramos sobre la lista utilizando un bucle for-each
            for (String elemento : lista) {
                System.out.println(elemento); // Imprimimos cada elemento de la lista
            }
        }
    }