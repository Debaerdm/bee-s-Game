package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;

import GameObject.Bee;
import Models.World;

public class BeeView implements View {

	private ImageIcon imgBee;
	private World world;
	private Bee bee;
	
	public BeeView(World world, Bee bee) {
		this.world = world;
		this.bee = bee;
		imgBee = new ImageIcon(new ImageIcon("src/ressources/bee.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(imgBee.getImage(), 750, 100, null);
		
		setColor();
		
		g.setColor(bee.getColor());
		g.fillOval(900, 150, 75, 75);
		g.setColor(Color.BLACK);
		g.drawOval(900, 150, 75, 75);
	}
	
	public void setColor() {
		Random r = new Random();
		int i = r.nextInt(3);
		switch(i){
			case 0:
				bee.setColor(Color.RED);
				break;
			case 1:
				bee.setColor(Color.BLUE);
				break;
			case 2:
				bee.setColor(Color.YELLOW);
				break;
			default:
				bee.setColor(Color.RED);	
		}
	}
}
