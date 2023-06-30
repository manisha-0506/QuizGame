import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setBounds(0, 0, 1800, 1100);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + ". Here are rules to play this game:");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 24));
        heading.setForeground(new Color(0, 0, 0));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 1700, 350);
        rules.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        rules.setText(
                "<html>"+
                        "1.The game consists of a series of multiple-choice questions. Each question has four options, labeled A, B, C, and D."+"<br> </br>"+"<br> </br>"+

                "2.The player's goal is to correctly answer as many questions as possible to win the game with maximum points."+"<br> </br>"+"<br> </br>"+

        "3.The player starts with the first question and progresses through a predetermined set of questions. The difficulty level generally increases with each question."+"<br> </br>"+"<br> </br>"+

        "4.The player can choose only one answer for each question by selecting the corresponding option (A, B, C, or D)."+"<br> </br>"+"<br> </br>"+

               "5.If the player is unsure about the correct answer, they can use the 50:50 lifeline. This lifeline eliminates two incorrect options, leaving the player with two remaining options and a higher chance of selecting the correct answer."+"<br> </br>"+"<br> </br>"+

               "6.To use the 50:50 lifeline, the player must indicate their choice before submitting their final answer. Once the lifeline is used, it cannot be used again for subsequent questions."+"<br> </br>"+"<br> </br>"+

                        "7. You will 15 seconds to answer each question." +"<br></br>"+"<br> </br>"+

                        "<html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(350, 500, 100, 30);
        back.setBackground(new Color(0, 0, 0));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(800, 500, 100, 30);
        start.setBackground(new Color(0, 0, 0));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new QueAndAns(name);
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}

