/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifradocesartarea;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author genar
 */
public class VentanaSwingCesar extends JFrame {
    private String abecedario;
    private FlowLayout layout;
    private JTextField cuadroTexto;
    private JTextField conversor;
    private JButton boton;
    private JLabel etiqueta;
    private JLabel etiqueta2;
    private JLabel resultado;

    public VentanaSwingCesar() throws HeadlessException {
       
        this.setTitle("Mi Ventana de Cifrado cesar");
        this.setSize(400, 500);
        this.setVisible(true);
        layout = new FlowLayout();
        this.setLayout(layout);
        cuadroTexto = new JTextField(20);
        conversor = new JTextField(20);
        boton = new JButton("Cifrar");
        etiqueta = new JLabel("Ingrese el texto a cifrar");
        etiqueta2 = new JLabel("Ingrese el desplazamiento");
        resultado = new JLabel("  En cifrado cesar .");
        
        
        
        this.getContentPane().add(etiqueta);
        this.getContentPane().add(cuadroTexto);
        this.getContentPane().add(etiqueta2);
        this.getContentPane().add(conversor);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        this.pack();
        this.setVisible(true);
        
        
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
            
                System.exit(0);
                
                
            }
            
        });
        
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               
                String mayus = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";//declaramos un string que posea todo el abecedario en mayusculas
                String minus = "abcdefghijklmnñopqrstuvwxyz";//aqui uno en minusculas
                String fraseC;//String donde se almacenara la frase cifrada
                fraseC = "";
                String frase; //string que almacene el texto que de el usuario
                frase = cuadroTexto.getText();//aqui se obtiene 
                int desplazamiento = Integer.parseInt(conversor.getText());//obtenemos el string del desplazamiento y lo convertimos en un entero
                
                
                for (int i = 0; i < frase.length(); i++) {//vamos a recorrer los elementos de la frase, midiendo la longitud del string y recorrerlo
                    for (int j = 0; j < minus.length(); j++) {//comparamos cada letra con los abecedarios, midiendo la longitud de los strings de los abecedarios
                        if (frase.charAt(i)==minus.charAt(j)) {//para acceder a la letra que queramos tener, con charAt nos devuelve el valor del char especificado
                                                               //en este caso ira leyendo letra por letra y los va a comparar con el abecedario  
                            if (j +desplazamiento >= minus.length()) {//ahora haremos el desplazamiento en ese string, ahora se vera si cuando se sumas la posicion de j y el desplazamiento                                                                     
                                fraseC += minus.charAt((j + desplazamiento)% minus.length());//en este caso si resulta la suma mas largo que la longitud del abecedario minus
                                /*
                                si resulta mas grande  se suma y a esto le ponemos el simbolo de porcentaje, sacamos el residuo, de lo obtenido y la longitud
                                entonces al dar otra vuelta se añade ese residuo al dar otra vuelta
                                */                                                             
                            }
                            else{
                                fraseC += minus.charAt(j+desplazamiento);//si aqui no es mayor que la longitud solo se suman
                            }
                        }
                        else if (frase.charAt(i)==mayus.charAt(j)) {//ahora se realiza lo mismo que antes, solo que ahora comparando las letras si son mayusculas
                            if (j +desplazamiento >= mayus.length()) {// se realizan los mismo procedimientos, solo que ahora uno a uno de elementos con mayuscula
                                fraseC += mayus.charAt((j + desplazamiento)% mayus.length());
                            }
                            else{
                                fraseC += mayus.charAt(j+desplazamiento);
                            }
                        }
                                                 
                    }
                    
                }
                
                resultado.setText(fraseC + " mensaje con cifrado cesar");//aqui hacemos que muestre en el texto de la ventana ya convertido a cifrado cesar con el desplazamiento
                
                
                                                   
            }
            
            
        });
        
        
        
    }
    
    
    
}
