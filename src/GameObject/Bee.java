package GameObject;

import java.awt.Color;

import Models.World;
import View.BeeView;

public class Bee extends GameObject {
	
	private BeeView view;
	
	public Bee(World world) {
		super(world);
		view = new BeeView(world, this);
		world.getView().addView(view);
	}
	
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
}
