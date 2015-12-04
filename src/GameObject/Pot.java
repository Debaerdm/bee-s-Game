package GameObject;

import java.awt.Color;
import java.util.Random;

import Models.World;
import View.PotView;

public class Pot extends GameObject{

	private PotView view;
	private Color[] colors = new Color[]{Color.BLUE, Color.RED, Color.YELLOW};
	
	public Pot(World world) {
		super(world);
		
		view = new PotView(world, this);
		this.getWorld().getView().addView(view);
	}
	
	public void setCoord(int x, int y) {
		this.coord = new Coordonnee(x, y);
	}
	
	public Coordonnee getCoord() {
		return coord;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public PotView getView() {
		return view;
	}
}
