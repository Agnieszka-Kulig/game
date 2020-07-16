package uk³ady;

import karty.Figure;

public class FullHous  extends Variant {
	
	private Figure trips;
	private Figure pair;
	
	
	public FullHous(int[] handID) {
		
		int index = findIndex(handID, 3, 1);
		trips = figures.getFigure(index);
		
		index = findIndex(handID, 2, 1);
		pair = figures.getFigure(index);
	}

	@Override
	public String showVariant() {
		return "FULL HOUSE ["+trips.getCharFigure()+"] na ["+pair.getCharFigure()+"]";
	}

}
