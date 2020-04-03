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
      welcome.setBounds(200,50,400,60);
       welcome.setFont(new Font("Tahoma", 0, 24));
        
        //
        JTextArea A=new JTextArea("our algorithm is designed to simulate your problem and find the best solution for it ");
        A.setBounds(0,150,400,300);
        A.setFont(new Font("Tahoma", 0, 24));
        JScrollPane w=new JScrollPane(A);
        w.setBounds(400,150,500,300);
        
        //
        f.add(w);
        f.add(A);
        f.add(welcome);
        f.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          
    }
}
