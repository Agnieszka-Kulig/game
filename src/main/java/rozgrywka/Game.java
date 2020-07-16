package rozgrywka;

import uczestnicy.Dealer;
import uczestnicy.Player;

public class Game {

	private Dealer dealer = new Dealer();
	private Player player = new Player();

	public Game() {
		giveFiveCardsTo(player);
	}

	private void giveFiveCardsTo(Player player) {
		dealer.giveFiveCardsTo(player);
		player.setVariant();
	}

	public Dealer getDealer() {
		return dealer;
	}

	public Player getPlayer() {
		return player;
	}
		
}
