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
    label.setFont(new Font("Cambria", Font.BOLD, 20));
    this.add(label);

    colorList = new JList(colornameArray);
    colorList.setFont(new Font("Cambria", Font.BOLD, 35));
    colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    EventHandler handler = new EventHandler();
    colorList.addListSelectionListener(handler);

    this.add(colorList);

 
    this.setLayout(new FlowLayout());
    this.setTitle("PONG MO TO");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setSize(400,600);
    this.setLocationRelativeTo(null);
    this.setVisible(true); 
    this.setResizable(false);
    this.getContentPane().setBackground(Color.CYAN);
  }
    
    private class EventHandler implements ListSelectionListener{

      public void valueChanged(ListSelectionEvent event){
        GamePanel gp = new GamePanel();
        gp.BGColor = colorListArray[colorList.getSelectedIndex()];

        new PlayerMenu();

        dispose();

    }
 }
}
   