import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {

    public JButton enter;
    public JLabel family_title;
    public JPanel panel;
    public ImageIcon icon;
    public JLabel peter;

    Menu(){

        icon = new ImageIcon("GIF\\Peter.gif");

        enter = new JButton("Enter");
        enter.setBounds(295,520,225,100);
        enter.setBackground(new Color(0,0,0));
        enter.setFont(new Font("Arial", Font.PLAIN,25));
        enter.setForeground(new Color(160,200,90));
        enter.setFocusable(false);
        enter.addActionListener(e -> {
                new family();
                this.dispose();
        });

        family_title = new JLabel("Family Guy");
        family_title.setFont(new Font("Arial",Font.PLAIN,70));
        family_title.setForeground(new Color(160,200,90));

        peter = new JLabel(icon);
        peter.setBounds(225 , 150,350,320);

        panel = new JPanel();
        panel.setBounds(0,0,800,100);
        panel.setBackground(new Color(0,0,0));
        panel.add(family_title);


        this.setTitle("Menu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(800,700));
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(160,200,90));
        this.add(enter);
        this.add(panel);
        this.add(peter);
        this.setVisible(true);

    }

}
