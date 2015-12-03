package GameObject;

import Models.World;
import View.PotView;

public class Pot extends GameObject{

	private PotView view;
	private Pot pot;
	
	public Pot(World world) {
		super(world);
		this.getWorld().getView().addView(view);
	}
}
