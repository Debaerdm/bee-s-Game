package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
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

public class Menu extends JPanel implements ActionListener {

	private Frame frame;
	private JButton play;
	private ImageIcon background;
	
	public Menu(Frame frame) {
		this.frame = frame;
		background = new ImageIcon(new ImageIcon("src/ressources/menu_fond.png").getImage().getScaledInstance(1600, 900, Image.SCALE_DEFAULT));
		setLayout(new BorderLayout());
		play = new JButton("PLAY");
		play.setSize(new Dimension(200,200));
		add(play, BorderLayout.CENTER);
		JPanel boutons = new JPanel();
		boutons.setOpaque(false);
		BoxLayout layout = new BoxLayout(boutons, BoxLayout.Y_AXIS);
		boutons.setLayout(layout);
		play.setFont(play.getFont().deriveFont(50f));
		play.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		play.setAlignmentY(JComponent.CENTER_ALIGNMENT);
		boutons.add(Box.createVerticalGlue());
		boutons.add(play);
		boutons.add(Box.createVerticalGlue());
		add(boutons, BorderLayout.CENTER);
		play.addActionListener(this);
	}
	
	public void paint(Graphics g) {
		g.drawImage(background.getImage(), 0, 0, null);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	    frame.getCl().show(frame.getCards(), "WORLD");

	}

}
