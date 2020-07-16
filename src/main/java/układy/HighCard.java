package uk³ady;

import karty.Figure;

public class HighCard  extends Variant {
	
	private Figure high1;

	public HighCard(int[] handID) {
		
		int index = findIndex(handID, 1, 1);
		high1 = figures.getFigure(index);
		
	}

	@Override
	public String showVariant() {
		return "WYSOKA KARTA ["+high1.getCharFigure()+"]";
	}

}
