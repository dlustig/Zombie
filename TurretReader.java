import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class TurretReader {

	private BufferedImage animation = null;
	private int xOff;
	private int yOff;
	private int turretLength;

	public TurretReader(String fileString) {
		try {
				animation = ImageIO.read(new File(fileString));
		} catch(Exception e) {
			System.out.println("ERROR");
			System.out.println(e);
			e.printStackTrace();
		}
		yOff = animation.getHeight() / 2;
		xOff = animation.getWidth() / 3;
		turretLength = 2 * xOff;
	}

	public int getTurretLength () {
		return turretLength;
	}

	public int getXOff() {
		return xOff;
	}

	public int getYOff() {
		return yOff;
	}

	public BufferedImage getImage() {
		return animation;
	}
}