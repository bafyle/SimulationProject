/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author bebo
 */
public class MainFrame {
    
        public void FrameConfigration(JFrame f)
    {
        //Frame config
        f.setSize(800,630);  
        f.setLocationRelativeTo(null); 
        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(false);
        //
        //welcome label
       JLabel welcome=new JLabel("Welcome to Monte Carlo method"); 
       welcome.setBounds(300,50,250,60);
       welcome.setFont(new Font("Tahoma", 0, 24));
        welcome.setVisible(true);
        //
        JTextArea A=new JTextArea("");
        
        
        
        
        f.add(welcome);
        f.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          
    }
}
