import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Login extends JFrame implements ActionListener{
    JButton rules,back;
    JTextField tfname;


    Login()
    {

        //setBounds(0, 0, 1600, 900);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);


        JLabel heading = new JLabel("Welcome to JavaWhiz");
        heading.setBounds(450, 100, 900, 60);
        heading.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        heading.setForeground(new Color(255,255,240));

        add(heading);

        JLabel name = new JLabel("Enter your Name:");
        name.setBounds(520, 220, 300, 20);
        name.setFont(new Font("Times New Roman", Font.BOLD, 24));
        name.setForeground(new Color(255, 240, 255));

        add(name);

        tfname = new JTextField();
        tfname.setBounds(520, 260, 260, 32);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));

        add(tfname);

        rules = new JButton("RULES");
        rules.setBounds(420, 350, 120, 25);
        rules.setBackground(new Color(255, 255, 255));
        rules.setForeground(Color.BLACK);
        rules.addActionListener(this);
        add(rules);

        back = new JButton("BACK");
        back.setBounds(780, 350, 120, 25);
        back.setBackground(new Color(255, 255, 255));
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);

        JLabel background = new JLabel(new ImageIcon(getClass().getResource("imgmusic/loginjava.jpg")));
        background.setBounds(200, 100, 900, 600);
        add(background);

        setSize(800, 700);
        setLocation(250, 10);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
       // setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Login();
    }


}