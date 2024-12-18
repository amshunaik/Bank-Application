package Bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{

    JLabel label1,label2,label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton but1, but2, but3;
    Login(){
        super("Bank Management System");
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2=ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3=new ImageIcon(ii2);
        JLabel iimage=new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);

      

        label1=new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.white);
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2=new JLabel("Card No :");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.white);
        label2.setBounds(200,190,375,30);
        add(label2);

        textField2=new JTextField(15);
        textField2.setBounds(340,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);

        label3=new JLabel("PIN :");
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setForeground(Color.white);
        label3.setBounds(200,250,375,30);
        add(label3);

        passwordField3=new JPasswordField(15);
        passwordField3.setBounds(340,250,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);

        but1=new JButton("SIGN IN");
        but1.setBackground(Color.black);
        but1.setFont(new Font("Arial",Font.BOLD,14));
        but1.setForeground(Color.white);
        but1.setBounds(300,300,100,30);
        but1.addActionListener(this);
        add(but1);

        but2=new JButton("CLEAR");
        but2.setBackground(Color.black);
        but2.setFont(new Font("Arial",Font.BOLD,14));
        but2.setForeground(Color.white);
        but2.setBounds(430,300,100,30);
        but2.addActionListener(this);
        add(but2);

        but3=new JButton("SIGN UP");
        but3.setBackground(Color.black);
        but3.setFont(new Font("Arial",Font.BOLD,14));
        but3.setForeground(Color.white);
        but3.setBounds(300,350,230,30);
        but3.addActionListener(this);
        add(but3);


        ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2=iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3=new ImageIcon(iii2);
        JLabel iiimage=new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);


        
        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);
        


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==but1){
                Cont c=new Cont();
                String cardno=textField2.getText();
                String pin=passwordField3.getText();
                String q="select * from login where card_no='"+cardno+"' and pin='"+pin+"' ";
                ResultSet resultSet=c.statement.executeQuery(q);
                if(resultSet.next()){
                    setVisible(false);
                    new Main_class(pin);
                }
                else{
                    JOptionPane.showConfirmDialog(null, "Incorrect Card Number Or Pin");
                }



            }
            else if(e.getSource()==but2){
                textField2.setText("");
                passwordField3.setText("");
                
            }
            else if(e.getSource()==but3){
                new Signup();
                setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();
            
        }
        
    }

    public static void main(String[]args){
        new Login();
    }
    
    
}
