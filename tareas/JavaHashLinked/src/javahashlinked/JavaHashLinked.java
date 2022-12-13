
package javahashlinked;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class JavaHashLinked {

    public static void main(String[] args) {
        
       
            //linkedHashMap
        /*
          lo que diferencia a este de otros es que se encuentra ligado 
            los datos
        */
        LinkedHashMap<Integer, String> lMap = new LinkedHashMap<Integer, String>();
        lMap.put(15, "Sandia");
        lMap.put(24, "Piña");
        lMap.put(2, "Pera");
        lMap.put(11, "Cafe");
        lMap.put(54, "Uva");
        lMap.put(16, "Durazno");
        lMap.put(34, "Guayaba");
        lMap.put(100, "Manzana");
        
        
        System.out.println(lMap);//no los imprime en algun orden
        
        //maneja y hereda los metodos basicos de Hashmap
        System.out.println(lMap.size());
        //regresa el tamaño
        
        lMap.remove(24);
        lMap.remove(15, "Sandia");
        //mantiene los metodos remove
        System.out.println(lMap);
        //ya con datos removidos
        
        System.out.println("");
        System.out.println("Metodo contains");
        
        //si contiene un dato en base a su dato
        //da verdadero o falso
        System.out.println(lMap.containsValue("Sandia"));
        System.out.println(lMap.containsValue("Manzana"));
        
        System.out.println("");
        System.out.println("\t Metodo EntrySet");
        /*
        regresa un congunto del mapa con su contenido
        funciona si quieres almacenarlo en un conjunto (set)
        */
        Set<Map.Entry<Integer, String>> frutas = lMap.entrySet();
        System.out.println(frutas);
        
        System.out.println("");
        System.out.println("\t Metodo keySet");
        //te regresa el conjunto de claves que posee el Map
        System.out.println(lMap.keySet());
        
        System.out.println("");
        System.out.println("\t Metodo values");
        /*
        regresa una collection con el contenido de 
        los datos que almacena el map
        */
        System.out.println(lMap.values());
    }
    
}
