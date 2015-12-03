package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import GameObject.Bee;
import GameObject.Pot;
import View.WorldView;

public class World extends Observable {

	private Bee bee;
	private List<Pot> pots;
	private WorldView view;
	
	public World() {
		bee = new Bee(this);
		pots = new ArrayList<Pot>();
		view = new WorldView(this);
		initPot();
	}
	
	public void initPot() {
		for(int i = 0; i < 3; i ++) {
			pots.add(new Pot(this));
		}
	}
	
	public WorldView getView() {
		return view;
	}
}
