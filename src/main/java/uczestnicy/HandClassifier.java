package uczestnicy;

import karty.Card;

public class HandClassifier {

	public static int getHandRank(Hand hand) {
		
		int[] handId = getHandId(hand);
		int handRank = 10 * max(handId) + countZeros(handId);
		return handRank;
	}

	private static int max(int[] handId) {
		int max = handId[0];
		for (int i = 1; i < handId.length; i++) {
			if (handId[i] > max) {
				max = handId[i];
			}
		}
		return max;
	}

	private static int countZeros(int[] handId) {
		int count = 0;
		for (int i = 0; i < handId.length; i++) {
			if (handId[i] == 0) {
				count++;
			}
		}
		return count;
	}

	public static int[] getHandId(Hand hand) {

		int[] handId = new int[6];
		int count;
		int rank = Card.HA.getRank();
		for (int i = 0; i < handId.length; i++) {
			count = 0;
			for (int j = 0; j < hand.length(); j++) {
				if (hand.getCards()[j].getRank() == rank) {
					count++;
				}
			}
			handId[i] = count;
			rank++;
		}
		return handId;
	}

}
