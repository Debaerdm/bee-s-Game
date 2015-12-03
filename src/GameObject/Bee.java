package GameObject;

import Models.World;
import View.BeeView;

public class Bee extends GameObject {
	
	private BeeView view;
	
	public Bee(World world) {
		super(world);
		view = new BeeView(world, this);
		world.getView().addView(view);
	}
}
