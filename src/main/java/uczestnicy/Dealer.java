package uczestnicy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import karty.Card;

public class Dealer {

	private List<Card> deck = new ArrayList<>();

	public Dealer() {

		deck.add(Card.C9);
		deck.add(Card.D9);
		deck.add(Card.S9);
		deck.add(Card.H9);
		deck.add(Card.CT);
		deck.add(Card.DT);
		deck.add(Card.ST);
		deck.add(Card.HT);
		deck.add(Card.CJ);
		deck.add(Card.DJ);
		deck.add(Card.SJ);
		deck.add(Card.HJ);
		deck.add(Card.CQ);
		deck.add(Card.DQ);
		deck.add(Card.SQ);
		deck.add(Card.HQ);
		deck.add(Card.CK);
		deck.add(Card.DK);
		deck.add(Card.SK);
		deck.add(Card.HK);
		deck.add(Card.CA);
		deck.add(Card.DA);
		deck.add(Card.SA);
		deck.add(Card.HA);

		this.shuffle();
	}

	public void shuffle() {

		Random r = new Random();
		List<Card> deckOfCards = new ArrayList<>();
		int size = deck.size();

		for (int j = 0; j < size; j++) {
			int randomIndex = r.nextInt(deck.size());
			deckOfCards.add(deck.remove(randomIndex));
		}
		deck = deckOfCards;
	}
	
	public void giveCardTo(Player player, int index){
		player.getHand()[index] = deck.remove(0);
	}
	
	public void giveFiveCardsTo(Player player){
		for(int i = 0 ; i < 5 ; i++){
			giveCardTo(player, i);
		}
	}
	
	public void addCard(Card card){
		deck.add(card);
	}

}
