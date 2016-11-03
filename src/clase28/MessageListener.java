/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase28;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class MessageListener implements ActionListener{
    public void actionPerformed(ActionEvent event){
        JOptionPane.showMessageDialog(null,"Oprimiste un botón");
    }
}
