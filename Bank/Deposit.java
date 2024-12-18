package Bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    JTextField textfield;
    JButton b1,b2;

    Deposit(String pin){
        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel lab1=new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        lab1.setFont(new Font("Raleway",Font.BOLD,16));
        lab1.setForeground(Color.white);
        lab1.setBounds(460,180,400,35);
        image.add(lab1);

        textfield=new JTextField();
        textfield.setBackground(new Color(65,125,128));
        textfield.setForeground(Color.white);
        textfield.setBounds(460,230,320,25);
        textfield.setFont(new Font("Raleway", Font.BOLD,22));
        image.add(textfield);

        b1=new JButton("DEPOSIT");
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
        
        getContentPane().setBackground(new Color(252,208,76));         
        setVisible(true);
    }

    public static void main(String[] args){
        new Deposit("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String amount=textfield.getText();
            Date date=new Date();
            if(e.getSource()==b1){
                if(amount.equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit ");

                }
                else{
                    Cont c1=new Cont();
                    String q1="insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')";
                    JOptionPane.showMessageDialog(null, "₹ "+amount+" is Deposited Successfully");
                    c1.statement.executeUpdate(q1);
                    setVisible(false);
                    new Main_class(pin);
                }

    
            }
            else if(e.getSource()==b2){
                setVisible(false);
                
            }

        }catch(Exception E){
            E.printStackTrace();
        }
        
        
        
    }
}
