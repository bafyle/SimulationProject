
package GUI;

import javax.swing.*;


public class GUI
{
    private JFrame mainFrame;
    public GUI(JFrame mf)
    {
        mainFrame = mf;
    }
    public JPanel panel1()
    {
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setSize(mainFrame.getSize());
        JLabel welcome=new JLabel("Welcome to Monte Carlo method"); 
        welcome.setBounds(200,50,400,60);
        p.add(welcome);
        
        JLabel a = new JLabel("our algorithm is designed to simulate your problem and find the best solution for it");
        a.setBounds(180, 150, 500, 60);
        p.add(a);
        JLabel b = new JLabel("Enter the number of probabilities");
        b.setBounds(220, 200, 300, 60 );
        p.add(b);
        SpinnerModel value = new SpinnerNumberModel(1, 1, 100000, 1); 
        JSpinner spin = new JSpinner(value);
        p.add(spin);
        spin.setBounds(420, 210, 50, 30);
        return p;
    }
}
