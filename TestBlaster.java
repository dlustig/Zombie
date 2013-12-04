import java.util.*;
import java.awt.*;
import javax.swing.*;

public class TestBlaster extends JFrame
{

	public TestBlaster()
	{
		super("Test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(new TestWindow());
		setSize(600,600);
		setVisible(true);


	}

	public static void main(String[] args) {
		TestBlaster t = new TestBlaster();

		while(true) {
			t.repaint();
		}
	}

}

class TestWindow extends JPanel{
	Player x = new Player();

	public TestWindow() {
		setFocusable(true);
		requestFocusInWindow();
		addMouseListener(x);
		addKeyListener(x);
	}

	public void paintComponent(Graphics g) {
		x.upkeep(g);
	}


}