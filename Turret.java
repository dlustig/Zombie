import java.util.*;
import java.awt.*;

public class Turret {

	int xCo;
	int yCo;
	int xDist;

	int recharge;
	int cooldown;

	Shot typeShot;

	LinkedList<Shot> magazine;

	AnimatedBar reloadBar;

	boolean activated;

	public Turret(int pX, int pY, int pCooldown, Shot type) {
		xCo = pX;
		yCo = pY;
		typeShot = type;
		cooldown = pCooldown;
		magazine = new LinkedList<Shot>();
		recharge = 0;
		reloadBar = new AnimatedBar(cooldown, 10, Color.RED);
		activated = false;
	}

	public void setActive(boolean pActive) {
		activated = pActive;
	}

	public boolean isActivated() {
		return activated;
	}

	public void fire(int locX, int locY) {
		if(recharge >= cooldown) {
			Shot toBeAdded = typeShot.clone();
			toBeAdded.setDestination(locX, locY);
			magazine.add(toBeAdded);
			recharge = 0;
		}
	}

	public void draw(Graphics g) {
		g.setColor(activated?Color.GREEN:Color.BLUE);
		g.fillRect(xCo-15,yCo-15,30,30);
	}

	public void upkeep(Graphics g) {

		draw(g);

		if(recharge < cooldown)
		{
			recharge++;
		}
		reloadBar.update(recharge);

		reloadBar.draw(xCo, yCo + 22, g);

		ListIterator<Shot> iter = magazine.listIterator();
		while(iter.hasNext()) {
			Shot nextShot = iter.next();
			nextShot.upkeep(g);
			if(nextShot.exists() == false) {
				iter.remove();
			}
		}
	}
}