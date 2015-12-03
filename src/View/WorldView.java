package View;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

import Models.World;

public class WorldView implements Observer {

	private List<View> views;
	private World world;
	
	public WorldView(World world) {
		this.world = world;
	}
	
	public void addView(View view) {
		views.add(view);
	}
	
	
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
}
