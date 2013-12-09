// HelloWorld.java

import javax.swing.*;
import javax.imageio.*;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.io.*;
import java.util.*;
import java.awt.event.*;


class Enemy {

	private double x, y, dx, dy;
	private Image [] zombie;
	private Image tombstone;
	private int current;
	private boolean right = true;
	private boolean moving = true;
	private boolean firstPass = true;
	private boolean rebound = false;
	/* time between flips in the animation */
	private static final double FLIP_TIME = 0.050;
	/* time since last flip */
	private double timer = 0.0;
	private int zomType;
	private boolean alive = true;
	private int health = 100;
	private int startHealth = 100;


	public Enemy(int i) {
		zomType = i;
		System.out.println(i);
		if (alive){
			Random r = new Random();
			x = r.nextFloat( ) * 450;
			y = r.nextFloat( ) * 450;


			//make sure zombies start at the top
			if (firstPass == true){
				y = 500;
				firstPass = false;
			}

			/* these are now pixels / second instead of pixels per frame */
			dx = r.nextFloat( )*50 - 25;
			dy = r.nextFloat( )*50 + 100;

		}
		/* load all the images */
		try {

			zombie = new Image[5];
			if (zomType == 0){
				zombie[0]  = ImageIO.read(new File("z1.png"));
				zombie[1]  = ImageIO.read(new File("z2.png"));
				zombie[2]  = ImageIO.read(new File("z3.png"));
				zombie[3]  = ImageIO.read(new File("z4.png"));
			}
			if (zomType == 1){
				zombie[0]  = ImageIO.read(new File("a1.png"));
				zombie[1]  = ImageIO.read(new File("a2.png"));
				zombie[2]  = ImageIO.read(new File("a3.png"));
				zombie[3]  = ImageIO.read(new File("a4.png"));
			}
			if (zomType == 2){
				zombie[0]  = ImageIO.read(new File("b1.png"));
				zombie[1]  = ImageIO.read(new File("b2.png"));
				zombie[2]  = ImageIO.read(new File("b3.png"));
				zombie[3]  = ImageIO.read(new File("b4.png"));
			}
			if (zomType == 3){
				zombie[0]  = ImageIO.read(new File("c1.png"));
				zombie[1]  = ImageIO.read(new File("c2.png"));
				zombie[2]  = ImageIO.read(new File("c3.png"));
				zombie[3]  = ImageIO.read(new File("c4.png"));
			}
			if (zomType == 4){
				zombie[0]  = ImageIO.read(new File("d1.png"));
				zombie[1]  = ImageIO.read(new File("d2.png"));
				zombie[2]  = ImageIO.read(new File("d3.png"));
				zombie[3]  = ImageIO.read(new File("d4.png"));
			}
			if (zomType > 4){
				zombie[0]  = ImageIO.read(new File("d1.png"));
				zombie[1]  = ImageIO.read(new File("d2.png"));
				zombie[2]  = ImageIO.read(new File("d3.png"));
				zombie[3]  = ImageIO.read(new File("d4.png"));
			}
			tombstone = ImageIO.read(new File("tombstone.png"));
		} catch(Exception e) {

			zombie = null;
		}
		current = 0;
	}

	public void draw(Graphics g) {
		/* add to the index if going left */
		int add = 0;
		if(!right) add = 2;

		/* draw zombie on the screen */
		if (alive == true){
			g.drawImage(zombie[current + add], (int)x, (int)y, null);
		}
		else{
			g.drawImage(tombstone, (int)x, (int)y, null);
		}
	}


	public void update(double dt) {
		if (alive){
			if (rebound == false){
				x += (dx * dt);
				y += (dy * dt);
			}
			else{
				x -= (dx * dt);
				y += (dy * dt);
			}

			if(y < 0) y = 500;
			if(y > 500) y = 0;
			if(x < 0){
				if (rebound == false){
					rebound = true;
				}
				else{
					rebound = false;
				}
				//x = 500;
			}
			if(x > 500){
				if (rebound == false){
					rebound = true;
				}
				else{
					rebound = false;
				}
			}

			/* update animation */
			if(moving) {
				timer += dt;
				if(timer > FLIP_TIME) {
					timer = 0;
					current = (current + 1) % 4;
				}
			}
		}
	}


