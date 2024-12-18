package Bank;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Signup3 extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    ButtonGroup bt1;
    JButton s,s1;
    String formno;
    Signup3(String formno){
        this.formno=formno;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        JLabel l1=new JLabel("Page 3 :-");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,100,30);
        add(l1);

        JLabel l2=new JLabel("Account details ");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,70,400,30);
        add(l2);

        JLabel l3=new JLabel("Account Type :");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,400,30);
        add(l3);

        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(100,160,250,30);
        add(r1);

        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(100,200,250,30);

        add(r2);

        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(new Color(252,208,76));
        r3.setBounds(400,160,250,30);
        add(r3);

        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(new Color(252,208,76));
        r4.setBounds(400,200,250,30);
        add(r4);

        // bt1=new ButtonGroup();
        // bt1.add(r1);
        // bt1.add(r2);
        // bt1.add(r3);
        // bt1.add(r4);

        JLabel l4=new JLabel("Card Number :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,250,200,30);
        add(l4);

        JLabel l5=new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,270,200,30);
        add(l5);

        JLabel l6=new JLabel("XXXX-XXXX-XXXX-1409");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(400,250,400,30);
        add(l6);

        JLabel l7=new JLabel("(It would appear on atm card/cheque Book and Statements)");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(400,270,600,30);
        add(l7);

        JLabel l8=new JLabel("PIN :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,320,200,30);
        add(l8);

        JLabel l9=new JLabel("XXXX ");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(400,320,200,30);
        add(l9);

        JLabel l10=new JLabel("(4-digit Password) ");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(100,340,200,30);
        add(l10);

        JLabel l11=new JLabel("Services Required ");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,380,200,30);
        add(l11);

        c1=new JCheckBox("ATM CARD");
        c1.setBackground(new Color(252,208,76));        
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,420,200,30);
        add(c1);

        c2=new JCheckBox("Mobile Banking");
        c2.setBackground(new Color(252,208,76));       
         c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(100,460,200,30);
        add(c2);

        c3=new JCheckBox("Email Alerts");
        c3.setBackground(new Color(252,208,76));        
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,500,200,30);
        add(c3);

        c4=new JCheckBox("Cheque Book");
        c4.setBackground(new Color(252,208,76));        
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(400,420,200,30);
        add(c4);

        c5=new JCheckBox("Internet Banking");
        c5.setBackground(new Color(252,208,76));        
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(400,460,200,30);
        add(c5);

        c6=new JCheckBox("E-Statement");
        c6.setBackground(new Color(252,208,76));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(400,500,200,30);
        add(c6);

        JCheckBox c7=new JCheckBox("I here by declare that the above entered details correct to the best of my knowledge");
        c7.setBackground(new Color(252,208,76));
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,560,700,30);
        add(c7);

        JLabel l12=new JLabel("Form No :");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setBounds(100,600,100,30);
        add(l12);

        JLabel l13=new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        l13.setBounds(400,600,60,30);
        add(l13);

        s=new JButton("Submit");
        s.setFont(new Font("Raleway",Font.BOLD,14));
        s.setBackground(Color.black);
        s.setForeground(Color.white);
        s.setBounds(250,650,100,30);
        s.addActionListener(this);
        add(s);

        s1=new JButton("Cancel");
        s1.setFont(new Font("Raleway",Font.BOLD,14));
        s1.setBackground(Color.black);
        s1.setForeground(Color.white);
        s1.addActionListener(this);
        //s1.addActionListener(this);
        s1.setBounds(420,650,100,30);
        add(s1);
       








        
        //setContentPane(setBackground(new Colo));
        setLayout(null);
        setSize(850,800);
        setLocation(400,20);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);




    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String atype=null;
        if(r1.isSelected()){
            atype="Saving Account";
        }
        if(r2.isSelected()){
            atype="Fixed Deposit Account";
        }
        if(r3.isSelected()){
            atype="Current Account";
        }
        if(r4.isSelected()){
            atype="Recurring Deposit Account";
        }
        Random ran=new Random();
        long first7=(ran.nextLong()%90000000L)+1409963000000000L;
        String cardno=""+Math.abs(first7);
        long first3=(ran.nextLong()%9000L)+1000L;
        String pin=""+Math.abs(first3);

        String fac="";
        if(c1.isSelected()){
            fac+="ATM Card ";
        }
        else if(c2.isSelected()){
            fac+="Mobile Banking ";
        }
        else if(c3.isSelected()){
            fac+="Email Alerts ";
        }
        else if(c4.isSelected()){
            fac+="Cheque Book ";
        }
        else if(c5.isSelected()){
            fac+="Internet Banking ";
        }
        else if(c6.isSelected()){
            fac+="E-Statement ";
        }
        try{
            if(e.getSource()==s){
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill the fields");
                }
                else{
                    Cont c1=new Cont();
                    String q1="insert into signupthree values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2="insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number  : "+cardno+ ", and Pin is : "+pin);
                    new Deposit(pin);                    setVisible(false);
                }

            }
            if(e.getSource()==s1){
                System.exit(0);
            }

        }
        catch(Exception E){
            E.printStackTrace();
        }
        

        

        

    }
    public static void main(String[] args){
        new Signup3("");
    }
    
}
