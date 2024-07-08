package controllers;

import java.util.HashMap;

public class Mapa {
    public Mapa() {

        //<> clase generica
        HashMap <String, Integer> map = new HashMap<>();
        map.put("Manzana", 20);
        map.put("Pera", 25);
        map.put("Mandarina", 20); //no da error por el valor que se puede reperit pero la clave no se puede repetir
        map.put("Pera", 23);

        
        System.out.println(map);

        map.remove("Pera");
        System.out.println(map);

        System.out.println("Existe Mandarina --->" + map.containsKey(" Mandarina"));
        System.out.println("Existe Pera --->" + map.containsKey("P era"));
        //contains-- pregunta si es que existe pera 

        int valorManzana = map.get("Manzana");
        System.out.println("Valor de Manzana es: " + valorManzana);

        System.out.println(map.size());
        System.out.println("Esta Vacio ? " +  map.isEmpty());


        //varrido para obtener todas las claves del mapa
        System.out.println("\n Claves del Mapa");
        for(String clave : map.keySet()){
            System.out.println("- " + clave);//keyset - es colecciones de clave en una lista
        }


        System.out.println("\n Valor del Mapa");
        for(Integer value : map.values()){
            System.out.println("- " + value);
        }
        System.out.println();
        System.out.println(map);
        map.replaceAll((k,v)-> v*2); //todos los valores son =
        System.out.println(map);

        //instancia del mapa sigue creado pero no imprime nada
        map.clear();
        System.out.println("\n" + map);





    }







}
