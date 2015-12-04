package View;

import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Models.World;

public class Frame extends JFrame {

	private World world;
	private Menu menu;
	private GameOver gameover;
	private JPanel cards;
	private CardLayout cl;
	
	public Frame() {
		super("Bee's Game");
		this.world = new World(this);
		this.menu = new Menu(this);
		this.gameover = new GameOver(this);
		
		setSize(new Dimension(1600, 900));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);

		this.cards = new JPanel(new CardLayout());
		this.cl = new CardLayout();
		cards.setLayout(cl);
		cards.add(world.getView(), "WORLD");
		cards.add(menu, "MENU");
		cards.add(gameover, "GAMEOVER");
		add(cards);
		cl.show(cards, "MENU");
		setVisible(true);
		
		
	}
	
	public World getWorld() {
		return world;
	}
	
	public void setWorld(World world) {
		this.world = world;
	}
	
	public CardLayout getCl() {
		return cl;
	}
	
	public void setCl(CardLayout cl) {
		this.cl = cl;
	}
	
	public JPanel getCards() {
		return cards;
	}
}
