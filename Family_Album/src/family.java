import javax.swing.*;
import java.awt.*;

public class family extends JFrame {


    public ImageIcon icon;
    public JButton peter;
    public JButton lois;
    public JButton meg;
    public JButton chris;
    public JButton stewie;
    public JButton brian;
    public JButton back;
    public JPanel my_panel;
    public JLabel my_label;



    family(){

        icon = new ImageIcon("GIF\\Peter.gif");


        peter = new JButton("Peter");
        peter.setBounds(188,170,195,100);
        peter.setBackground(new Color(0,0,0));
        peter.setFont(new Font("Arial", Font.PLAIN,25));
        peter.setForeground(new Color(160,200,90));
        peter.setFocusable(false);
        peter.addActionListener(e->{
            new Peter();
            this.dispose();
        });

        lois = new JButton("Lois");
        lois.setBounds(422,170,195,100);
        lois.setBackground(new Color(0,0,0));
        lois.setFont(new Font("Arial", Font.PLAIN,25));
        lois.setForeground(new Color(160,200,90));
        lois.setFocusable(false);
        lois.addActionListener(e->{
           new Lois();
           this.dispose();
        });

        meg = new JButton("Meg");
        meg.setBounds(188,350,195,100);
        meg.setBackground(new Color(0,0,0));
        meg.setFont(new Font("Arial", Font.PLAIN,25));
        meg.setForeground(new Color(160,200,90));
        meg.setFocusable(false);
        meg.addActionListener(e->{
            new Meg();
            this.dispose();
        });

        chris = new JButton("Chris");
        chris.setBounds(422,350,195,100);
        chris.setBackground(new Color(0,0,0));
        chris.setFont(new Font("Arial", Font.PLAIN,25));
        chris.setForeground(new Color(160,200,90));
        chris.setFocusable(false);
        chris.addActionListener(e->{
            new Chris();
            this.dispose();
        });

        stewie = new JButton("Stewie");
        stewie.setBounds(188,520,195,100);
        stewie.setBackground(new Color(0,0,0));
        stewie.setFont(new Font("Arial", Font.PLAIN,25));
        stewie.setForeground(new Color(160,200,90));
        stewie.setFocusable(false);
        stewie.addActionListener(e->{
            new Stewie();
            this.dispose();
        });

        brian = new JButton("Brian");
        brian.setBounds(422,520,195,100);
        brian.setBackground(new Color(0,0,0));
        brian.setFont(new Font("Arial", Font.PLAIN,25));
        brian.setForeground(new Color(160,200,90));
        brian.setFocusable(false);
        brian.addActionListener(e->{
            new Brian();
            this.dispose();
        });

        back = new JButton("Back");
        back.setBounds(650,370,100,70);
        back.setBackground(new Color(0,0,0));
        back.setFont(new Font("Arial", Font.PLAIN,15));
        back.setForeground(new Color(160,200,90));
        back.setFocusable(false);
        back.addActionListener(e->{
            new Menu();
            this.dispose();
        });


        my_label = new JLabel("Family members");
        my_label.setFont(new Font("Arial",Font.PLAIN,70));
        my_label.setForeground(new Color(160,200,90));

        my_panel = new JPanel();
        my_panel.setBounds(0,0,800,100);
        my_panel.setBackground(new Color(0,0,0));
        my_panel.add(my_label);



        this.setTitle("Family Album");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(800,700));
        this.setResizable(false);
        this.setIconImage(icon.getImage());
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(160,200,90));
        this.add(my_panel);
        this.add(peter);
        this.add(lois);
        this.add(meg);
        this.add(chris);
        this.add(stewie);
        this.add(brian);
        this.add(back);
        this.setVisible(true);

    }

}
