package Bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Signup2 extends JFrame implements ActionListener{
    String formno;

    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JRadioButton r1,r2,e1,e2,e3;
    JTextField textpan,textAadhar;
    JButton next;
    Signup2(String first){
        super("APPLICATION FORM");



        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno=first;
        
        JLabel l1=new JLabel("Page 2 :-");
        l1.setFont(new Font("Raleway",Font.BOLD, 22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2=new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD, 22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3=new JLabel("Religion :");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox=new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4=new JLabel("Category :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String category[]={"General","OBC","SC","ST","Other"};
        comboBox2=new JComboBox(category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5=new JLabel("Income :");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String Income[]={"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBox3=new JComboBox(Income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);


        JLabel l6=new JLabel("Education :");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,270,100,30);
        add(l6);

        String education[]={"Non Graduate","Graduate","Post Graduation","Other"};
        comboBox4=new JComboBox(education);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7=new JLabel("Occupation :");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,320,100,30);
        add(l7);

        String Occupation[]={"Salaried","Self-Employed","Business","Student","Retired", "Other"};
        comboBox5=new JComboBox(Occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);

        JLabel l8=new JLabel("PAN Number :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,150,30);
        add(l8);

        textpan=new JTextField();
        textpan.setFont(new Font("Raleway",Font.BOLD,18));
        textpan.setBounds(350,370,320,30);
        add(textpan);

        JLabel l9=new JLabel("Aadhar Number :");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,420,150,30);
        add(l9);

        textAadhar=new JTextField();
        textAadhar.setFont(new Font("Raleway",Font.BOLD,18));
        textAadhar.setBounds(350,420,320,30);
        add(textAadhar);

        JLabel l10=new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,470,150,30);
        add(l10);

        r1=new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(250,208,76));
        r1.setBounds(350,470,100,30);
        add(r1);

        r2=new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(250,208,76));
        r2.setBounds(460,470,100,30);
        add(r2);

        ButtonGroup bt3=new ButtonGroup();
        bt3.add(r1);
        bt3.add(r2);
        
        JLabel l11=new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,520,150,30);
        add(l11);

        e1=new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        e1.setBackground(new Color(250,208,76));
        e1.setBounds(350,520,100,30);
        add(e1);

        e2=new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        e2.setBackground(new Color(250,208,76));
        e2.setBounds(460,520,100,30);
        add(e2);



        ButtonGroup bt4=new ButtonGroup();
        bt4.add(e1);
        bt4.add(e2);

        JLabel l12=new JLabel("Form No :");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setBounds(680,10,100,30);
        add(l12);

        JLabel l13=new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        l13.setBounds(740,10,60,30);
        add(l13);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.white);
        next.setForeground(Color.black);
        next.setBounds(570,630,100,30);
        next.addActionListener(this);
        add(next);










        
        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String rel=(String) comboBox.getSelectedItem();
        String cate=(String) comboBox2.getSelectedItem();
        String inc=(String) comboBox3.getSelectedItem();
        String edu=(String) comboBox4.getSelectedItem();
        String Occ=(String) comboBox5.getSelectedItem();

        String pan=textpan.getText();
        String aadhar=textAadhar.getText();

        String Scitizen="";
        if(r1.isSelected()){
            Scitizen="Yes";
        }

        if(r2.isSelected()){
            Scitizen="No";
        }
        String ExistingAcc="";
        if(e1.isSelected()){
            ExistingAcc="Yes";
        }

        if(e2.isSelected()){
            ExistingAcc="No";
        }

        try{
            if(textpan.getText().equals("")||textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }
            else{
                Cont cc1=new Cont();
                String q1="Insert into signupTwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+Occ+"','"+pan+"','"+aadhar+"','"+Scitizen+"','"+ExistingAcc+"')";
                cc1.statement.executeUpdate(q1);// while inserting data use executeupdate
                new Signup3(formno);
                setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();;
        }


        
        
    }
    public static void main (String[] args){
        new Signup2("");
    }

    
}
