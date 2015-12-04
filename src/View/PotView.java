package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import GameObject.Pot;
import Models.World;

public class PotView implements View {

	private ImageIcon imgPot;
	private World world;
	private Pot pot;
	private Rectangle hitbox;
	
	public PotView(World world, Pot pot) {
		this.world = world;
		this.pot = pot;
		
		imgPot = new ImageIcon(new ImageIcon("src/ressources/fleur.png").getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT));
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(imgPot.getImage(), (int) pot.getCoord().getX(), (int) pot.getCoord().getY(), null);
		g.setColor(pot.getColor());
		g.fillOval((int) pot.getCoord().getX() + 72,(int) pot.getCoord().getY() + 93, 100, 100);
		g.drawRect(hitbox.x, hitbox.y, hitbox.width, hitbox.height);
		
	}
	
	public void setColor(Color color) {
		pot.setColor(color);
	}
	
	public void setHitbox(Rectangle r) {
		this.hitbox = r;
	}
	
	public Rectangle getHitbox() {
		return hitbox;
	}
}
