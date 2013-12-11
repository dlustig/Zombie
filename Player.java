import java.util.*;
import java.awt.event.*;
import java.awt.*;

public class Player implements KeyListener, MouseListener, MouseMotionListener {

	final double LEVEL_VAL = 1.2;

	final int WEST = 0;
	final int SOUTH = 1;
	final int EAST = 2;

	private int xMouse = 300,yMouse = 300;

	private ArrayList<Enemy> enemyList = new ArrayList<Enemy>();
	private Turret[] turrets;

	private boolean disabled;
	private boolean firing;

	//takes the list of enemies for which the shots of the turrets will need to test hit detection
	public Player(ArrayList<Enemy> pList) {

		disabled = false;

		enemyList = pList;

		turrets = new Turret[3];

		turrets[WEST] = new Turret(0,100,.1,1,new TurretReader("turret1.png"),new Shot(0+17,100+22,1200,70));
		turrets[SOUTH] = new Turret(300,500,.02,3,new TurretReader("turret3.png"),new Shot(300+17,500+22,2400,5));
		turrets[EAST] = new Turret(550,100,.2,2,new TurretReader("turret2.png"),new Shot(550+17,100+22,1200,30));
		turrets[SOUTH].setActive(true);
	}

	//increasing turret damage
	public void levelUp() {
		for(Turret t: turrets) {
			t.levelUp(LEVEL_VAL);
		}
	}

	//disables turret firing for when the game is over
	public void disable() {
		disabled = true;
		for(Turret t:turrets) {
			t.setActive(false);
		}
	}

	public void upkeep(double dt, Graphics g) {
		for(int index = 0; index < turrets.length; index++) {
			turrets[index].upkeep(dt,xMouse,yMouse,enemyList,g);
		}
		for(int index = 0; index < turrets.length; index++) {
			if(firing == true &&turrets[index].isActivated()) {
				turrets[index].fire(xMouse,yMouse);
				firing = false;//Take out this line to allow hold mouse firing;
			}
		}
	}


	public void setEnemyArray(ArrayList<Enemy> el) {
		enemyList = el;
	}

	//MouseListener methods

	public void mousePressed(MouseEvent m) {

		int xLoc = m.getX();
		int yLoc = m.getY();

		firing = true;


	}
	public void mouseReleased(MouseEvent m){
		firing = false;
	}
	public void mouseClicked(MouseEvent m){}
	public void mouseEntered(MouseEvent m){}
	public void mouseExited(MouseEvent m){}

	//KeyListener methods

	public void keyTyped(KeyEvent k) {
		char key = k.getKeyChar();

		if(!disabled) {

			switch(key) {
				case 'a':
					turrets[WEST].setActive(true);
					turrets[SOUTH].setActive(false);
					turrets[EAST].setActive(false);
					break;
				case 's':
					turrets[WEST].setActive(false);
					turrets[SOUTH].setActive(true);
					turrets[EAST].setActive(false);
					break;
				case 'd':
					turrets[WEST].setActive(false);
					turrets[SOUTH].setActive(false);
					turrets[EAST].setActive(true);
					break;
				default:
			}
		}
	}
	public void keyPressed(KeyEvent k){}
	public void keyReleased(KeyEvent k){}

	//MouseMotionListener methods

	public void mouseMoved(MouseEvent m){
		xMouse = m.getX();
		yMouse = m.getY();
		//System.out.println(xMouse + ","+yMouse);
	}
	public void mouseDragged(MouseEvent m) {
		xMouse = m.getX();
		yMouse = m.getY();
	}

}
