package View;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Models.World;

public class WorldView extends JPanel implements Observer {

	private List<View> views;
	private World world;
	private ImageIcon background;
	private ImageIcon background2;
	
	public WorldView(World world) {
		this.world = world;
		views = new ArrayList<View>();
		background = new ImageIcon(new ImageIcon("src/ressources/smartphone.png").getImage().getScaledInstance(1600, 860, Image.SCALE_DEFAULT));
		background2 = new ImageIcon(new ImageIcon("src/ressources/prairie.jpg").getImage().getScaledInstance(1150, 760, Image.SCALE_DEFAULT));
	}
	

	
	public void paint(Graphics g) {
		g.drawImage(background.getImage(), 0, 0, null);
		g.drawImage(background2.getImage(), 280, 50, null);
		
		for(View view : views) {
			view.paint(g);
		}
	}
	
	public void addView(View view) {
		views.add(view);
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		repaint();
	}
}
