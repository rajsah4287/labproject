
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LRS extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;
    JButton button3;
    public LRS(){
        setTitle("Work");
        setBounds(10,10,400,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        button1 = new JButton("LogIn");
        button1.setBounds(40, 50, 100, 40);
        add(button1);
        button2 = new JButton("Register");
        button2.setBounds(40, 120, 100, 40);
        add(button2);
        button3 = new JButton("Simple Interest");
        button3.setBounds(40, 180, 140, 40);
        add(button3);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
    }
    public static void main(String[] args){
        new LRS().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(button1)){
//            JOptionPane.showMessageDialog(null,"Do you want to Login");
            dispose();
            new Login().setVisible(true);
        }
        if (e.getSource().equals(button2)){
            JOptionPane.showMessageDialog(null,"Do you want to Register");
            new Something().setVisible(true);
        }
        if (e.getSource().equals(button3)){
            new SimpleInterest().setVisible(true);
        }
    }
}


