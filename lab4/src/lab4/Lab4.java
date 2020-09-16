/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

 import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
//import javax.swing.*;

/**
 *
 * @author mariajesuscanoles
 */
public class Lab4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        miMarco marco1 = new miMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class miMarco extends JFrame{
    
    public miMarco(){
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setSize(anchoPantalla/2,alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        setTitle("Mi git");
        
    }
}
