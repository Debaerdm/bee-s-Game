package View;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import GameObject.Pot;
import Models.World;

public class PotView implements View {

	private ImageIcon imgPot;
	private World world;
	private Pot pot;
	
	public PotView(World world, Pot pot) {
		this.world = world;
		this.pot = pot;
		imgPot = new ImageIcon(new ImageIcon("src/ressources/pot.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
