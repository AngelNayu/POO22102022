/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author genar
 */
public class MiVentanaVersion2 extends Frame {
    private Button boton1;
    private FlowLayout layout;
    private TextField cuadroTexto;
    private Label etiqueta;
   
    
    
    public MiVentanaVersion2() throws HeadlessException {
        setTitle("Mi ventana Version 2");
        setSize(300, 200);
        layout = new FlowLayout();
        setLayout(layout);
        boton1 = new Button("Saludar");
        cuadroTexto = new TextField(15);
        etiqueta = new Label("Valor inicial");
        
        this.boton1.addMouseListener( new MouseAdapter() {// objeto anonimo que es creado
            @Override
            public void mouseClicked(MouseEvent e) {
                etiqueta.setText("hola " +cuadroTexto.getText());
                System.out.println("x = " + e.getX()); //obtner en donde presiono en la ventana para eso el get 
                System.out.println("y =" + e.getY());// aqui en y pero es en el boton
                System.out.println("que boton? "+ e.getButton());//que boton del mouse se presiona
                
                
            }//aqui el metodo que necesitamos es aplicado una vez que llamamos al listener
            
        } );
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {//Para hacer que cuando la ventana se cierr
               System.exit(0);                       //tambien se detenga el programa
            }
            
        });
        
        this.cuadroTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Tecla "+ e.getKeyChar());
                System.out.println("Enter code" + KeyEvent.VK_ENTER);
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        System.out.println("Se dio enter");//aqui deberia de dar el enter
                        
                        break;
                    default:
                        System.out.println("Tecla: "+ e.getKeyChar());//aqui avienta la tecla que presionemos

                }
            }
            
        });
        
        this.add(cuadroTexto);
        this.add(boton1);
        this.add(etiqueta);
                
        setVisible(true);
    }

  
    
}
