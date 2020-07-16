package okienko;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import konsola.MyLine;
import rozgrywka.Game;

public class GameInFrameExample extends JFrame {

	private static final long serialVersionUID = 1L;
	Game newGame ;
	Label variant = new Label();
	Color green = new Color(0, 180, 0);
	Color blue = new Color(0, 0, 0);
	Font myFont = new Font("Helvetica", Font.BOLD+Font.ITALIC, 40);
	ImageIcon cardBack = new ImageIcon("src/main/resources/back_blue.jpg");
	ImageIcon cardBack2 = new ImageIcon("src/main/resources/DQ.png");
	JButton card1 = new JButton(cardBack);
	JButton card2 = new JButton(cardBack);
	JButton card3 = new JButton(cardBack);
	JButton card4 = new JButton(cardBack);
	JButton card5 = new JButton(cardBack);

	public GameInFrameExample() {
		super("Poker");
		variant.setFont(myFont);

		Panel up = new Panel();
		up.setLayout(new GridLayout(1, 1));
		up.setBackground(green);
		variant.setForeground(blue);
		up.add(variant);

		Panel medium = new Panel();
		medium.setLayout(new GridLayout(1, 8, 5, 0));
		medium.setBackground(green);
		Panel down = new Panel();
		down.setLayout(new GridLayout(1, 8, 5, 0));
		down.setBackground(green);
		setSize(1390, 760);
		setLocation(300, 100);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 1));
		this.add(up);
		this.add(medium);
		this.add(down);

		Panel buttons = new Panel();
		buttons.setLayout(new GridLayout(2, 1));
		JButton start = new JButton("START");
		JButton stop = new JButton("STOP");
		buttons.add(start);
		buttons.add(stop);
		
		card1.setBackground(green);
		card2.setBackground(green);
		card3.setBackground(green);
		card4.setBackground(green);
		card5.setBackground(green);
		
		down.add(new Label());
		down.add(card1);
		down.add(card2);
		down.add(card3);
		down.add(card4);
		down.add(card5);
		down.add(new Label());
		down.add(buttons);
		start.addActionListener(new StartL());
		stop.addActionListener(new StopL());
	}

	public class StartL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			newGame = new Game();
			setIcons();
			variant.setText(MyLine.placeCenter("Twój uk³ad to : "+newGame.getPlayer().showVariant(), 90));
		}
	}
	
	public class StopL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			setBackIcons();
			variant.setText("");
		}
	}

	public static void main(String[] args) {
		new GameInFrameExample().setVisible(true);

	}

	public void setIcons() {
		card1.setIcon(newGame.getPlayer().getIcon(0));
		card2.setIcon(newGame.getPlayer().getIcon(1));
		card3.setIcon(newGame.getPlayer().getIcon(2));
		card4.setIcon(newGame.getPlayer().getIcon(3));
		card5.setIcon(newGame.getPlayer().getIcon(4));
	}
	
	public void setBackIcons(){
		
		card1.setIcon(cardBack);
		card2.setIcon(cardBack);
		card3.setIcon(cardBack);
		card4.setIcon(cardBack);
		card5.setIcon(cardBack);
	}

}
