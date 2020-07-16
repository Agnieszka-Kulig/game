package uczestnicy;

import javax.swing.ImageIcon;

import karty.Card;
import uk�ady.FullHous;
import uk�ady.HighCard;
import uk�ady.Pair;
import uk�ady.Quads;
import uk�ady.Straight;
import uk�ady.Trips;
import uk�ady.TwoPair;
import uk�ady.Variant;

public class Hand {

	private Card[] hand = new Card[5];
	private Variant variant;

	public void setVariant() {
		
		int[] handID = HandClassifier.getHandId(this);
		int handRank = HandClassifier.getHandRank(this);

		if (handRank == 11 && checkIfStraight(handID)) {
			variant = new Straight(handID);
		} else if(handRank == 11){
			variant = new HighCard(handID);
		} else if (handRank == 22) {
			variant = new Pair(handID);
		} else if (handRank == 23) {
			variant = new TwoPair(handID);
		} else if (handRank == 33) {
			variant = new Trips(handID);
		} else if (handRank == 34) {
			variant = new FullHous(handID);
		} else if (handRank == 44) {
			variant = new Quads(handID);
		}
	}

	public String showVariant() {
		setVariant();
		return variant.showVariant();
	}


	public Card[] getCards() {
		return hand;
	}

	
	public boolean checkIfStraight(int[] handID){
		int index = Variant.findIndex(handID, 0 , 1);
		return ( index==0 || index==5 );
	}
	
	public ImageIcon getIcon(int index){
		return getCards()[index].getIcon();
	}
	
	public int length(){
		return hand.length;
	}

}
