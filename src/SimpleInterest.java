
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SimpleInterest extends JFrame implements ActionListener {
    JLabel principal;
    JLabel time;
    JLabel rate;
    JLabel result;
    JTextField P_text;
    JTextField R_text;
    JTextField T_text;
    JButton button1;
    public SimpleInterest(){
        setTitle("SimpleInterest");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(10,10,300,300);
        setResizable(true);
        setLayout(null);
        principal = new JLabel("Principal");
        principal.setBounds(10,10,100,30);
        add(principal);
        time = new JLabel("Time");
        time.setBounds(10,50,100,30);
        add(time);
        rate= new JLabel("Rate");
        rate.setBounds(10,90,100,30);
        add(rate);
        P_text = new JTextField();
        P_text.setBounds(100,10,140,25);
        add(P_text);
        T_text = new JTextField();
        T_text.setBounds(100,50,140,25);
        add(T_text);
        R_text = new JTextField();
        R_text.setBounds(100,90,140,25);
        add(R_text);
        button1 = new JButton("Result");
        button1.setBounds(50,140,200,30);
        add(button1);
        result = new JLabel();
        result.setBounds(60,180,300,40);
        add(result);
        button1.addActionListener(this);
    }
    public static void main(String[] args){
        new SimpleInterest().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float p = Integer.parseInt(P_text.getText());
        float t = Integer.parseInt(T_text.getText());
        float r = Integer.parseInt(R_text.getText());
        float c =0;
        if (e.getSource().equals(button1)){
            c = (p*t*r)/100;
            result.setText("Interest is :"+ String.valueOf(c));
        }
    }
}





