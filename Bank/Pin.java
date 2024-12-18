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
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Pin extends JFrame implements ActionListener{

    JButton b1,b2;
    JPasswordField p1,p2;
    String pin;
    Pin(String pin){
        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel lab1=new JLabel("CHANGE YOUR PIN");
        lab1.setFont(new Font("Raleway",Font.BOLD,16));
        lab1.setForeground(Color.white);
        lab1.setBounds(460,180,400,35);
        image.add(lab1);

        JLabel lab2=new JLabel("New PIN:");
        lab2.setFont(new Font("Raleway",Font.BOLD,16));
        lab2.setForeground(Color.white);
        lab2.setBounds(460,220,400,35);
        image.add(lab2);

        p1=new JPasswordField();
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.white);
        p1.setBounds(630,220,150,25);
        p1.setFont(new Font("Raleway", Font.BOLD,22));
        image.add(p1);

        JLabel lab3=new JLabel("Re-Enter New PIN:");
        lab3.setFont(new Font("Raleway",Font.BOLD,16));
        lab3.setForeground(Color.white);
        lab3.setBounds(460,250,400,35);
        image.add(lab3);

        p2=new JPasswordField();
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.white);
        p2.setBounds(630,250,150,25);
        p2.setFont(new Font("Raleway", Font.BOLD,22));
        image.add(p2);


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
        
        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);

        

        

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        try{
            String pin1=p1.getText();
            String pin2=p2.getText();

            if(!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null, "Entered pin does not match");

            }
            if(e.getSource()==b1){
                if(p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter New Pin");
                }
                if(p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter Correct Pin");
                }
                JOptionPane.showMessageDialog(null, "Entered pin is "+pin1);

                Cont c=new Cont();
                String q1="update bank set pin ='"+pin1+"' where pin ='"+pin+"'";
                String q2="update login set pin ='"+pin1+"' where pin ='"+pin+"'";

                String q3="update signupthree set pin ='"+pin1+"' where pin ='"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog( null, "PIN Entered Successfully");
                setVisible(false);
                new Main_class(pin);



            }
            else if(e.getSource()==b2){
                new Main_class(pin);
                setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();;
        }
        
    }
    public static void main(String [] args){
        new Pin("");

    }
    
}
