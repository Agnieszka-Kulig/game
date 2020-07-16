package uczestnicy;

public class Main {

	public static void main(String[] args) {
		
		Dealer dealer = new Dealer();
		Player player = new Player();
		dealer.giveCardTo(player, 5);
		player.printHand();
		
	}
}
