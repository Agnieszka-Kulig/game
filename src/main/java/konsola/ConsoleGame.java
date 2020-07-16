package konsola;

import java.util.InputMismatchException;
import java.util.Scanner;

import rozgrywka.Game;

public class ConsoleGame {

	public static void startGame() {

		Game game = new Game();
		Scanner sc = new Scanner(System.in);
		IntroOutput();
		sc.nextLine();

		game.getPlayer().printHand();
		replaceCardsContent(game, sc);
		printLine();
		System.out.println();
		game.getPlayer().printHand();

		sc.close();

	}

	private static void IntroOutput() {
		System.out.println();
		MyLine.placeCenter("GRA W POKERA\n");
		MyLine.placeCenter("Odmiana: Five-card Draw\n");
		printLine();
	}

	private static void replaceCardsContent(Game game, Scanner sc) {

		System.out.println("Ile chcia³byœ wymieniæ kart (od 0 do 5) ?");

		try {
			int nrOfCards = Integer.parseInt(sc.next());
			int index = 0;
			if (nrOfCards > 0 && nrOfCards < 5) {

				System.out.println("Podaj po spacji numery kart, które chcesz wymieniæ.");
				String oldCards = "";
				String newCards = "";

				for (int i = 0; i < nrOfCards; i++) {
					index = sc.nextInt();
					oldCards = oldCards + " " + game.getPlayer().getCardFromHand(index - 1).getCard();
					game.getPlayer().replaceCard(game.getDealer(), index - 1);
					newCards = newCards + " " + game.getPlayer().getCardFromHand(index - 1).getCard();
				}

				MyLine.placeCenter("Stare karty : " + oldCards);
				System.out.println();
				MyLine.placeCenter(" Nowe karty : " + newCards);
				System.out.println();

			} else {
				for (int i = 0; i < nrOfCards; i++) {
					game.getPlayer().replaceCard(game.getDealer(), i);
				}
			}
		} catch (NumberFormatException e) {
			System.out.println("Podaj liczbê od 0 do 5 !");
		} catch (InputMismatchException e) {

		}

	}

	private static void printLine() {
		String line = "";
		for (int i = 0; i < 72; i++) {
			line += "-";
		}
		System.out.println(line);
	}

}
