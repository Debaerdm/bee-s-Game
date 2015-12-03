package View;

import java.awt.Graphics;
import java.awt.Image;

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
	}

}
