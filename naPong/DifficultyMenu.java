import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DifficultyMenu extends JFrame {
    DifficultyMenu() {

        JLabel label = new JLabel();
        label.setText("CHOOSE YOUR DIFFICULTY: ");
        label.setFont(new Font("Cambria", Font.BOLD, 20));
        this.add(label);
        
        JButton easyButton = new JButton();
        easyButton.setText("EASY");
        easyButton.setFont(new Font("Arial", Font.BOLD, 30));
        EventHandler easyHandler = new EventHandler(200);
        easyButton.addActionListener(easyHandler);

        JButton mediumButton = new JButton();
        mediumButton.setText("MEDIUM");
        mediumButton.setFont(new Font("Arial", Font.BOLD, 30));
        EventHandler mediumHandler = new EventHandler(120);
        mediumButton.addActionListener(mediumHandler);

        JButton hardButton = new JButton();
        hardButton.setText("HARD");
        hardButton.setFont(new Font("Arial", Font.BOLD, 30));
        EventHandler hardHandler = new EventHandler(40);
        hardButton.addActionListener(hardHandler);

        this.add(easyButton);
        this.add(mediumButton);
        this.add(hardButton);

        this.setLayout(new FlowLayout());
        this.setTitle("PONG MO TO");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300,600);
        this.setLocationRelativeTo(null);
        this.setVisible(true); 
        this.setResizable(false);
        this.getContentPane().setBackground(Color.CYAN); 
    }

    private class EventHandler implements ActionListener {

        int ballSpeed;

        // Constructor
        EventHandler(int speed) {
            this.ballSpeed = speed;
        }

        public void actionPerformed(ActionEvent event) {
            GamePanel gp = new GamePanel();
            gp.DELAY = ballSpeed;

           
            // Goes to colormenu frame
            new ColorMenu();

            // Closes difficulty menu frame
            dispose();
        }
    }
}
