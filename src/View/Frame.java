package View;

import java.awt.Dimension;

import javax.swing.JFrame;

import Models.World;

public class Frame extends JFrame {

	private World world;
	
	public Frame() {
		super("Bee's Game");
		this.world = new World();
		
		setSize(new Dimension(1600, 900));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		
		setVisible(true);
		
		add(world.getView());
	}
}
