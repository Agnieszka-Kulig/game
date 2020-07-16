package okienko;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import karty.Default;
import konsola.MyLine;
import rozgrywka.Game;

public class OnePlayerGame extends JFrame {

	private static final long serialVersionUID = 1L;
	public Game newGame = new Game();
	public int frameLength = 1200;
	public int frameHeight = 840;

	public CardButtons buttons = new CardButtons(frameLength, frameHeight);
	public Button change = new ChangeButton(frameLength, frameHeight);
	public MenuButtons menuButtons = new MenuButtons(frameLength, frameHeight);
	public Button start = menuButtons.get(0);
	public Button stop = menuButtons.get(1);

	private MyLabels myLabels = new MyLabels(frameLength, frameHeight);
	public Label variant = new VariantLabel(frameLength, frameHeight);

	Font variantFont = new Font("Times Roman", Font.BOLD, 30);

	ImageIcon pokerLayout = new ImageIcon(Default.PATH + "layout_blue2.jpg");

	public OnePlayerGame() {
		super("Poker");

		setSize(frameLength, frameHeight);
		setLocation(200, 0);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());
		setContentPane(new JLabel(pokerLayout));

		add(myLabels.getUpRightL());
		add(myLabels.getUpMiddleL());
		add(myLabels.getUpLeftL());
		add(myLabels.getDealerL());
		add(myLabels.getNegreanuL());

		add(variant);
		add(start);
		start.addActionListener(new StartL());
		add(stop);
		stop.setEnabled(false);
		stop.addActionListener(new StopL());
		add(change);
		change.addActionListener(new ChangeL());
		addCardButtons();
		addCardsButtonsAL();
	
	}

	public static void main(String[] args) {
		new OnePlayerGame().setVisible(true);

	}

	public void setIcons() {

		for (int i = 0; i < buttons.getAll().length; i++) {
			buttons.get(i).setIcon(newGame.getPlayer().getIcon(i));
		}
	}

	private void addCardButtons() {
		for (int i = 1; i <= buttons.getAll().length; i++) {
			int index = buttons.getAll().length - i;
			add(buttons.get(index));
			buttons.get(index).setOpaque(false);
		}
	}
	
	private void addCardsButtonsAL() {
		for (int i = 0; i < 5; i++) {
			buttons.get(i).addActionListener(new PickCard(i));
		}
	}

	public class StartL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			newGame = new Game();
			setIcons();
			variant.setText(MyLine.placeCenter("Twój uk³ad to : " + newGame.getPlayer().showVariant(), 60));
			change.setEnabled(true);
			change.setVisible(true);
			start.setEnabled(false);
			stop.setEnabled(true);
			buttons.setDefaultPosition(frameHeight);
		}
	}

	private class PickCard implements ActionListener {
		int index;

		public PickCard(int i) {
			index = i;
		}

		public void actionPerformed(ActionEvent e) {
			
			int X = buttons.get(index).getLocation().x;
			int Y = buttons.get(index).getLocation().y;
			if (Y == (frameHeight + 300) / 2) {
				newGame.getPlayer().toChange[index] = true;
				buttons.get(index).setLocation(X, Y - 60);
			} else {
				newGame.getPlayer().toChange[index] = false;
				buttons.get(index).setLocation(X, (frameHeight + 300) / 2);
			}
		}
	}

	public class StopL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			start.setEnabled(true);
			stop.setEnabled(false);
			change.setEnabled(false);
			change.setVisible(false);
			buttons.setBackIcons();
			buttons.setDefaultPosition(frameHeight);
			variant.setText("");
		}
	}
	
	public class ChangeL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			newGame.getPlayer().replaceCards(newGame.getDealer());
			setIcons();
			start.setEnabled(false);
			stop.setEnabled(true);
			buttons.setDefaultPosition(frameHeight);
			variant.setText(MyLine.placeCenter("Twój uk³ad to : " + newGame.getPlayer().showVariant(), 60));
			newGame.getPlayer().toChange = new boolean[5];
		}
	}

}
