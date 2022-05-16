/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

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

        //ArrayList de la clase perro
        System.out.println("------SIN GENERICAS------");
        ArrayList mascotas = new ArrayList();
        mascotas.add(new Perro("Poodle", 1));
        mascotas.add(new Perro("Doverman", 2));
        mascotas.add(new Perro("Akita", 2));
        mascotas.add(new Perro("Gran Danes", 3));
        mascotas.add(new Perro("Chihuahua", 0));
        
        for (Object mascota : mascotas) {
            Perro tmp = (Perro)mascota;
            System.out.println(tmp);
        }
        //Desspues de la versión 2 de java se agrego el concepto de clases
        //genericas
        System.out.println("------ con genericas------");
        ArrayList<Perro> mascotas2 = new ArrayList<Perro>();
        mascotas2.add(new Perro("Poodle", 1));
        mascotas2.add(new Perro("Doverman", 2));
        mascotas2.add(new Perro("Akita", 2));
        mascotas2.add(new Perro("Gran Danes", 3));
        mascotas2.add(new Perro("Chihuahua", 0));
        
       Scanner teclado = new Scanner(System.in);
        System.out.println("Que raza quieres cambiar de tamaño? : ");
        String raza = "Akita";//una manera de hacerlo pero dando la raza desde el output
        for (Perro perro : mascotas2) {
            if (perro.getRaza().equals(raza)) {
                perro.setTamano(4);
            }
            
        }
        for (Perro perro : mascotas2) {
            System.out.println(perro);
        }
        mascotas2.add(2, new Perro("pug", 2));
        
        for (Perro perro : mascotas2) {
            System.out.println(perro);
        }
        System.out.println("----------");
        System.out.println("Perro 2 es: " + mascotas2.get(2));

        System.out.println("Eliminar el akita, index 3");
        Perro p =mascotas2.remove(3); //lo puedes almacenar en una variable si tesirve en elfuturo
        
        for (Perro perro : mascotas2) {
            System.out.println(perro);
        }
        System.out.println("--------");
        System.out.println("El perro sacado es: " + p );
        
        mascotas2.set(1,new Perro("Boxer", 3));
        mascotas2.set(2, new Perro("Labrador", 4));
        System.out.println("---------");
        for (Perro perro : mascotas2) {
            System.out.println(perro);
        }
        
        //Manejo de excepciones
        
        System.out.println("Elige un numero entre 0 y 4 : ");
        
        Perro puppy= null;
        int num = 10;
        try{
            int indice=teclado.nextInt();
            puppy = mascotas2.get(indice); 
            num =(num /indice);
            
        }catch(IndexOutOfBoundsException ex){
            System.out.println("ocurrio un error, el valor debe estar entre 0 y 4");
            puppy = mascotas2.get(0);
            System.out.println(ex.getMessage());
        }catch(InputMismatchException ime){
            System.out.println("Solo deben ser numeros");
            puppy = mascotas2.get(0);
        }catch(Exception e){
            System.out.println("ultimo recurso");
        }
        finally{
            System.out.println("En finally");
            System.out.println(puppy);
        }
        //ERROR != EXCEPCION
        System.out.println("Se alcanzo el fin del programa");
        
    }
    
        
}
