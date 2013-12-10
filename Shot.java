import java.awt.*;
import java.util.*;

public class Shot implements Cloneable{

	private double xSpeed;
	private double ySpeed;
	private double speed;
	private int damage=10;
	private boolean exists;

	private double xCo;
	private double yCo;

	public Shot(double pX, double pY, double pSpeed, int pDamage) {
		damage = pDamage;
		xCo = pX;
		yCo = pY;
		exists = true;
		speed = pSpeed;
	}

	public Shot clone() {
		return new Shot(xCo,yCo,speed,damage);
	}

	public void setDestination(int pX, int pY) {
		double distance = getDistanceTo(pX,pY);
		xSpeed = (pX - xCo) / distance * speed;
		ySpeed = (pY - yCo) / distance * speed;
	}

	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval((int)xCo-3,(int)yCo-3,7,7);
	}

	private double getDistanceTo(int xLoc, int yLoc) {
		return Math.sqrt((xCo-xLoc)*(xCo-xLoc) + (yCo-yLoc)*(yCo-yLoc));
	}

	public void setLocation(double x, double y) {
		xCo = x;
		yCo = y;
	}

	public void move(double dt) {
		xCo += xSpeed * dt;
		yCo += ySpeed * dt;

		if(xCo < -50 || yCo < -50 || xCo > 1000 || yCo > 1000) {
			exists = false;
		}
	}

	public void upkeep(double dt, ArrayList<Enemy> list, Graphics g) {
		move(dt);

		boolean draw = true;

		for(Enemy e: list) {
			if(collide(e.getZombie())) {
				e.registerShots(damage);
				exists = false;
			}
		}
		if(exists) {
			draw(g);
		}

	}

	public boolean collide(Shape shape) {
		if(shape.contains(xCo,yCo)) {
			return true;
		}
		return false;
	}

	public int getDamage() {
		return damage;
	}

	public boolean exists() {
		return true;
	}

}