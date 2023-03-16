import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class FallDownComponent extends JComponent implements KeyListener, Runnable
{
	private FallDownEngine engine;
	private boolean leftPressed, rightPressed;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;
    static Color gameBGColor;
    public String playerName;
    public int DELAY;

	public FallDownComponent()
	{
		super();
       
		engine = new FallDownEngine();
 		this.setPreferredSize(new Dimension(engine.WIDTH, engine.HEIGHT));
        this.setBackground(gameBGColor);
        this.setFocusable(true);
 		this.addKeyListener(this);
 		Thread run = new Thread(this);
 		run.start();
	}

	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(20);
			}
			catch(Exception ex)
			{
			}
			requestFocus();
			update();
			repaint();
		}
	}

	public void paint(Graphics g)
	{
		synchronized(g)
		{
			engine.draw(g);
		}
	}

	public void update()
	{
		if(leftPressed)
			engine.moveLeft();
		if(rightPressed)
			engine.moveRight();
		engine.update();
	}

	public void keyPressed(KeyEvent ke)
	{
		if(ke.getKeyCode() == KeyEvent.VK_LEFT)
			leftPressed = true;
		else if(ke.getKeyCode() == KeyEvent.VK_RIGHT)
			rightPressed = true;
	}

	public void keyReleased(KeyEvent ke)
	{
		if(ke.getKeyCode() == KeyEvent.VK_LEFT)
			leftPressed = false;
		else if(ke.getKeyCode() == KeyEvent.VK_RIGHT)
			rightPressed = false;
	}

	public void keyTyped(KeyEvent ke)
	{
	}
}