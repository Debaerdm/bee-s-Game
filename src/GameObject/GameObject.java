package GameObject;

import java.awt.Color;

import Models.World;

public class GameObject {
	
	protected Coordonnee coord;
	protected Color color;
	protected World world;
	
	public GameObject(World world) {
		this.world = world;
	}
	
	public World getWorld() {
		return world;
	}
}
