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
        ImageIcon pongimage = new ImageIcon("pongg.gif");
        imageLabel.setIcon(pongimage);


        JButton startButton = new JButton();
        startButton.setText("START GAME");
        startButton.setFont(new Font("CAMBRIA", Font.BOLD, 30));

        this.add(imageLabel);
        this.add(startButton);
        this.setLayout(new FlowLayout());
        EventHandler handler = new EventHandler();
        startButton.addActionListener(handler);

        this.setTitle("PONG MO TO ");
        this.setSize(450,550);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        this.setResizable(false);
        this.getContentPane().setBackground(Color.BLACK);
 }

   private class EventHandler implements ActionListener{

    public void actionPerformed(ActionEvent event){
        new DifficultyMenu();
        dispose();


}
   }
}