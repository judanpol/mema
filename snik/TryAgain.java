import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TryAgain extends JFrame{
    TryAgain(){
      
      JButton tryAgainButton = new JButton();
      tryAgainButton.setText("Babawi ako ");
      tryAgainButton.setFont(new Font("Cambria", Font.BOLD, 30));
      EventHandler handler = new EventHandler();
      tryAgainButton.addActionListener(handler);

      JButton exitButton = new JButton();
      exitButton.setText("Bounce na ako idol");
      exitButton.setFont(new Font("Cambria", Font.BOLD, 30));
      ExitHandler handlerr = new ExitHandler();
      exitButton.addActionListener(handlerr);

      this.add(tryAgainButton);
      this.add(exitButton);

      this.setLayout(new FlowLayout());
      this.setTitle("Snake Game ni PAuL");
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setSize(600,600);
      this.setLocationRelativeTo(null);
      this.setVisible(true); 
      this.setResizable(false);
      this.getContentPane().setBackground(Color.cyan);
    }
      private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            new GameFrame();
            dispose();
        }
    }
    private class ExitHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            dispose();

     
     }
  }
}