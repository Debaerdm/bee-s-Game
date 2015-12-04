package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

import Models.World;

public class GameOver extends JPanel implements ActionListener {

	private JButton restart;
	private Frame frame;
	private ImageIcon background;
	
	public GameOver(Frame frame) {
		this.frame = frame;
		background = new ImageIcon(new ImageIcon("src/ressources/gameover.png").getImage().getScaledInstance(1600, 860, Image.SCALE_DEFAULT));
		setLayout(new BorderLayout());
		restart = new JButton("RESTART");
		restart.setSize(new Dimension(200,200));
		add(restart, BorderLayout.CENTER);
		
		JPanel boutons = new JPanel();
		boutons.setOpaque(false);
		BoxLayout layout = new BoxLayout(boutons, BoxLayout.Y_AXIS);
		boutons.setLayout(layout);
		
		restart.setFont(restart.getFont().deriveFont(50f));
		restart.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		restart.setAlignmentY(JComponent.CENTER_ALIGNMENT);
		boutons.add(Box.createVerticalGlue());
		boutons.add(restart);
		boutons.add(Box.createVerticalGlue());
		add(boutons, BorderLayout.CENTER);
		restart.addActionListener(this);
	}
	
	public void paint(Graphics g) {
		g.drawImage(background.getImage(), 0, 0, frame);
		g.setFont(new Font("BOLD", 60, 60));
		g.drawString("YOUR SCORE : " + frame.getWorld().getScore(), 70, 700);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.getWorld().reset();
		frame.getCl().show(frame.getCards(), "WORLD");
	}
	
}
