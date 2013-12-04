import java.awt.*;

public class Shot implements Cloneable{

	double xSpeed;
	double ySpeed;
	double speed;

	double xCo;
	double yCo;

	public Shot(double pX, double pY, double pSpeed) {
		xCo = pX;
		yCo = pY;
		speed = pSpeed;
	}

	public Shot clone() {
		return new Shot(xCo,yCo,speed);
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

	public void move() {
		xCo += xSpeed;
		yCo += ySpeed;
	}

	public void upkeep(Graphics g) {
		move();
		draw(g);
	}

	public boolean collide(Shape shape) {
		if(shape.contains(xCo,yCo)) {

		}
		return false;
	}

	public boolean exists() {
		return true;
	}

}