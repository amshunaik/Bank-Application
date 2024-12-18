package Bank;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

import com.toedter.calendar.JDateChooser;  // Import JDateChooser


public class Signup extends JFrame implements ActionListener{

    Random ran=new Random();
    JTextField textname,textfname,textemail,marrStat,address,textcity, textpincode,textState;
    Component dateChooser;
    JButton next;
    long first4=(ran.nextLong()%9000L)+1000L;

    String first=" "+Math.abs(first4);
    JRadioButton r1,r2,m1,m2,m3;

    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("APPLICATION FORM No. "+first);
        label1.setBounds(170,20,600,35);
        label1.setFont(new Font("Raleway", Font.BOLD,32));
        add(label1);

        JLabel label2=new JLabel("Page 1 :-");
        label2.setFont(new Font("Ralway", Font.BOLD,24));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3=new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,95,600,30);
        add(label3);

        JLabel labelname=new JLabel("Name :");
        labelname.setFont(new Font("Raleway",Font.BOLD,20));
        labelname.setBounds(100,190,100,30);
        add(labelname);

        textname=new JTextField();
        textname.setFont(new Font("Raleway",Font.BOLD,14));
        textname.setBounds(300,190,400,30);
        add(textname);

        JLabel labelfname=new JLabel("Father's Name :");
        labelfname.setFont(new Font("Raleway",Font.BOLD,20));
        labelfname.setBounds(100,250,200,30);
        add(labelfname);

        textfname=new JTextField();
        textfname.setFont(new Font("Raleway",Font.BOLD,14));
        textfname.setBounds(300,250,400,30);
        add(textfname);

        JLabel labelG=new JLabel("Gender");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,300,200,30);
        add(labelG);

        r1=new JRadioButton("Male");
        r1.setBounds(300,300,60,30);
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(225,225,228));
        add(r1);
        r2=new JRadioButton("Female");
        r2.setBounds(390,300,120,30);
        r2.setBackground(new Color(225,225,228));
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        add(r2);

        // Group buttons
        ButtonGroup btgroup=new ButtonGroup();
        btgroup.add(r1);
        btgroup.add(r2);

        JLabel DOB=new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,350,200,30);
        add(DOB);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,350,400,30);
        add(dateChooser);

        JLabel email=new JLabel("Email Address");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,400,200,30);
        add(email);

        textemail=new JTextField();
        textemail.setFont(new Font("Raleway",Font.BOLD,14));
        textemail.setBounds(300,400,400,30);
        add(textemail);

        JLabel MStat=new JLabel("Marital Status :");
        MStat.setFont(new Font("Raleway",Font.BOLD,20));
        MStat.setBounds(100,450,200,30);
        add(MStat);

        m1=new JRadioButton("Married");
        m1.setBounds(300,450,100,30);
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        add(m1);

        m2=new JRadioButton("Unmarried");
        m2.setBounds(430,450,100,30);
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        add(m2);

        m3=new JRadioButton("Other");
        m3.setBounds(550,450,100,30);
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        add(m3);

        ButtonGroup bt2=new ButtonGroup();
        bt2.add(m1);
        bt2.add(m2);
        bt2.add(m3);

        

        JLabel Address1=new JLabel("Address :");
        Address1.setFont(new Font("Raleway",Font.BOLD,20));
        Address1.setBounds(100,500,200,30);
        add(Address1);

        address=new JTextField();
        address.setFont(new Font("Raleway",Font.BOLD,14));
        address.setBounds(300,500,400,30);
        add(address);

        JLabel labelcity1=new JLabel("City :");
        labelcity1.setFont(new Font("Raleway",Font.BOLD,20));
        labelcity1.setBounds(100,550,200,30);
        add(labelcity1);

        textcity=new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD,14));
        textcity.setBounds(300,550,400,30);
        add(textcity);

        JLabel labelstate1=new JLabel("State :");
        labelstate1.setFont(new Font("Raleway",Font.BOLD,20));
        labelstate1.setBounds(100,600,200,30);
        add(labelstate1);

        textState=new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,600,400,30);
        add(textState);

        JLabel labelpin=new JLabel("Pin Code :");
        labelpin.setFont(new Font("Raleway",Font.BOLD,20));
        labelpin.setBounds(100,650,200,30);
        add(labelpin);

        textpincode=new JTextField();
        textpincode.setFont(new Font("Raleway",Font.BOLD,14));
        textpincode.setBounds(300,650,400,30);
        add(textpincode);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.black);
        next.setForeground(Color.WHITE);
        next.setBounds(600,700,100,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
        

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String formno=first;
        String name=textname.getText();
        String fname=textfname.getText();
        String dob = ((JTextField)((JDateChooser) dateChooser).getDateEditor().getUiComponent()).getText();

        //String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected()){
            gender="Male";
        }
        else if(r2.isSelected()){
            gender="Female";

        }
        String email=textemail.getText();
        String marital=null;
        if(m1.isSelected()){
            marital="Married";
        }
        else if(m2.isSelected()){
            marital="Unmarried";
        }
        else if(m3.isSelected()){
            marital="Divorced";
        }
        String addr=address.getText();
        String city=textcity.getText();
        String pincode=textpincode.getText();
        String state=textState.getText();

        try{
            if(textname.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the details");
            }
            else{
                Cont con1=new Cont();
                String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+addr+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);


            }

        }catch (Exception E){

        }


        
    }
    public static void main(String[] args){
        new Signup();
    }
    
}
