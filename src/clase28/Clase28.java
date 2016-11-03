/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase28;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Estudiante
 */
public class Clase28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame frame= new JFrame();
        frame.setVisible(true);
        Image icon = Toolkit.getDefaultToolkit().getImage("medalla.gif");
        frame.setIconImage(icon);
        JPanel panel = (JPanel) frame.getContentPane();
        panel.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900, 120));
        
        
        frame.setTitle("Título");
        
        frame.setLayout(new GridLayout(2,8));
        JLabel label= new JLabel("Prueba");
        
        JButton boton1= new JButton();
        boton1.setText("Un botón");
        boton1.setBackground(Color.RED);
        frame.add(boton1);
        frame.add(label);
        
        JButton boton2= new JButton();
        boton2.setText("Otro botón");
        boton2.setBackground(Color.ORANGE);
        boton2.setIcon(new ImageIcon("icon1.gif"));
        frame.add(boton2);
        
        
        Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2); //Centrar la pantalla
        frame.setVisible(true);
        
        boton1.addActionListener(new MessageListener()); //Para gestionar un evento
        boton2.addActionListener(new MessageListener());
    }
    
}
