import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PlayerMenu extends JFrame {

    JTextField textField;

    PlayerMenu() {
        super("Snake Game");
        this.setLayout(new FlowLayout());

        // JLabel
        JLabel label = new JLabel();
        label.setText("ENTER YOUR NAME : ");
        label.setFont(new Font("Cambria", Font.BOLD, 30));

        // JTextField
        textField = new JTextField(15);
        // Adds event to textfield
        EventHandler handler = new EventHandler();
        textField.addKeyListener(handler);

        // Add components to frame
        this.add(label);
        this.add(textField);

        // Close java program when closing window
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // dimension of frame
        this.setSize(350, 400);
        // makes frame appear
        this.setVisible(true);
        // set frame to center
        this.setLocationRelativeTo(null);
        // background color of frame
        this.getContentPane().setBackground(Color.yellow); 
    }

    private class EventHandler implements KeyListener {

        public void keyPressed(KeyEvent event) {

            GamePanel gp = new GamePanel();

            // If ENTER button is pressed, do this
            if (event.getKeyCode() == KeyEvent.VK_ENTER) {

                gp.playerName = textField.getText();

                // Close playermenu frame
                dispose();

                // Go to game frame
                new GameFrame();
            }
        }

        public void keyTyped(KeyEvent event) {
            //
        }

        public void keyReleased(KeyEvent event) {
            //
        }
    }
}