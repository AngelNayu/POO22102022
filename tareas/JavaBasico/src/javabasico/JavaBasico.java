/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

/**
 *
 * @author genar
 */
public class JavaBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad= 22;
        Integer edad2 = new Integer(2);
        float x = edad2.floatValue();
        System.out.println(x);
        String dias = "23";
        System.out.println(dias +3);
        int temp = Integer.parseInt(dias);
        edad2.parseInt("33");
        System.out.println("Dias = "+ (temp +3));
        
        Perro Dog1= new Perro(); 
        Perro.ladrar();// al rato actualizo
        
        System.out.println("Edad :"+ edad + " años");
        
        String res = "";
        /*
        if(edad >= 18){
         res= "Mayor de edad";  
        }else{
            res = "Menor de edad";
        }
        System.out.println("Eres: " +res);
        */
        System.out.println("--------");
        edad =25;
        res = (edad >= 18)? "Mayor de edad": "Menor  de Edad";
        System.out.println("Eres :" + res);
    
        int  val1 = 7;
        int  val2 = 2;
        System.out.println( val1 | val2);
        System.out.println( val1 & val2);

        /*
        val1 = 000...0111
        val2 = 000...0010
        -----------
        000...0010  // 2 decimal
       
        */
        int val3 = 1;//000.00001
        int val4 = val3<<1; //desplazar los bits una posicion a la izquierda
                            //000.0010
        System.out.println(val4);
        val4 = val4<<1;
        System.out.println(val4);
        System.out.println("------arreglos--------");
        
        int [] edades; //aqui solo se declara
        int [] edades2 = new int [5]; // aqui se declara y reserva memoria
        int [] edades3 = {22,21,18,19,18}; // en este se declara, reserva e inicializa
        /*
        
        */
        edades2[0] = 33;
        System.out.println(edades2[0]);//33
        System.out.println(edades2[1]);//0
        // ahora imprimimos las edxades3
        
        System.out.println("Edades 3 a Manos");//
        System.out.println(edades3[0]);//
        System.out.println(edades3[1]);//
        System.out.println(edades3[2]);//
        System.out.println(edades3[3]);//
        System.out.println(edades3[4]);//
        //ahora lo combinamos con FOR
        System.out.println("Automatizado");
        for (int i = 0; i < edades3.length; i++) {
            System.out.println(edades3[i]);
        }
        //inverso
         /* System.out.println("orden inverso ");
        for (int i = edades3.length-1; i >= 0; i--) {
            System.out.println(edades3[i]);
        }
        
        System.out.println("eades a 18");
        for (int i = 0; i < edades3.length; i++) {
            edades3[i] = edades3[2];
            System.out.println(edades3[i]);
        }*/
        
        /*
        for Each es un for especial introducido en la version 2 de Java.
        En esa version sufrio muchos camvios que lo mejoraron bbastante
        El objetivo de for Each es simplificar la forma de recorrer los arreglos
        
        */
        System.out.println("Con for each");
        for (int ed : edades3) {
            System.out.println(ed);
        }
        /*
        Los ":" significan, sacar el siguiente elemento y asignarlo a la que esta en la
        izquierda
        */
        System.out.println("Arreglos clase perro");
        
        Perro[] lista= new Perro [3];
        lista[0]= new Perro("Poodle", 1);
        lista[1]= new Perro("San Bernardo ", 3);
        lista[2]= new Perro("Akita", 2);
        //fore + tab
        for (Perro perro : lista) {
            perro.comer();
        }
        
        System.out.println("Todos los perros a raza doberman");
        for (Perro perro : lista) {
            perro.setRaza("Doverman");
        }
        
        for (Perro perro : lista) {
            System.out.println(perro);
            
        }

        
    }
        
}
