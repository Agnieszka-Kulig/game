package okienko;


import javax.swing.ImageIcon;
import javax.swing.JButton;

import karty.Default;

public class CardButtons {

	public JButton[] buttons = new JButton[5];
	private int cardLenght = 118;
	private int cardHeight = 170;
	private int distanceBetweenCards = 50;
	private final ImageIcon cardBack = new ImageIcon(Default.PATH_SMALL+"back_black.jpg");

	public CardButtons(int frameLength, int frameHeight) {

		createButtons(frameLength, frameHeight);
	}

	private void createButtons(int frameLength, int frameHeight) {

		int middleCardX = (frameLength - cardLenght) / 2;
		int firstCardX = middleCardX - 2 * distanceBetweenCards;

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(cardBack);
			buttons[i].setBounds(firstCardX + i * distanceBetweenCards, (frameHeight + 300) / 2, cardLenght,
					cardHeight);
		}
	}

	public void setBackIcons() {
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].setIcon(cardBack);
		}
	}

	public void setDefaultPosition(int frameHeight) {
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].setLocation(buttons[i].getLocation().x, (frameHeight + 300) / 2);
		}
	}

	public JButton get(int index) {
		return buttons[index];
	}

	public JButton[] getAll() {
		return buttons;
	}

}
