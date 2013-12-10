import java.awt.*;
import java.util.*;

public class Shot implements Cloneable{
<<<<<<< HEAD
    
=======

>>>>>>> a3c0b546198ff2b071cb3da7cde7e2125885c523
	private double xSpeed;
	private double ySpeed;
	private double speed;
	private int damage=10;
	private boolean exists;
<<<<<<< HEAD
    
	private double xCo;
	private double yCo;
    
=======

	private double xCo;
	private double yCo;

>>>>>>> a3c0b546198ff2b071cb3da7cde7e2125885c523
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
<<<<<<< HEAD
    
=======

>>>>>>> a3c0b546198ff2b071cb3da7cde7e2125885c523
	public void setLocation(double x, double y) {
		xCo = x;
		yCo = y;
	}
<<<<<<< HEAD
    
	public void move(double dt) {
		xCo += xSpeed * dt;
		yCo += ySpeed * dt;
        
		if(xCo < -50 || yCo < -50 || xCo > 1000 || yCo > 1000) {
			exists = false;
		}
=======

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

>>>>>>> a3c0b546198ff2b071cb3da7cde7e2125885c523
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
<<<<<<< HEAD
    
	public int getDamage() {
		return damage;
	}
    
=======

	public int getDamage() {
		return damage;
	}

>>>>>>> a3c0b546198ff2b071cb3da7cde7e2125885c523
	public boolean exists() {
		return true;
	}
    
}