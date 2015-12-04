package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import GameObject.Pot;
import Models.MyColor;
import Models.World;

public class WorldView extends JPanel implements Observer, MouseListener {

	private List<View> views;
	private World world;
	private ImageIcon background;
	private ImageIcon background2;
	private Timer t;
	
	public WorldView(World world) {
		t = new Timer();
		this.world = world;
		addMouseListener(this);
		views = new ArrayList<View>();
		background = new ImageIcon(new ImageIcon("src/ressources/smartphone.png").getImage().getScaledInstance(1600, 860, Image.SCALE_DEFAULT));
		background2 = new ImageIcon(new ImageIcon("src/ressources/prairie.jpg").getImage().getScaledInstance(1150, 760, Image.SCALE_DEFAULT));
	}
	

	
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 1600, 900);
		g.setColor(Color.BLACK);
		g.drawImage(background.getImage(), 0, 0, null);
		g.drawImage(background2.getImage(), 280, 50, null);
		g.setFont(new Font("BOLD", 30, 30));
		g.drawString("SCORE: " + world.getScore(), 300, 100);
		
		for(View view : views) {
			view.paint(g);
		}
	}
	
	public void addView(View view) {
		views.add(view);
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		world.getBee().getView().setColor();
		for(View view : views) {
			if(view instanceof PotView) {
				Random r = new Random();
				int i = r.nextInt(MyColor.colors.size());
				view.setColor(MyColor.colors.get(i));
				MyColor.colors.remove(i);
			}
		}
		MyColor.reset();
		repaint();
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mousePressed(MouseEvent e) {
				t.cancel();
				Point point = new Point(e.getLocationOnScreen().x - 200, e.getLocationOnScreen().y - 40);
				for(Pot pot : world.getPots()) {
					if(pot.getView().getHitbox().contains(point)) {
						if(pot.getColor().equals(world.getBee().getColor())) {
							
							world.setScore(world.getScore() + 1);
							world.update();
						}
						else
						{
							System.out.println("TON SCORE: " + world.getScore());
							world.getFrame().getCl().show(world.getFrame().getCards(), "GAMEOVER");
						}
					}
				}
				t = new Timer();
				t.scheduleAtFixedRate(new TimerTask() {
					int i = 0;
					@Override
					public void run() {
						i++;
						if(i == 2) {
							System.out.println("TON SCORE: " + world.getScore());
							world.getFrame().getCl().show(world.getFrame().getCards(), "GAMEOVER");
							
						}
					}
				}, 0, 800);	
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public List<View> getViews() {
		return views;
	}
}
