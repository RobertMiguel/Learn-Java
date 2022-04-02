import java.awt.Graphics;
import java.awt.Color;

public class BodyPart {
	
	private int xCoor, yCoor, width, heidth;
	
	public BodyPart(int xCoor, int yCoor, int tileSize) {
		this.xCoor = xCoor;
		this.yCoor = yCoor;
		width = tileSize;
		heidth = tileSize;
	}
	public void tick() {
		
	}
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(xCoor * width, yCoor * heidth, width, heidth);
	}
	public int getxCoor() {
		return xCoor;
	}
	public void setxCoor(int xCoor) {
		this.xCoor = xCoor;
	}
	public int getyCoor() {
		return yCoor;
	}
	public void setyCoor(int yCoor) {
		this.yCoor = yCoor;
	}
}

