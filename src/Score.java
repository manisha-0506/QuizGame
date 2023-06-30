import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(0, 0, 1600, 900);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("imgmusic/loginjava.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(380, 310, 580, 350);
        add(image);

        JLabel heading = new JLabel("Thank You " + name + " for playing JavaWhiz quiz game");
        heading.setBounds(420, 50, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        heading.setForeground(new Color(255,255,240));
        add(heading);

        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(570, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        lblscore.setForeground(new Color(255,255,240));
        add(lblscore);

        JButton submit = new JButton("Play Again");
        submit.setBounds(600, 270, 120, 30);
        submit.setBackground(new Color(255, 255, 255));
        submit.setForeground(Color.BLACK);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
