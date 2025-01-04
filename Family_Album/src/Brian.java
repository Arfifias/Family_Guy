import javax.swing.*;
import java.awt.*;

public class Brian extends JFrame{

    public ImageIcon icon;
    public ImageIcon icon2;
    public JButton back;
    public JLabel brian;

    Brian(){


        icon = new ImageIcon("Brian\\Brian.gif");
        icon2 = new ImageIcon("GIF\\Peter.gif");

        brian = new JLabel(icon);
        brian.setBounds(200,130,400,350);

        back = new JButton("Back");
        back.setBounds(325,540,150,75);
        back.setBackground(new Color(0,0,0));
        back.setFont(new Font("Arial", Font.PLAIN,15));
        back.setForeground(new Color(160,200,90));
        back.setFocusable(false);
        back.addActionListener(e->{
            new family();
            this.dispose();
        });


        this.setTitle("Brian");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(800,700));
        this.setResizable(false);
        this.setIconImage(icon.getImage());
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(160,200,90));
        this.add(brian);
        this.add(back);
        this.setVisible(true);
    }

}