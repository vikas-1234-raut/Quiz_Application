import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {

        setBounds(400, 150, 700, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("./images/score.png"));
        //Scale the image 
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);
         // create heading for thinyou to user 
        JLabel heading = new JLabel("Thank you " + "vikas" + " for playing Brain Tease");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);

        // for displaying  score
        JLabel lblscore = new JLabel(" Your score is " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblscore);

        JButton submit = new JButton("Play Again");
        submit.setBounds(380, 270, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        
        add(submit);

        

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
         setVisible(false);
         new Login();
    }

    public static void main(String[] args) {
        new Score("user", 0);
    }
}
