package uczestnicy;

import javax.swing.ImageIcon;

import karty.Card;
import konsola.MyLine;

public class Player {

	private Hand hand = new Hand();
	public boolean[] toChange = new boolean[5];

	public Card getCardFromHand(int index) {
		return hand.getCards()[index];
	}

	public Card[] getHand() {
		return hand.getCards();
	}

	public void setVariant() {
		hand.setVariant();
	}

	public String showVariant() {
		return hand.showVariant();
	}

	public void replaceCard(Dealer dealer, int index) {
		dealer.addCard(getCardFromHand(index));
		dealer.giveCardTo(this, index);
	}

	public void replaceCards(Dealer dealer) {
		for (int index = 0; index < 5; index++) {
			if (toChange[index] == true) {
				dealer.addCard(getCardFromHand(index));
				dealer.giveCardTo(this, index);
			}
		}
	}

	public void printHand() {

		printVariant();
		String cards = "";
		for (Card card : getHand()) {
			cards = cards + (card.getCard() + " ");
		}
		MyLine.placeCenter(cards);
		String indexes = "";
		for (int i = 1; i <= getHand().length; i++) {
			indexes = indexes + "  " + i + "   ";
		}
		MyLine.placeCenter(indexes);
		System.out.println();
	}

	public void printSpecificCards(int... indexes) {

		String cards = "";
		for (int index : indexes) {
			cards = cards + (getCardFromHand(index - 1).getCard() + " ");
		}
		MyLine.placeCenter(cards);
		System.out.println();
	}

	private void printVariant() {
		MyLine.placeCenter("Obecny uk³ad: " + showVariant() + "\n");
	}

	public ImageIcon getIcon(int index) {
		return hand.getIcon(index);
	}

}
