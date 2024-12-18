package Bank;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.CookieManager;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BalanceEnq extends JFrame implements ActionListener{
    JTextField textField;
    JLabel lab2;
    JButton b1;
    String pin;
    

    BalanceEnq(String pin){
        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel lab1=new JLabel("Your Current Balance is ₹");
        lab1.setFont(new Font("Raleway",Font.BOLD,16));
        lab1.setForeground(Color.white);
        lab1.setBounds(430,180,700,35);
        image.add(lab1);

        lab2=new JLabel();
        lab2.setFont(new Font("Raleway",Font.BOLD,16));
        lab2.setForeground(Color.white);
        lab2.setBounds(430,220,400,35);
        image.add(lab2);

        b1=new JButton("BACK");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        image.add(b1);

        int balance=0;
        try{
            Cont c=new Cont();
            ResultSet resultSet=c.statement.executeQuery("Select * from bank where pin='"+pin+"'");
            while(resultSet.next()){
                if(resultSet.getString("type").equals("Deposit")){
                    balance+=Integer.parseInt(resultSet.getString("amount"));
                }
                else{
                    balance-=Integer.parseInt(resultSet.getString("amount"));
                }


            }


        }
        catch(Exception e){
            e.printStackTrace();
        }

        lab2.setText(""+balance);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        setVisible(false);
        new Main_class(pin);

        
    }
    public static void main(String[] args){
        new BalanceEnq("");

    }


    
}
