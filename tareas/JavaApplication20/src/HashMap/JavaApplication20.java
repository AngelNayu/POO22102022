
package HashMap;

import java.util.HashMap;
import java.util.Map;


public class JavaApplication20 {

    
    public static void main(String[] args) {
        Estudiante al1 = new Estudiante(3195, 18, "Lorenzo");
        Estudiante al2 = new Estudiante(4851, 20, "Martinez");
        Estudiante al3 = new Estudiante(5698, 17, "Vasconcelos");
        Estudiante al4 = new Estudiante(2851, 19, "Hernandez");
        //Objetos del tipo estudiante que almacenaremos en un HashMap
        
                //HashMap
        
        //importamos a Map de java.util
        //te coloca para k es la clave y el valor
        Map<String,Estudiante> lista = new HashMap<String, Estudiante>();
        //de esta forma creamos una lista que guarda datos del tipo estudiante
        //para cada objeto que guarde de estudiante tendra una clave
        //almacenaremos estudiantes que declaramos antes
        
        lista.put("Primero", al1); //para almacenara los datos hay que llama a la funcion put
        //te pide una clave con la que se relacionara al dato que hayamos declarado antes osea un estudiante
        
        lista.put("Segundo", al2);
        lista.put("Tercero", al3);//hacemos lo mismo con el resto y se han guardado en la lista
        lista.put("Cuarto", al4);
        
        //recordemos que guarda su clave y su valor, si queremos que nos devuelva la lista haremos lo siguiente
        
        for (Map.Entry<String, Estudiante> a: lista.entrySet()) {
            //entry entra en los valores que posee map, osea una clave valor 
            //accederemos a cada uno de lso elemento y su clave
            //para eso funciona entrySet que devuelve un conjunto de objetos, la clave y el objeto
            //llamamos a cada elemento que posea un conjunto llave y valor y lo imprimimos
            System.out.println(a);
            
        }
        
        System.out.println("");
        
        //pero suponiendo que querramos obtener solo su llave llamamos a la funcion getKey
        for (Map.Entry<String, Estudiante> a: lista.entrySet()) {
            System.out.println(a.getKey()); //getKey solo devuelve la clave
        }
        
        System.out.println("");
        
        //para el caso en que solo queramos que regrese el valor llamamos a getValue
        for (Map.Entry<String, Estudiante> a: lista.entrySet()) {
            System.out.println(a.getValue()); //getValue solo devuelve el valor
        }
        
        System.out.println("");
        System.out.println("\t Funcion get ");
        //ahora buscando a traves solamente por la clave
        //para hashmap el acceder a un valor es a traves de su clave 
        //eso es lo que hace la funcion get
        System.out.println(lista.get("Primero"));
        
        /*
        ahora suponiendo que quisieramos reemplazar un valor
        crearemos un reemplazo para el de clave "Primero"
        y crearemos un objeto nuevo tipo estudiante que lo reemplazara
        */
        
        System.out.println("");
        System.out.println("\tFuncion Replace");
        Estudiante reemplazo = new Estudiante(4893, 28, "Juarez");
        
        //imprimiremos al Primero para tener en cuenta que si hay cambio
        System.out.println(lista.get("Primero"));
        System.out.println("");
        System.out.println("ahora susituido ");
        lista.replace("Primero", reemplazo);//se hace el reemplazo
        System.out.println(lista.get("Primero"));
        //ahora se imprimira el reemplazo
        
        
        
        System.out.println("");
        System.out.println("Funcion remove");
        //remove quitara algun elemento especificando su llave
        //se le puede añadir otra condicion al pedir tambien el valor
        lista.remove("Primero");
        
        for (Map.Entry<String, Estudiante> a: lista.entrySet()) {
            System.out.println(a);           
        }
        //no se imprime ahora el que tiene la primer clave
        
        
        System.out.println("");
        System.out.println("\t KeySet y Values");
        /*
        keySet y Values te devuelve en lista cada uno de ellos
        keySet las llaves que hay 
        values los valores que estan en toda la lista 
        */
        System.out.println("");
        System.out.println("keySet");
        System.out.println(lista.keySet());
        
        System.out.println("");
        System.out.println("values");
        System.out.println(lista.values());
        
        
        System.out.println("");
        System.out.println("\t funciones containsKey containValue y size");
        /*
        para containsKey te regresa un verdadero o falso si al colocar la llave
        esta se encuentra en el Map, lo mismo ocurre con Value solo que con el 
        dato que almacenas
        
        para size solo te regresa el numero de elementos en tu lista o mapa
        */
        System.out.println("para Key");
        System.out.println(lista.containsKey("Segundo"));
        System.out.println("si contiene la clave Segundo");
        
        System.out.println("");
        
        System.out.println("para value");
        System.out.println(lista.containsValue(al1));
        System.out.println("en teoria ya no contiene a al1 ");
        
        System.out.println("");
        System.out.println("Size");
        System.out.println("el numero de elementos que hay son: "+lista.size());
        
    }
    
}
