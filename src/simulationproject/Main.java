package simulationproject;
import GUI.*;
import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame f=new JFrame();
        GUI test = new GUI(f);
        f.setSize(800, 630);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        //Working space
        f.add(test.panel1());
        
        
        
        
        // End of working space
        f.setVisible(true);
        
    }
}