	public Rectangle2D.Double getZombie(){		
		return new Rectangle2D.Double(x, y, 29, 32);
	}


	public void registerShots(int damage){
		health = health - damage;
		if (health <= 0){
			alive = false;
		}
	}
	public boolean checkLife(){
		return alive;
	}

	public void tempHealthTest(){
		health = health - 50;
		if (health <= 0){
			alive = false;
		}
	}


	//level up the zombies
	public void levelUpHealth() {
		// TODO Auto-generated method stub
		startHealth += 50;
		health = startHealth;
		alive = true;
		y = 500;
	}

	public void reAnimate(){
		alive = true;
		y = 500;
		health = startHealth;

	}


}


class GameWorld extends JComponent implements KeyListener {
	private ArrayList<Enemy> EnemyFactory;
	private long elapsed;
	private boolean levelUp = false;
	private int zombiesDead = 0;
	private int numZombies = 5;
	private int ZombiesInLevel = 15;
	private int zombiesAlive;
	private double zombieSpeed = 5000f;
	private int zombiesAdded;
	
	public GameWorld( ) {
		elapsed = new Date( ).getTime( );
		EnemyFactory = new ArrayList<Enemy>( );


		//update the i < # for different number of enemies
		for(int i = 0; i < numZombies; i++) {
			EnemyFactory.add(new Enemy(i));
		}
		
		
		
	}

	public void runningGame(){
		//reset to check each time
		zombiesDead = 0;
		zombiesAlive = 0;
		//check status on all zombies to see if any are still alive
		for(Enemy f : EnemyFactory) {
			//if it returns true, it means at least one is still alive.
			if (f.checkLife() == false){
				zombiesDead += 1;
			}
			else{
				zombiesAlive += 1;
			}
		}
		if (zombiesDead == ZombiesInLevel){
			levelUp = true;
			//////////////////////
			//update whole game
		}
		else{
			int ZombiesNeeded = ZombiesInLevel - zombiesDead - zombiesAlive - zombiesAdded;
			
			System.out.println("Zombies needed : " + ZombiesNeeded + "  zombies added : " + zombiesAdded);
			for(Enemy f : EnemyFactory) {
				if (f.checkLife() == false){
					if (ZombiesNeeded > 0){
						ZombiesNeeded -= 1;
						zombiesAdded += 1;
						f.reAnimate();
						//System.out.println("in reanimate");
					}
				}
			}
		}
	}



	//test zombies with key strokes.
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT){
			for(Enemy f : EnemyFactory) {
				//decrease zombie health
				f.tempHealthTest();


			}
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT){
			for(Enemy f : EnemyFactory) {
				//decrease zombie health
				f.levelUpHealth();
				numZombies += 3;
				zombieSpeed -=1000;
			}
		}
	}

	public void levelUP(){
		if (levelUp == true){

			//increase zombie speed
			zombieSpeed -= 1000;
			//increase zombie number
			numZombies += 3;
			for(Enemy f : EnemyFactory) {
				//increase zombie health
				f.levelUpHealth();	
			}
			//stop the levelUP
			levelUp = false;
		}
	}



	public void paintComponent(Graphics g) {
		/* set the color to light blue */
		g.setColor(new Color(100, 150, 255));
		g.fillRect(0, 0, 500, 500);


		//check status on zombies alive/vs dead
		for(Enemy f : EnemyFactory) {
			f.draw(g);
		}


		/* now update */
		long time_now = new Date( ).getTime( );

		//update the divided number higher to go slower
		double seconds = (time_now - elapsed) / zombieSpeed;
		//System.out.println(seconds);
		for(Enemy f : EnemyFactory) {
			f.update(seconds);
			elapsed = time_now;
		}

		runningGame();
		
		/* force an update */
		revalidate( );
		repaint( );
		/* sleep for 1/20th of a second */
		try {
			Thread.sleep(50);
		} catch(InterruptedException e) {
			Thread.currentThread( ).interrupt( );
		}
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}


public class enemyClass {
	public enemyClass(){
		GameWorld = new GameWorld();
	}
}
