import javax.swing.*;
import java.awt.*;
public class register {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500,400);
        frame.setTitle("Register");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
        JLabel label=new JLabel("FirstName");
        label.setBounds(10,20,50,50);
        panel.add(label);
        JTextField firstField = new JTextField();
        firstField.setBounds(80,40,200,20);
        panel.add(firstField);
        JLabel label1=new JLabel("LastName");
        label1.setBounds(10,40,50,50);
        panel.add(label1);
        JTextField lastField = new JTextField();
        lastField.setBounds(80,60,200,20);
        panel.add(lastField);
        JLabel label2=new JLabel("Email");
        label2.setBounds(10,60,50,50);
        panel.add(label2);
        JTextField mailField = new JTextField();
        mailField.setBounds(80,80,200,20);
        panel.add(mailField);
        JLabel label3=new JLabel("Password");
        label3.setBounds(10,80,50,50);
        panel.add(label3);
        JPasswordField password =new JPasswordField();
        password.setBounds(80,100,200,20);
        panel.add(password);
        JLabel label4=new JLabel("Conform Password");
        label4.setBounds(10,100,50,50);
        panel.add(label4);
        JPasswordField password1 =new JPasswordField();
        password1.setBounds(80,120,200,20);
        panel.add(password1);

        frame.setVisible(true);
    }
}