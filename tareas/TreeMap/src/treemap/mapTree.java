
package treemap;

import java.util.Map;
import java.util.TreeMap;

public class mapTree {

 
    public static void main(String[] args) {
        
        //Treemap
        /*
        TreeMap es muy similar a HashMap la diferencia notoria
        es que los ordena en base a la logica del arbol binario
        osease de menor a mayor en caso de numeros y alfabetico
        para letras
        */
        
        TreeMap<Integer, String> mapaTree = new TreeMap<Integer, String>(); 
        //al igual que HashMap pide clave y dato
        mapaTree.put(38, "Treinta y ocho");
        mapaTree.put(40, "cuarenta");
        mapaTree.put(12, "doce");
        mapaTree.put(15, "quince");
        //posee el mismo metodo put para colocar datos
        
        System.out.println("Impresion de los datos");
        System.out.println(mapaTree);//los imprimira en orden
        
        //posee el metodo que te da la lista de llaves o claves
        System.out.println("");
        System.out.print("Claves: ");
        System.out.println(mapaTree.keySet());
        
        System.out.println("");
        //un metodo particular es ceiling
        /*
        ceilingEntry te regresa clave, valor asociado a la clave que pongas
        ya sea esta igual o si no esta la que colocaste la asocia con la que sea
        la mas grande
        */
        System.out.println("Metodo ceiling");
        System.out.println(mapaTree.ceilingEntry(13));
        System.out.println(mapaTree.ceilingEntry(39));
        // no tenemos clave trece, la asociara a la que sea siguiente y mas grande
        //osea el 15
        System.out.println("");
        System.out.println("con ceilingKey");
        System.out.println(mapaTree.ceilingKey(28));
        //key hace lo mismo pero solo regresa la llave
        System.out.println(mapaTree.ceilingKey(12));
        
        //tiene los metodos descending para mostrarte una vista del mapa
        //de una vista inversa
        System.out.println("");
        System.out.println("Descending metodos");
        System.out.println(mapaTree.descendingMap());
        //con las claves y valor
        System.out.println(mapaTree.descendingKeySet());
        //ese solo con las llaves
        
        System.out.println("");
        /*
        tiene los metodos first para ver quien entro primero
        te da la vista para clave y valor
        */
        System.out.println("Metodos First");
        System.out.println(mapaTree.firstEntry());
        System.out.println(mapaTree.firstKey());
        //este solo te retorna la llave
        
        System.out.println("");
        
        System.out.println("\t Metodos Floor");
        /*
        Actua de manera similar a ceiling
        pero ahora si la clave no esta no la asocia al mas grande
        sino a la mas baja a la que se haya puesto
        */
        System.out.println(mapaTree.floorEntry(13));
        System.out.println(mapaTree.floorEntry(39));
        
        System.out.println(mapaTree.floorKey(20));
        //ocurre lo mismo para la llave
        
        System.out.println("");
        System.out.println("\t HeadMap");
        /*
        Poose el metodo Head map devuelve una vista del mapa
        pero solo de las partes menores a la clave que se inserta
        */
        System.out.println(mapaTree.headMap(15));
        System.out.println(mapaTree.headMap(38));
        System.out.println(mapaTree.headMap(40));
        
        System.out.println("");
        System.out.println("\t Metodos last");
        /*
        last devuelven los elementos mas altos en clave valor
        o en el caso de key la llave mas alta solamente
        */
        
        System.out.println(mapaTree.lastEntry());
        System.out.println(mapaTree.lastKey());
        
        System.out.println("");
        System.out.println("\t Metodos subMap");
        /*
        Submap te ofrece una vista mapa desde determinadas llaves dadas
        desde una llava a otra
        */
        System.out.println(mapaTree.subMap(12, 40));
        
        
    }
    
}
