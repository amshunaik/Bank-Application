package Bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main_class extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    Main_class(String pin){

        this.pin=pin;
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel label=new JLabel("Please select your transaction");
        label.setBounds(430,180,700,35);
        label.setForeground(Color.white);
        label.setFont(new Font("System",Font.BOLD,28));
        image.add(label);

        b1=new JButton("DEPOSIT");
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.white);
        b1.setBounds(410,270,150,35);
        b1.addActionListener(this);
        image.add(b1);

        b2=new JButton("CASH WITHDRAWL");
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.white);
        b2.setBounds(700,270,150,35);
        b2.addActionListener(this);
        image.add(b2);

        b3=new JButton("FAST CASH");
        b3.setBackground(new Color(65,125,128));
        b3.setForeground(Color.white);
        b3.setBounds(410,315,150,35);
        b3.addActionListener(this);
        image.add(b3);

        b4=new JButton("MINI STATEMENT");
        b4.setBackground(new Color(65,125,128));
        b4.setForeground(Color.white);
        b4.setBounds(700,315,150,35);
        b4.addActionListener(this);
        image.add(b4);

        b5=new JButton("PIN CHANGE");
        b5.setBackground(new Color(65,125,128));
        b5.setForeground(Color.white);
        b5.setBounds(410,365,150,35);
        b5.addActionListener(this);
        image.add(b5);

        b6=new JButton("BALANCE ENQUIRY");
        b6.setBackground(new Color(65,125,128));
        b6.setForeground(Color.white);
        b6.setBounds(700,365,150,35);
        b6.addActionListener(this);
        image.add(b6);

        b7=new JButton("EXIT");
        b7.setBackground(new Color(65,125,128));
        b7.setForeground(Color.white);
        b7.setBounds(700,410,150,35);
        b7.addActionListener(this);
        image.add(b7);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }
    public static void main(String[] args){
        new Main_class("");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            new Deposit(pin);
            setVisible(false);

        }
        else if(e.getSource()==b2){
            new Withdrawl(pin);
            setVisible(false);
        
        }
        else if(e.getSource()==b3){
            new Fastcash(pin);
            setVisible(false);
        }
        else if(e.getSource()==b5){
            
            new Pin(pin);
            setVisible(false);
        }

        else if(e.getSource()==b6){
            
            new BalanceEnq(pin);
            setVisible(false);
        }
        else if(e.getSource()==b7){
            System.exit(0);
            

        }
    }
    
}
