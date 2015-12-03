package GameObject;

import java.awt.Color;

import Models.World;

public class GameObject {
	
	private Coordonnees coord;
	private Color color;
	private World world;
	
	public GameObject(World world) {
		this.world = world;
	}
	
	public World getWorld() {
		return world;
	}
}
