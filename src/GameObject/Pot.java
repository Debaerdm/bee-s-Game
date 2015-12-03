package GameObject;

import Models.World;
import View.PotView;

public class Pot extends GameObject{

	private PotView view;
	
	public Pot(World world) {
		super(world);
		view = new PotView(world, this);
		this.getWorld().getView().addView(view);
	}
}
