
import sun.rmi.runtime.Log;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Login extends JFrame implements ActionListener {
    JLabel userLabel;
    JLabel passwordLabel;
    JTextField userField;
    JPasswordField passwordField;
    JButton button1;
    JButton button2;
    JCheckBox checkPassword;
    public Login() {
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(10, 10, 370, 600);
        setResizable(true);
        setLayout(null);
        userLabel = new JLabel("USERNAME");
        userLabel.setBounds(50, 50, 100, 30);
        userLabel.setForeground(Color.red);
        add(userLabel);
        passwordLabel = new JLabel("PASSWORD");
        passwordLabel.setBackground(Color.black);
        passwordLabel.setBounds(50, 80, 100, 30);
        userLabel.setForeground(Color.red);
        add(userLabel);
        passwordLabel = new JLabel("PASSWORD");
        passwordLabel.setBackground(Color.black);
        passwordLabel.setBounds(50, 80, 100, 30);
        passwordLabel.setForeground(Color.blue);
        add(passwordLabel);
        userField = new JTextField();
        userField.setBounds(150, 50, 200, 25);
        add(userField);
        passwordField = new JPasswordField();
        passwordField.setBounds(150, 80, 200, 25);
//        passwordField.setEchoChar('*');
        add(passwordField);
        checkPassword = new JCheckBox("Show Password");
        checkPassword.setBounds(120, 120, 200, 30);
        add(checkPassword);
        button1 = new JButton("LogIn");
        button1.setBounds(100, 150, 100, 40);
        add(button1);
        button2 = new JButton("Reset");
        button2.setBounds(220, 150, 100, 40);
        add(button2);
        checkPassword.addActionListener(this);
        button1.addActionListener(this);
    }
    public static void main(String[] args){
        new Login().setVisible(true); }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(checkPassword)){
            if (checkPassword.isSelected()){
                passwordField.setEchoChar((char) 0);
            }else {
                passwordField.setEchoChar('*');
            }
        }
        if (e.getSource().equals(button1)){

            String username = userField.getText();
            JOptionPane.showMessageDialog(null,"Logged in as "+username);
            dispose();
//            new HelloWorld().setVisible(true);
        }
    }
}




