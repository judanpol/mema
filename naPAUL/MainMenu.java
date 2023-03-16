import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class MainMenu extends JFrame{
    MainMenu(){


        JLabel imageLabel = new JLabel();
        ImageIcon snakeImage = new ImageIcon("zuma.gif");
        imageLabel.setIcon(snakeImage);


        JButton startButton = new JButton();
        startButton.setText("START GAME");
        startButton.setFont(new Font("CAMBRIA", Font.BOLD, 30));

        this.add(imageLabel);
        this.add(startButton);
        this.setLayout(new FlowLayout());
        EventHandler handler = new EventHandler();
        startButton.addActionListener(handler);

        this.setTitle("PAUL DOWN");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        this.setResizable(false);
        this.getContentPane().setBackground(Color.gray);
 }

   private class EventHandler implements ActionListener{

    public void actionPerformed(ActionEvent event){
        new DifficultyMenu();
        dispose();


}
   }
}