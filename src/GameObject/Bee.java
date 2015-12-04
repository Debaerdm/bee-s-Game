package GameObject;

import java.awt.Color;
import java.util.Random;

import Models.MyColor;
import Models.World;
import View.BeeView;

public class Bee extends GameObject {
	
	private BeeView view;
	
	public Bee(World world) {
		super(world);
		Random r = new Random();
		int i = r.nextInt(3);
		this.color = MyColor.colors.get(i);
		view = new BeeView(world, this);
		world.getView().addView(view);
	}
	
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public BeeView getView() {
		return view;
	}
}
