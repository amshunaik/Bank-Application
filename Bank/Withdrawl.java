package Bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Withdrawl extends JFrame implements ActionListener {
    JTextField textField;
    JButton b1,b2;
    String pin;
    Withdrawl(String pin){
        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel lab1=new JLabel("MAXIMUM WITHDRAWL IS ₹10,000");
        lab1.setFont(new Font("Raleway",Font.BOLD,16));
        lab1.setForeground(Color.white);
        lab1.setBounds(460,180,700,35);
        image.add(lab1);

        JLabel lab2=new JLabel("PLEASE ENTER YOUR AMOUNT");
        lab2.setFont(new Font("Raleway",Font.BOLD,16));
        lab2.setForeground(Color.white);
        lab2.setBounds(460,220,400,35);
        image.add(lab2);

        textField=new JTextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.white);
        textField.setBounds(460,260,320,25);
        textField.setFont(new Font("Raleway", Font.BOLD,22));
        image.add(textField);

        b1=new JButton("WITHDRAW");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        image.add(b1);

        b2=new JButton("BACK");
        b2.setBounds(700,400,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.white);
        b2.addActionListener(this);

        image.add(b2);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        //getContentPane().setBackground(new Color(252,208,76));         
        setVisible(true);

    }

    public static void main(String [] args){
        new Withdrawl("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
        
        try{
            String amount=textField.getText();
            Date date=new Date();
            if(amount.equals("")){
                JOptionPane.showConfirmDialog(null, "Please enterthe Amount you want to withdraw");

            }
            else{
                Cont c=new Cont();
                ResultSet resultSet=c.statement.executeQuery("select * from bank where pin='"+pin+"' ");
                int balance=0;
                while(resultSet.next()){
                    if(resultSet.getString("type").equals("Deposit")){
                        balance+=Integer.parseInt(resultSet.getString("amount"));
                    }
                    else{
                        balance-=Integer.parseInt(resultSet.getString("amount"));
                    }
                }

                if(balance<Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdrawl','"+amount+"')");
                JOptionPane.showMessageDialog(null, "₹ "+amount+" Debited Successfully");
                setVisible(false);
                new Main_class(pin);

            }
            
            
        }
        catch(Exception E){
            E.printStackTrace();;
        }
    }
    else if(e.getSource()==b2){
        setVisible(false);
        new Main_class(pin);
    }
    

    }
    
}
