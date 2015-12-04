package Models;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Random;

import GameObject.Bee;
import GameObject.Pot;
import View.Frame;
import View.PotView;
import View.View;
import View.WorldView;

public class World extends Observable {

	private Bee bee;
	private List<Pot> pots;
	private WorldView view;
	private int score;
	private Frame frame;
	
	public World(Frame frame) {
		this.frame = frame;
		view = new WorldView(this);
		MyColor.init();
		setScore(0);
		bee = new Bee(this);
		pots = new ArrayList<Pot>();
		initPot();
		addObserver(view);
	}
	
	public void reset() {
		setScore(0);
	}
	
	public void initPot() {
		for(int i = 0; i < 3; i ++) {
			pots.add(new Pot(this));
			if(i == 0) {
				pots.get(i).setCoord(400, 500);
				pots.get(i).getView().setHitbox(new Rectangle(400, 500, 250, 300));
			}
			else if(i == 1) {
				pots.get(i).setCoord(750, 500);
				pots.get(i).getView().setHitbox(new Rectangle(750, 500, 250, 300));
			}
			else if(i == 2){
				pots.get(i).setCoord(1100, 500);
				pots.get(i).getView().setHitbox(new Rectangle(1100, 500, 250, 300));
			}
		}
		for(View view : view.getViews()) {
			if(view instanceof PotView) {
				Random r = new Random();
				int i = r.nextInt(MyColor.colors.size());
				view.setColor(MyColor.colors.get(i));
				MyColor.colors.remove(i);
			}
		}
		MyColor.reset();
	}
	
	
	public void update() {
		Random r = new Random();
		setChanged();
		notifyObservers();
		
	}
	
	public WorldView getView() {
		return view;
	}
	
	public List<Pot> getPots() {
		return pots;
	}
	
	public Bee getBee() {
		return bee;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public Frame getFrame() {
		return frame;
	}
}
