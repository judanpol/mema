import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

import java.awt.*;

public class ColorMenu extends JFrame {

    private String [] colornameArray = {"GREY", "LIGHT GREY", "WHITE", "BLACK"};

    private Color [] colorListArray = {Color.GRAY, Color.LIGHT_GRAY, Color.WHITE, Color.BLACK};
    JList colorList;

    ColorMenu(){

    JLabel label = new JLabel();
    label.setText("CHOOSE YOUR COLOR: ");
    label.setFont(new Font("Cambria", Font.BOLD, 25));
    this.add(label);

    colorList = new JList(colornameArray);
    colorList.setFont(new Font("Cambria", Font.BOLD, 30));
    colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    EventHandler handler = new EventHandler();
    colorList.addListSelectionListener(handler);

    this.add(colorList);

    this.setLayout(new FlowLayout());
    this.setTitle("Snake Game");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setSize(350,400);
    this.setLocationRelativeTo(null);
    this.setVisible(true); 
    this.setResizable(false);
    this.getContentPane().setBackground(Color.white);
  }
    
    private class EventHandler implements ListSelectionListener{

      public void valueChanged(ListSelectionEvent event){
        GamePanel gp = new GamePanel();
        gp.gameBGColor = colorListArray[colorList.getSelectedIndex()];

        new PlayerMenu();

        dispose();

    }
 }
}
   

